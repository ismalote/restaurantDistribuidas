
package org.servidor.dao;

import org.hibernate.Session;
import org.repositorio.exceptions.SaveFailedException;
import org.servidor.entities.CajaEntity;
import org.servidor.negocio.Caja;
import org.servidor.util.HibernateUtil;

public class CajaDAO {

	private static CajaDAO instancia;

	private CajaDAO() {

	}

	public static CajaDAO getInstancia() {
		if (instancia == null) {
			instancia = new CajaDAO();
		}
		return instancia;
	}

	public boolean save(Caja Caja) {
		CajaEntity entity = this.toEntity(Caja);
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.persist(entity);
			session.flush();
			session.getTransaction().commit();
			session.close();
		} catch (Exception e) {
			throw new SaveFailedException(e);
		}
		return true;
	}

	public CajaEntity toEntity(Caja c) {
		CajaEntity entity = new CajaEntity();
		entity.setIdCaja(c.getIdCaja());
//		entity.setCierre();
		
		return entity;
	}

//	public Caja obtenerCaja(int idCaja) {/

//		Session s = HibernateUtil.getSessionFactory().openSession();
	//	CajaEntity Caja = (CajaEntity) s.createQuery("FROM CajaEntity where idCaja = ?").setInteger(0, idCaja)
//				.uniqueResult();
//		Caja resultado = new Caja(Caja);
//		return resultado;

	//}

	public boolean existeCaja(int idCaja) {
		CajaEntity CajaEntity = getCajaEntity(idCaja);
		return CajaEntity != null;
	}

	//public Caja getCaja(int idCaja) {
	//	CajaEntity CajaEntity = getCajaEntity(idCaja);
		//Caja resultado = new Caja(CajaEntity);
		//return resultado;
//	}

	private CajaEntity getCajaEntity(int idCaja) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		CajaEntity CajaEntity = session.get(CajaEntity.class, idCaja);
		session.close();
		return CajaEntity;
	}

}
