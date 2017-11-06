package org.servidor.controlador;

import org.repositorio.dtos.CrearComandaDTO;
import org.servidor.dao.PlatoDAO;
import org.servidor.negocio.Comanda;
import org.servidor.negocio.Plato;

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

	public void crearNuevacomanda(CrearComandaDTO comanda) {

		Comanda aux = new Comanda(comanda);
		aux.save();

	}

}
