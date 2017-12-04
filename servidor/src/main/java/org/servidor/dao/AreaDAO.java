package org.servidor.dao;

import org.hibernate.Session;
import org.servidor.entities.AreaProduccionEntity;
import org.servidor.negocio.AreaProduccion;
import org.servidor.util.HibernateUtil;

public class AreaDAO {

	private static AreaDAO instancia;

	private AreaDAO() {
	}

	public static AreaDAO getInstancia() {
		if (instancia == null) {
			instancia = new AreaDAO();
		}
		return instancia;
	}
	

	
	public AreaProduccion obtenerArea(int id) {

		Session s = HibernateUtil.getSessionFactory().openSession();
		AreaProduccionEntity entity = (AreaProduccionEntity) s.createQuery("FROM AreaProduccionEntity as l  where l.idAreaProduccion= ?").setInteger(0, id).uniqueResult();
		
		return this.toNegocio(entity);
	}

	public AreaProduccion toNegocio(AreaProduccionEntity entity) {
		
		return new AreaProduccion(entity.getIdAreaProduccion(), entity.getTipoArea());
	}
	

}
