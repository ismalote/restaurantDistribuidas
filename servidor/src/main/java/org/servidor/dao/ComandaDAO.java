package org.servidor.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.repositorio.exceptions.SaveFailedException;
import org.servidor.entities.ComandaEntity;
import org.servidor.entities.PlatoEntity;
import org.servidor.negocio.Comanda;
import org.servidor.negocio.ItemComanda;
import org.servidor.util.HibernateUtil;

public class ComandaDAO {

	private static ComandaDAO instancia;

	private ComandaDAO() {

	}

	public static ComandaDAO getInstancia() {
		if (instancia == null) {
			instancia = new ComandaDAO();
		}
		return instancia;
	}

	public boolean save(Comanda comanda) {
		ComandaEntity entity = this.toEntity(comanda);
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

	public ComandaEntity toEntity(Comanda c) {
		ComandaEntity entity = new ComandaEntity();
		entity.setIdComanda(c.getIdComanda());
		entity.setCerrada(c.estaCerrada());
		entity.setMozo(MozoDAO.getInstancia().toEntity(c.getMozo()));
		entity.setCantidadComensales(c.getCantidadComensales());
		entity.setFecha(c.getFecha());
		// entity.setFact(new FacturaEntity(c.getFact()));
		entity.setMesa(MesaDAO.getInstancia().toEntity(c.getMesa()));
		List<PlatoEntity> p = new ArrayList<>();
		if (c.getPlatos() != null) {
			for (ItemComanda aux : c.getPlatos()) {
				// p.add(new PlatoEntity(aux)); // TODO
			}
		}
		// entity.setPlatos(p); // TODO FIX
		entity.setLocalRestaurante(LocalDAO.getInstance().toSimpleEntity(c.getLocal()));
		return entity;
	}

	public Comanda obtenerComanda(int idComanda) {

		Session s = HibernateUtil.getSessionFactory().openSession();
		ComandaEntity comanda = (ComandaEntity) s.createQuery("FROM ComandaEntity where idComanda = ?")
				.setInteger(0, idComanda).uniqueResult();
		Comanda resultado = new Comanda(comanda);
		return resultado;

	}

	public boolean existeComanda(int idComanda) {
		ComandaEntity comandaEntity = getComandaEntity(idComanda);
		return comandaEntity != null;
	}

	public Comanda getComanda(int idComanda) {
		ComandaEntity comandaEntity = getComandaEntity(idComanda);
		Comanda resultado = new Comanda(comandaEntity);
		return resultado;
	}

	private ComandaEntity getComandaEntity(int idComanda) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		ComandaEntity comandaEntity = session.get(ComandaEntity.class, idComanda);
		session.close();
		return comandaEntity;
	}

}
