package org.servidor.objetoRemoto;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
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
import org.repositorio.exceptions.ComandaNotFoundException;
import org.repositorio.exceptions.EstadoItemComandaInvalidoException;
import org.repositorio.exceptions.MesaNotFoundException;
import org.repositorio.interfaces.IAppRemote;
import org.servidor.controlador.Controlador;

public class ObjetoRemoto extends UnicastRemoteObject implements IAppRemote {

	private static final long serialVersionUID = 1L;

	private Controlador controlador;

	public ObjetoRemoto() throws RemoteException {
		super();
		this.controlador = Controlador.getInstancia();
	}

	public boolean crearComanda(CrearComandaDTO comanda) throws RemoteException {
		return this.controlador.crearNuevacomanda(comanda);
	}

	public boolean agregarItemAComanda(AgregarItemComandaDTO item) throws ComandaNotFoundException {
		return this.controlador.agregarItemAComanda(item);
	}

	public AgregarItemsComandaDTO agregarItemsAComanda(AgregarItemsComandaDTO item) throws RemoteException {
		return this.controlador.agregarItemsAComanda(item);
	}

	public boolean cerrarcomanda(int idComanda) throws RemoteException {
		return this.controlador.cerrarComanda(idComanda);
	}

	public void cerrarMesa(int idMesa) throws RemoteException {
		this.controlador.cerrarMesa(idMesa);
	}

	public MesaDTO abrirMesa(AbrirMesaDTO dto) throws RemoteException {
		return Controlador.getInstancia().AbrirMesa(dto);
	}

	public List<MesaDTO> mesasLibres() throws MesaNotFoundException {
		return Controlador.getInstancia().mesasLibres();
	}

	public List<ItemComandaDTO> listarItemComanda(int idComanda) {
		return Controlador.getInstancia().listarPedidos(idComanda);
	}

	public void cambiarItemCRECLAMADO(int idItemComanda) throws EstadoItemComandaInvalidoException {
		Controlador.getInstancia().cambiarItemCRECLAMADO(idItemComanda);
	}

	public void cambiarItemCLISTO(int idItemComanda) throws EstadoItemComandaInvalidoException {
		Controlador.getInstancia().cambiarItemCLISTO(idItemComanda);

	}

	public void cambiarItemCPRODUCCION(int idItemComanda) {
		Controlador.getInstancia().cambiarItemCProduccion(idItemComanda);

	}

	// Se cambio por otro sin local
	public List<ItemComandaDTO> PedidoXSector(Integer idArea, Integer idLocal) {
		// se cambio el nombre en el controlador, era la de la super query
		// Controlador.getInstancia().obtenerPlatosAProducir(idArea, idLocal);
		return null;
	}

	@Override
	public boolean reservarMesa(Integer cantidadComensales, String descripcion, Date fechaHora) throws RemoteException {
		return Controlador.getInstancia().reservarMesa(new ReservaDTO(fechaHora, cantidadComensales, descripcion));
	}

	@Override
	public List<ProductosAPedirDTO> listarProductosParaPedir() throws RemoteException {
		return Controlador.getInstancia().listarProductosParaPedir();
	}

	@Override
	public List<PlatoMenuDTO> platosDelMenu() throws RemoteException {
		return Controlador.getInstancia().platosDelMenu();
	}

	@Override
	public void pedirPorductos(String area, List<ProductosAPedirDTO> prods) throws RemoteException {
		Controlador.getInstancia().pedirPorductos(area, prods);
	}

	@Override
	public void finalizarPlato(Integer idItemComanda) throws RemoteException {
		Controlador.getInstancia().finalizarPlato(idItemComanda);

	}

	@Override
	public void aprobarCompra(Integer idCompra) throws RemoteException {
		Controlador.getInstancia().aprobarCompra(idCompra);

	}

	@Override
	public void rechazarCompra(Integer idCompra) throws RemoteException {
		Controlador.getInstancia().rechazarCompra(idCompra);

	}

	public boolean cerrarCaja(Integer idLocal, Float monto) throws RemoteException {
		return Controlador.getInstancia().cerrarCaja(idLocal, monto);
	}

	public ObtenerPlatoDto obtenerPlatoporId(int idPlato) throws RemoteException {
		return Controlador.getInstancia().obtenerPlatoporId(idPlato);

	}

	@Override
	public List<ListadoComprasDTO> listarComprasPedidas() throws RemoteException {
		return Controlador.getInstancia().listarComprasPedidas();
	}

	@Override
	public List<ItemListadoDTO> listarProdDePedido(Integer idListadoCompras) throws RemoteException {
		return Controlador.getInstancia().listarProdDePedido(idListadoCompras);
	}

	public void abrirCaja(Integer idLocal, Float monto) throws RemoteException {
		Controlador.getInstancia().abrirCaja(idLocal, monto);
	}

	@Override
	public MozoDTO getDatosMozo(int idMozo) {
		return controlador.obtenerDatosMozo(idMozo);
	}

	@Override
	public List<ComandaDTO> listarComandasMozo(int idMozo) throws RemoteException {
		return this.controlador.listarComandas(idMozo);
	}

	@Override
	public void crearPlato(Integer area, String receta, List<Integer> ingredientes, String nombre, Float precio,
			Float comision) throws RemoteException {
		Controlador.getInstancia().crearPlato(area, receta, ingredientes, nombre, precio, comision);

	}

	@Override
	public List<ItemComandaDTO> obtenerPlatosAProducir(Integer idArea) throws RemoteException {
		return Controlador.getInstancia().obtenerPlatosAProducir(idArea);
	}
}