package org.servidor.dao;

import org.servidor.entities.ItemComandaEntity;
import org.servidor.negocio.ItemComanda;

public class ItemComandaDAO {
	
	private static ItemComandaDAO instancia;
	
	private ItemComandaDAO() {
		
	}

	public static ItemComandaDAO getInstancia() {
		if(instancia==null) {
			instancia= new ItemComandaDAO();
		}
		return instancia;
	}

	


	public ItemComanda toNegocio(ItemComandaEntity entity) {
		ItemComanda resultado = new ItemComanda();
		resultado.setPlato(PlatoDAO.getInstancia().toNegocio(entity.getIdPlato()));
		return resultado;
	}
	
	

}
