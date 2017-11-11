package org.servidor.controlador;

import java.util.List;

import org.repositorio.dtos.AgregarItemComandaDTO;
import org.repositorio.dtos.AgregarItemsComandaDTO;
import org.repositorio.dtos.CrearComandaDTO;
import org.repositorio.dtos.MesaCompuesta;
import org.repositorio.exceptions.ComandaNotFoundException;
import org.repositorio.exceptions.ItemComandaFailException;
import org.servidor.Enum.EstadoMesa;
import org.servidor.dao.ComandaDAO;
import org.servidor.dao.MesaDAO;
import org.servidor.dao.PlatoDAO;
import org.servidor.negocio.Comanda;
import org.servidor.negocio.Mesa;
import org.servidor.negocio.MesaSimple;
import org.servidor.negocio.Plato;

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
	
	public boolean AbrirMesa(List<Integer> nrosMesas) {
				
			if(nrosMesas.size()==1) {
				MesaSimple m= (MesaSimple) MesaDAO.getInstancia().obtenerMesaPorNumero(nrosMesas.get(0));
				m.setEstadoMesa(EstadoMesa.OCUPADA);
				m.save();
			}
			else {
				for (Integer integer : nrosMesas) {
					MesaCompuesta m= MesaDAO.getInstancia().obtenerMesaPorNumero(integer);
					m.setEstadoMesa(EstadoMesa.OCUPADA);
					m.save();
				}
				
			}
			return true;
			
			}
	
	public List>
	
}

