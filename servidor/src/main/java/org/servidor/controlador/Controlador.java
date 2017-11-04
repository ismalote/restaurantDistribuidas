package org.servidor.controlador;

import org.repositorio.dtos.ComandaDTO;
import org.servidor.dao.ComandaDAO;
import org.servidor.dao.PlatoDAO;
import org.servidor.negocio.Comanda;
import org.servidor.negocio.Plato;

public enum Controlador {

	INSTANCE;
	
	public Plato obtenerPlatoporId(int idPlato) {

		return PlatoDAO.getInstancia().obtenerProducto(idPlato);

	}
	
	public boolean crearComanda(ComandaDTO comanda) {
		
	
		ComandaDAO.getInstancia().grabarComanda(new Comanda(comanda));
		
		
		
		return true;
		
		
	}

}
