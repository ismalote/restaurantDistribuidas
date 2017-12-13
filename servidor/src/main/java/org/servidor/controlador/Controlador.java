package org.servidor.controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.repositorio.dtos.AbrirMesaDTO;
import org.repositorio.dtos.AgregarItemComandaDTO;
import org.repositorio.dtos.AgregarItemsComandaDTO;
import org.repositorio.dtos.ComandaDTO;
import org.repositorio.dtos.CrearComandaDTO;
import org.repositorio.dtos.ItemComandaDTO;
import org.repositorio.dtos.ItemListadoDTO;
import org.repositorio.dtos.ListadoComprasDTO;
import org.repositorio.dtos.MesaDTO;
import org.repositorio.dtos.MozoDTO;
import org.repositorio.dtos.ObtenerPlatoDto;
import org.repositorio.dtos.PlatoMenuDTO;
import org.repositorio.dtos.ProductosAPedirDTO;
import org.repositorio.dtos.ReservaDTO;
import org.repositorio.exceptions.CajaNotFoundException;
import org.repositorio.exceptions.CajaYaCerradaException;
import org.repositorio.exceptions.ComandaNotFoundException;
import org.repositorio.exceptions.EstadoItemComandaInvalidoException;
import org.repositorio.exceptions.FacturaException;
import org.repositorio.exceptions.ItemComandaFailException;
import org.repositorio.exceptions.LocalNotFoundException;
import org.repositorio.exceptions.MesaNotFoundException;
import org.repositorio.exceptions.MesaOcupadaException;
import org.repositorio.exceptions.NoAlcanzaMesaException;
import org.servidor.Enum.EstadoItemComanda;
import org.servidor.Enum.EstadoMesa;
import org.servidor.Enum.EstadoPedidoCompra;
import org.servidor.Enum.TipoArea;
import org.servidor.dao.AreaDAO;
import org.servidor.dao.CajaDAO;
import org.servidor.dao.ComandaDAO;
import org.servidor.dao.FacturaDAO;
import org.servidor.dao.ItemComandaDAO;
import org.servidor.dao.ListadoCompraDAO;
import org.servidor.dao.LocalDAO;
import org.servidor.dao.MesaDAO;
import org.servidor.dao.MozoDAO;
import org.servidor.dao.PlatoDAO;
import org.servidor.dao.ProductoComestibleDAO;
import org.servidor.negocio.AreaProduccion;
import org.servidor.negocio.Caja;
import org.servidor.negocio.CierredeCaja;
import org.servidor.negocio.Comanda;
import org.servidor.negocio.Factura;
import org.servidor.negocio.ItemComanda;
import org.servidor.negocio.ItemListado;
import org.servidor.negocio.ListadoCompras;
import org.servidor.negocio.Local;
import org.servidor.negocio.Mesa;
import org.servidor.negocio.MesaCompuesta;
import org.servidor.negocio.Mozo;
import org.servidor.negocio.Plato;
import org.servidor.negocio.ProductoComestible;
import org.servidor.negocio.Reserva;

/**
 * Controlador de Negocio: Recibe Unicamente objetos DTO o bien primitivos.
 * Nunca Negocio.
 * 
 * @author Juan
 *
 */
public class Controlador {

	private static Controlador instancia;

	public Controlador() {

	}

	public static Controlador getInstancia() {
		if (instancia == null) {
			instancia = new Controlador();
		}
		return instancia;
	}

	public ObtenerPlatoDto obtenerPlatoporId(int idPlato) {

		Plato aux = PlatoDAO.getInstancia().obtenerPlato(idPlato);
		ObtenerPlatoDto plato = new ObtenerPlatoDto(aux.getIdPlato(), aux.getPrecio(), aux.getNombrePlato());
		return plato;
	}

	public boolean crearNuevacomanda(CrearComandaDTO comanda) {
		Comanda aux = new Comanda(comanda);
		return aux.save();
	}

	public boolean agregarItemAComanda(AgregarItemComandaDTO item) throws ComandaNotFoundException {
		String method = "agregarItemAComanda(AgregarItemComandaDTO item)";

		Comanda comanda = getComanda(item.getIdComanda(), method);
		return comanda.agregarItem(item);
	}

	// TODO recordar que se tiene que mapear de PlatoMenuDTO a ItemComandaDTO, solo
	// idPlato
	public AgregarItemsComandaDTO agregarItemsAComanda(AgregarItemsComandaDTO itemsComanda)
			throws ComandaNotFoundException {
		String method = "agregarItemsAComanda(AgregarItemsComandaDTO itemsComanda)";

		Comanda comanda = getComanda(itemsComanda.getIdComanda(), method);
		if (!comanda.agregarItems(itemsComanda)) {
			throw new ItemComandaFailException(method);
		}
		return itemsComanda;
	}

	public boolean cerrarComanda(int idComanda) throws FacturaException, ComandaNotFoundException {
		Comanda comanda = getComanda(idComanda, "cerrarComanda(int idComanda)");
		Factura aux = getFacturaComanda(idComanda);
		if (aux != null) {
			throw new FacturaException("Ya existe la factura para la comanda");
		}

		float precio = comanda.montoTotal();
		aux = new Factura("", precio, comanda);
		aux.save();
		if(comanda.cerrarComanda()) {
			comanda.getMesa().cerrarMesa();
		}
		return false;
	}

	private Comanda getComanda(int idComanda, String method) throws ComandaNotFoundException {
		Comanda comanda = ComandaDAO.getInstancia().getComanda(idComanda);
		if (comanda == null) {
			throw new ComandaNotFoundException(method);
		}
		return comanda;
	}

	private Factura getFacturaComanda(int idComanda) {
		return FacturaDAO.getInstancia().getFactura(idComanda);
	}

	public MesaDTO AbrirMesa(AbrirMesaDTO dto) throws NoAlcanzaMesaException, MesaOcupadaException {

		List<Integer> nrosMesas = dto.getNumerodeMesa();
		if (nrosMesas.size() == 1) {
			Mesa m = MesaDAO.getInstancia().obtenerMesaPorNumero(nrosMesas.get(0));
			if (m.getEstadoMesa() == EstadoMesa.LIBRE) {
				m.setEstadoMesa(EstadoMesa.OCUPADA);
				if (!m.entranComensales(dto.getCantComensales())) {
					throw new NoAlcanzaMesaException();
				}
				m.update();
				return m.toDTO();
			} else {
				throw new MesaOcupadaException();
			}
		} else {
			List<Mesa> m = new ArrayList<Mesa>();
			for (Integer numero : nrosMesas) {
				Mesa mesa = MesaDAO.getInstancia().obtenerMesaPorNumero(numero);
				if (mesa.getEstadoMesa() == EstadoMesa.LIBRE) {
					m.add(mesa);
				} else {
					throw new MesaOcupadaException();
				}
			}
			MesaCompuesta mc = new MesaCompuesta();
			mc.setMesas(m);
			mc.setCantidadSillas(mc.getCantidadSillas());
			mc.setEstadoMesa(EstadoMesa.OCUPADA);
			mc.setHoraLiberacion(new Date());
			mc.setHoraOcupacion(new Date());
			if (!mc.entranComensales(dto.getCantComensales())) {
				throw new NoAlcanzaMesaException();
			}
			int id = mc.save();
			mc.setIdMesa(id);
			
			return mc.toDTO();
		}
	}

	public void cerrarMesa(int idMesa) throws MesaNotFoundException {
		String method = "cerrarMesa(int idMesa)";
		Mesa mesa = getMesa(idMesa, method);
		mesa.cerrarMesa();
	}

	public boolean reservarMesa(ReservaDTO dto) {
		Reserva nuevaReserva = new Reserva(dto);
		return nuevaReserva.save();
	}

	private Mesa getMesa(int idMesa, String method) throws MesaNotFoundException {
		Mesa mesa = MesaDAO.getInstancia().obtenerMesaPorNumero(idMesa);
		if (mesa == null) {
			throw new MesaNotFoundException(method);
		}
		return mesa;
	}

	public List<MesaDTO> mesasLibres() throws MesaNotFoundException {
		List<MesaDTO> mesas = new ArrayList<MesaDTO>();
		List<Mesa> resultado = MesaDAO.getInstancia().obtenerMesasLibres();
		if (resultado != null && !resultado.isEmpty()) {
			for (Mesa mesa : resultado) {
				mesas.add(mesa.toDTO());
			}
			return mesas;
		}
		throw new MesaNotFoundException("No existen mesas disponibles");
	}

	public List<ItemComandaDTO> listarPedidos(int idComanda) {
		Comanda c = ComandaDAO.getInstancia().obtenerComanda(idComanda);
		List<ItemComandaDTO> resultado = new ArrayList<>();
		for (ItemComanda item : c.getPlatos()) {
			resultado.add(item.toDTO(item));

		}
		return resultado;
	}

	public void cambiarItemCProduccion(int idItemComanda) {

		ItemComanda item = ItemComandaDAO.getInstancia().obtenerItemComanda(idItemComanda);
		item.setEstado(EstadoItemComanda.PRODUCCION);
		item.save();
	}

	public void cambiarItemCLISTO(int idItemComanda) throws EstadoItemComandaInvalidoException {

		ItemComanda item = ItemComandaDAO.getInstancia().obtenerItemComanda(idItemComanda);
		if (item.getEstado() != EstadoItemComanda.PRODUCCION) {
			throw new EstadoItemComandaInvalidoException("El producto esta en produccion");
		}
		item.setEstado(EstadoItemComanda.LISTO);
		item.save();

	}

	public void cambiarItemCRECLAMADO(int idItemComanda) throws EstadoItemComandaInvalidoException {

		ItemComanda item = ItemComandaDAO.getInstancia().obtenerItemComanda(idItemComanda);
		if (item.getEstado() != EstadoItemComanda.LISTO) {
			throw new EstadoItemComandaInvalidoException("El producto esta Listo");
		}
		item.setEstado(EstadoItemComanda.RECLAMADO);
		item.save();

	}

	public List<ItemComandaDTO> obtenerPlatosAProducir(Integer idArea) {

		List<ItemComanda> items = ItemComandaDAO.getInstancia().obtenerItemAreaLocal(idArea);
		List<ItemComandaDTO> resultado = new ArrayList<ItemComandaDTO>();
		for (ItemComanda item : items) {
			resultado.add(item.toDTO(item));
		}

		return resultado;

	}

	// listar productos para hacer el pedido
	public List<ProductosAPedirDTO> listarProductosParaPedir() {

		List<ProductosAPedirDTO> productos = new ArrayList<ProductosAPedirDTO>();

		List<ProductoComestible> prodCom = ProductoComestibleDAO.getInstancia().listarProductos();
		for (ProductoComestible productoComestible : prodCom) {
			productos.add(productoComestible.toProdAPedirDTO());

		}

		return productos;
	}

	// listar platos que posee el menu
	public List<PlatoMenuDTO> platosDelMenu() {

		List<PlatoMenuDTO> menu = new ArrayList<PlatoMenuDTO>();

		List<Plato> platos = PlatoDAO.getInstancia().listarPlatos();
		for (Plato plato : platos) {
			menu.add(plato.toDTOMenu());
		}

		return menu;
	}

	public void crearPlato(Integer area, String receta, List<Integer> ingredientes, String nombre, Float precio,
			Float comision) {
		List<ProductoComestible> ing = new ArrayList<ProductoComestible>();
		for (Integer inte : ingredientes) {
			ProductoComestible prod = ProductoComestibleDAO.getInstancia().obtenerProducto(inte);
			ing.add(prod);
		}
		AreaProduccion areaProd = AreaDAO.getInstancia().obtenerArea(area);

		Plato plato = new Plato(nombre, ing, precio, comision, areaProd, receta);

		plato.save();

	}

	// pedidoDeProdDesdeArea
	public void pedirPorductos(String area, List<ProductosAPedirDTO> prods) {
		List<ItemListado> prod = new ArrayList<ItemListado>();
		for (ProductosAPedirDTO p : prods) {
			prod.add(new ItemListado(ProductoComestibleDAO.getInstancia().obtenerProducto(p.getIdProd()),
					p.getCantAPedir()));
		}

		ListadoCompras compras = new ListadoCompras(TipoArea.valueOf(area), prod, EstadoPedidoCompra.PEDIDO);

		compras.save();

	}

	// cambiarEstadoPedidoListo
	public void finalizarPlato(Integer idItemComanda) {
		ItemComanda comanda = ItemComandaDAO.getInstancia().obtenerItemComanda(idItemComanda);
		comanda.setEstado(EstadoItemComanda.LISTO);
		comanda.save();
	}

	// AceptarPedido
	public void aprobarCompra(Integer idCompra) {
		ListadoCompras listado = ListadoCompraDAO.getInstancia().obtenerListadoCompra(idCompra);
		listado.setEstado(EstadoPedidoCompra.ACEPTADO);
		listado.save();
	}

	// RechazarPedido
	public void rechazarCompra(Integer idCompra) {
		ListadoCompras listado = ListadoCompraDAO.getInstancia().obtenerListadoCompra(idCompra);
		listado.setEstado(EstadoPedidoCompra.RECHAZADO);
		listado.save();
	}

	public boolean cerrarCaja(Integer idLocal, Float monto)
			throws LocalNotFoundException, CajaNotFoundException, CajaYaCerradaException {

		Local local = this.getLocal(0, "calcularComisiones(int idLocal)");

		Caja caja = this.getCaja(0, "cerrarCaja(int idCaja)");
		Date fecha = new Date();
		boolean cierre = true;
		Float comisiones = calcularComisiones(local);

		CierredeCaja aux = new CierredeCaja(cierre, fecha, caja, monto - caja.getMontoIncial());
		aux.setMontoComisiones(comisiones);
		return aux.cerrar();
	}

	public void abrirCaja(Float monto) throws LocalNotFoundException, CajaNotFoundException {

		Caja caja = this.getCaja(1, "abrirCaja(int idCaja)");
		caja.setMontoIncial(monto);
		caja.save();

	}

	private Caja getCaja(int idCaja, String method) throws CajaNotFoundException {
		Caja aux = CajaDAO.getInstancia().getCaja(idCaja);
		if (aux == null) {
			throw new CajaNotFoundException(method);
		}

		return aux;

	}

	private Float calcularComisiones(Local local) {
		float totalMozos = 0;
		float totalPorMozo = 0;
		float totalComisionExtra = 0;
		// Local local = instancia.getInstancia().getLocal(idLocal,
		// "calcularComisiones(int idLocal)");
		List<Mozo> mozos = local.getMozos();
		List<Comanda> comandasMozo;
		for (Mozo m : mozos) {
			comandasMozo = new ArrayList<Comanda>();
			comandasMozo = ComandaDAO.getInstancia().getComandasMozo(m.getIdMozo());
			for (Comanda c : comandasMozo) {
				totalPorMozo = c.montoTotalComision() * m.getPorcentajeComision();
				totalComisionExtra = c.montoTotalComisionExtra();

			}
			totalMozos = totalMozos + totalPorMozo + totalComisionExtra;
			totalPorMozo = 0;
			totalComisionExtra = 0;
		}

		return totalMozos;
	}

	private Local getLocal(int idLocal, String method) throws LocalNotFoundException {
		Local aux = LocalDAO.getInstance().findById(idLocal);
		if (aux == null) {
			throw new LocalNotFoundException(method);
		}

		return aux;
	}

	// listar todos los pedidos de las areas (lo ve el admin)
	public List<ListadoComprasDTO> listarComprasPedidas() {

		List<ListadoComprasDTO> pedidoCompra = new ArrayList<ListadoComprasDTO>();

		List<ListadoCompras> pedidos = ListadoCompraDAO.getInstancia().listarPedidoCompras();
		for (ListadoCompras listado : pedidos) {
			pedidoCompra.add(listado.toDTO());
		}

		return pedidoCompra;
	}

	// cuando se selecciona uno de los pedidos, te muestra los productos
	public List<ItemListadoDTO> listarProdDePedido(Integer idListadoCompras) {

		List<ItemListadoDTO> pedidoCompra = new ArrayList<ItemListadoDTO>();

		List<ItemListado> pedidos = ListadoCompraDAO.getInstancia().obtenerItemsAComprarDePedido(idListadoCompras);
		for (ItemListado prod : pedidos) {
			pedidoCompra.add(prod.toDTO());
		}

		return pedidoCompra;
	}

	public MozoDTO obtenerDatosMozo(int idMozo) {
		Mozo mozo = MozoDAO.getInstancia().obtenerMozo(idMozo);
		return mozo.toDTO();
	}

	public List<ComandaDTO> listarComandas(int idMozo) {
		List<Comanda> comandasMozo = ComandaDAO.getInstancia().getComandasMozo(idMozo);
		List<ComandaDTO> comandas = new ArrayList<>();
		for (Comanda comanda : comandasMozo) {
			comandas.add(comanda.toDTO());
		}
		return comandas;
	}
}
