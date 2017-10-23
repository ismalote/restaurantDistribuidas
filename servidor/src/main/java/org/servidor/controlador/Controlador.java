package org.servidor.controlador;

import org.repositorio.dtos.PlatoDTO;
import org.servidor.dao.PlatoDAO;
import org.servidor.negocio.Plato;

public class Controlador {
	
	
	
	public Plato obtenerPlatoporId(int idPlato) {
		
		return PlatoDAO.getInstancia().obtenerProducto(idPlato);
		
		
		
	}
	

}
