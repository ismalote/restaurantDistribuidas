package org.servidor.controlador;

import org.repositorio.dtos.AgregarItemComandaDTO;
import org.repositorio.dtos.CrearComandaDTO;
import org.repositorio.exceptions.ComandaNotFoundException;
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
		Comanda comanda;
		if ((comanda = ComandaDAO.getInstancia().getComanda(item.getIdComanda())) == null) {
			throw new ComandaNotFoundException("agregarItemAComanda(AgregarItemComandaDTO item)");
		}
		return comanda.agregarItem(item);
	}
}
