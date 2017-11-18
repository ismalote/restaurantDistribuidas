package org.servidor.controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.repositorio.dtos.AbrirMesaDTO;
import org.repositorio.dtos.AgregarItemComandaDTO;
import org.repositorio.dtos.AgregarItemsComandaDTO;
import org.repositorio.dtos.CrearComandaDTO;
import org.repositorio.dtos.ItemComandaDTO;
import org.repositorio.dtos.MesaDTO;
import org.repositorio.dtos.ReservaDTO;
import org.repositorio.exceptions.ComandaNotFoundException;
import org.repositorio.exceptions.FacturaException;
import org.repositorio.exceptions.ItemComandaFailException;
import org.repositorio.exceptions.MesaNotFoundException;
import org.servidor.Enum.EstadoMesa;
import org.servidor.dao.ComandaDAO;
import org.servidor.dao.FacturaDAO;
import org.servidor.dao.MesaDAO;
import org.servidor.dao.PlatoDAO;
import org.servidor.negocio.Comanda;
import org.servidor.negocio.Factura;
import org.servidor.negocio.ItemComanda;
import org.servidor.negocio.Mesa;
import org.servidor.negocio.MesaCompuesta;
import org.servidor.negocio.MesaSimple;
import org.servidor.negocio.Plato;
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

	public static void setInstancia(Controlador instancia) {
		Controlador.instancia = instancia;
	}

	public Plato obtenerPlatoporId(int idPlato) {
		return PlatoDAO.getInstancia().obtenerProducto(idPlato);
	}

	public boolean crearNuevacomanda(CrearComandaDTO comanda) {
		Comanda aux = new Comanda(comanda);
		return aux.save();
	}

	public boolean agregarItemAComanda(AgregarItemComandaDTO item) {
		String method = "agregarItemAComanda(AgregarItemComandaDTO item)";

		Comanda comanda = getComanda(item.getIdComanda(), method);
		return comanda.agregarItem(item);
	}

	public AgregarItemsComandaDTO agregarItemsAComanda(AgregarItemsComandaDTO itemsComanda) {
		String method = "agregarItemsAComanda(AgregarItemsComandaDTO itemsComanda)";

		Comanda comanda = getComanda(itemsComanda.getIdComanda(), method);
		if (!comanda.agregarItems(itemsComanda)) {
			throw new ItemComandaFailException(method);
		}
		return itemsComanda;
	}

	public boolean cerrarComanda(int idComanda) {
		Comanda comanda = getComanda(idComanda, "cerrarComanda(int idComanda)");
		Factura aux = getFacturaComanda (idComanda);
		if(aux != null ){
			throw new FacturaException("Ya existe la factura para la comanda");
		}
		
		double precio = comanda.montoTotal();
		aux = new Factura("", precio, comanda);
		aux.save();
		return comanda.cerrarComanda();

	}

	private Comanda getComanda(int idComanda, String method) {
		Comanda comanda = ComandaDAO.getInstancia().getComanda(idComanda);
		if (comanda == null) {
			throw new ComandaNotFoundException();
		}
		return comanda;
	}

	private Factura getFacturaComanda(int idComanda) {
		Factura fact= FacturaDAO.getInstancia().getFactura(idComanda);
		if (fact == null) {
			throw new FacturaException("");
		}
		return fact;
	}

	public void AbrirMesa(AbrirMesaDTO dto) {

		List<Integer> nrosMesas = new ArrayList<>();
		nrosMesas.addAll(dto.getNumerodeMesa());
		if (nrosMesas.size() == 1) {
			MesaSimple m = MesaDAO.getInstancia().obtenerMesaSimplePorNumero(nrosMesas.get(0));
			m.setEstadoMesa(EstadoMesa.OCUPADA);
			m.save();
		} else {
			List<Mesa> m = new ArrayList<Mesa>();
			for (Integer numero : nrosMesas) {
				m.add(MesaDAO.getInstancia().obtenerMesaPorNumero(numero));

			}
			MesaCompuesta mc = new MesaCompuesta();
			mc.setMesas(m);
			mc.setCantidadSillas(mc.getCantidadSillas());
			mc.setEstadoMesa(EstadoMesa.OCUPADA);
			mc.setHoraLiberacion(null);
			mc.setHoraOcupacion(new Date());
			mc.setReserva(new Reserva());
			mc.save();

		}

	}

	public void cerrarMesa(int idMesa) {
		String method = "cerrarMesa(int idMesa)";
		Mesa mesa = getMesa(idMesa, method);
		mesa.cerrarMesa();
	}

	public boolean reservarMesa(ReservaDTO dto) {
		Reserva nuevaReserva = new Reserva(dto);
		return nuevaReserva.save();
	}

	private Mesa getMesa(int idMesa, String method) {
		Mesa mesa = MesaDAO.getInstancia().obtenerMesaPorNumero(idMesa);
		if (mesa == null) {
			throw new MesaNotFoundException(method);
		}
		return mesa;
	}

	public List<MesaDTO> mesasLibres(Integer numeroSector) {
		List<MesaDTO> mesas = new ArrayList<MesaDTO>();
		List<Mesa> resultado = MesaDAO.getInstancia().obtenerMesasPorSector(numeroSector);
		for (Mesa mesa : resultado) {
			mesas.add(mesa.toDTO());
		}
		return mesas;
	}

	public List<ItemComandaDTO> listarPedidos(int idComanda) {
		Comanda c = ComandaDAO.getInstancia().obtenerComanda(idComanda);
		List<ItemComandaDTO> resultado = new ArrayList<>();
		for (ItemComanda item : c.getPlatos()) {
			resultado.add(item.toDTO(item));

		}
		return resultado;
	}

}
