package org.servidor.dao;

import org.servidor.entities.ItemComandaEntity;
import org.servidor.negocio.ItemComanda;

public class ItemComandaDAO {
	
	public static ItemComandaDAO instancia;
	
	
	public ItemComandaDAO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public static ItemComandaDAO getInstancia() {
		if(instancia==null) {
			instancia= new ItemComandaDAO();
		}
		return instancia;
	}

	public static void setInstancia(ItemComandaDAO instancia) {
		ItemComandaDAO.instancia = instancia;
	}


	public ItemComanda toNegocio(ItemComandaEntity entity) {
		ItemComanda resultado = new ItemComanda();
		resultado.setPlato(PlatoDAO.getInstancia().toNegocio(entity.getIdPlato()));
		return resultado;
	}
	
	

}
