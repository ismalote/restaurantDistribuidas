package org.servidor.controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.repositorio.dtos.AbrirMesaDTO;
import org.repositorio.dtos.AgregarItemComandaDTO;
import org.repositorio.dtos.AgregarItemsComandaDTO;
import org.repositorio.dtos.CrearComandaDTO;
import org.repositorio.dtos.ItemComandaDTO;
import org.repositorio.exceptions.ComandaNotFoundException;
import org.repositorio.exceptions.ItemComandaFailException;
import org.repositorio.exceptions.MesaNotFoundException;
import org.servidor.Enum.EstadoMesa;
import org.servidor.dao.ComandaDAO;
import org.servidor.dao.MesaDAO;
import org.servidor.dao.PlatoDAO;
import org.servidor.dao.SectorDAO;
import org.servidor.negocio.Comanda;
import org.servidor.negocio.ItemComanda;
import org.servidor.negocio.Mesa;
import org.servidor.negocio.MesaCompuesta;
import org.servidor.negocio.MesaSimple;
import org.servidor.negocio.Plato;
import org.servidor.negocio.Reserva;
import org.servidor.negocio.Sector;

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
		return comanda.cerrarComanda();
	}

	private Comanda getComanda(int idComanda, String method) {
		Comanda comanda = ComandaDAO.getInstancia().getComanda(idComanda);
		if (comanda == null) {
			throw new ComandaNotFoundException();
		}
		return comanda;
	}

	public void AbrirMesa(AbrirMesaDTO dto) {
				
			List<Integer> nrosMesas= new ArrayList<>();
			nrosMesas.addAll(dto.getNumerodeMesa());
			if(nrosMesas.size()==1) {
				MesaSimple m=   MesaDAO.getInstancia().obtenerMesaSimplePorNumero(nrosMesas.get(0));
				m.setEstadoMesa(EstadoMesa.OCUPADA);
				m.save();
			}
			else {
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

	private Mesa getMesa(int idMesa, String method) {
		Mesa mesa = MesaDAO.getInstancia().obtenerMesaPorNumero(idMesa);
		if (mesa == null) {
			throw new MesaNotFoundException(method);
		}
		return mesa;
	}
	
	
	public AbrirMesaDTO mesasLibres(Integer numeroSector,Integer cantidadComensales){
		AbrirMesaDTO dto = new AbrirMesaDTO();
		List<Integer> resultado= SectorDAO.getInstancia().listarMesaLibrePorSector(numeroSector,cantidadComensales);
		dto.setNumerodeMesa(resultado);
		return dto;
		
	}
	
	public List<ItemComandaDTO> listarPedidos(int idComanda){
		List<ItemComanda>resultado = new ArrayList<>();
		resultado= ComandaDAO.getInstancia().allItems(idComanda);
		return 
	}
	
	
}
