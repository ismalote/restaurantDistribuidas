package org.servidor.dao;

import org.hibernate.Session;
import org.servidor.entities.ItemComandaEntity;
import org.servidor.negocio.ItemComanda;
import org.servidor.util.HibernateUtil;

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

	public ItemComanda obtenerItemComanda(int idItemComanda) {
		ItemComanda resultado = new ItemComanda();
		Session s = HibernateUtil.getSessionFactory().openSession();
		ItemComandaEntity entity = (ItemComandaEntity) s.createQuery("FROM ItemComandaEntity as e  where e.idItemComanda= ?").setInteger(0, idItemComanda).uniqueResult();
		 resultado = this.toNegocio(entity);
		 return resultado;
	}
					
	public void cambiarEstado( int idItemComanda) {
		
		
	}

	public void save() {
		ItemComandaEntity entity= new ItemComandaEntity();
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.persist(entity);
		session.flush();
		session.getTransaction().commit();
		session.close();
		
	}

	public ItemComanda toNegocio(ItemComandaEntity entity) {
		ItemComanda resultado = new ItemComanda();
		resultado.setPlato(PlatoDAO.getInstancia().toNegocio(entity.getPlato()));
		resultado.setEstado(entity.getEstado());
		resultado.setIdItemComanda(entity.getIdItemComanda());
		
		return resultado;
	}
	
	public ItemComandaEntity toEntity (ItemComanda comanda) {
		ItemComandaEntity entity = new ItemComandaEntity();
		entity.setPlato(PlatoDAO.getInstancia().obtenerProductoEntity(comanda.getPlato().getIdProducto()));
		entity.setIdItemComanda(comanda.getIdItemComanda());
		entity.setCantidad(comanda.getCantidad());
		entity.setEstado(comanda.getEstado());
		return entity;
	}

}
