package org.servidor.dao;

import org.hibernate.Session;
import org.repositorio.exceptions.SaveFailedException;
import org.servidor.entities.FacturaEntity;
import org.servidor.negocio.Factura;
import org.servidor.util.HibernateUtil;

public class FacturaDAO {

	private static FacturaDAO instancia;

	private FacturaDAO() {

	}

	public static FacturaDAO getInstancia() {
		if (instancia == null) {
			instancia = new FacturaDAO();
		}
		return instancia;
	}

	public boolean save(Factura f) {
		FacturaEntity entity = this.toEntity(f);
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

	public FacturaEntity toEntity(Factura f) {
		FacturaEntity entity = new FacturaEntity();
		entity.setCliente(null);
		entity.setMontoTotal(f.getMontoTotal());
		entity.setComanda(ComandaDAO.getInstancia().toEntity(f.getComanda()));
		return entity;

	}

	public Factura obtenerFactura(int idComanda) {

		Session s = HibernateUtil.getSessionFactory().openSession();
		FacturaEntity fact = (FacturaEntity) s.createQuery("FROM FacturaEntity where idComanda = ?").setInteger(0, idComanda)
				.uniqueResult();
		Factura resultado = new Factura(fact);
		return resultado;

	}

	public boolean existeFactura(int idFactura) {
		FacturaEntity comandaEntity = getFacturaEntity(idFactura);
		return comandaEntity != null;
	}

	public Factura getFactura(int idFactura) {
		FacturaEntity factutaEntity = getFacturaEntity(idFactura);
		Factura resultado = new Factura(factutaEntity);
		return resultado;
	}

	private FacturaEntity getFacturaEntity(int idFactura) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		FacturaEntity facturaEntity = session.get(FacturaEntity.class, idFactura);
		session.close();
		return facturaEntity;
	}

}
