package org.servidor.controlador;

import org.repositorio.dtos.AgregarItemComandaDTO;
import org.repositorio.dtos.AgregarItemsComandaDTO;
import org.repositorio.dtos.CrearComandaDTO;
import org.repositorio.exceptions.ComandaNotFoundException;
import org.repositorio.exceptions.ItemComandaFailException;
import org.servidor.dao.ComandaDAO;
import org.servidor.dao.PlatoDAO;
import org.servidor.negocio.Comanda;
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
		Comanda comanda = ComandaDAO.getInstancia().getComanda(item.getIdComanda());
		if (comanda == null) {
			throw new ComandaNotFoundException("agregarItemAComanda(AgregarItemComandaDTO item)");
		}
		return comanda.agregarItem(item);
	}

	public AgregarItemsComandaDTO agregarItemsAComanda(AgregarItemsComandaDTO itemsComanda) {
		Comanda comanda = ComandaDAO.getInstancia().getComanda(itemsComanda.getIdComanda());
		if (comanda == null) {
			throw new ComandaNotFoundException("agregarItemsAComanda(AgregarItemsComandaDTO itemsComanda)");
		}
		if (!comanda.agregarItems(itemsComanda)) {
			throw new ItemComandaFailException("agregarItemsAComanda(AgregarItemsComandaDTO itemsComanda)");
		}
		return itemsComanda;
	}
}
