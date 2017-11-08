package org.servidor.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.servidor.entities.ComandaEntity;
import org.servidor.entities.MozoEntity;
import org.servidor.entities.PlatoEntity;
import org.servidor.negocio.Comanda;
import org.servidor.negocio.ItemComanda;
import org.servidor.util.HibernateUtil;

public class ComandaDAO {

	private static ComandaDAO instancia;

	public static ComandaDAO getInstancia() {
		if (instancia == null) {
			instancia = new ComandaDAO();
		}
		return instancia;
	}

	public boolean save(Comanda comanda) {
		ComandaEntity entity = this.toEntity(comanda);
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.persist(entity);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

	public ComandaEntity toEntity(Comanda c) {
		ComandaEntity entity = new ComandaEntity();
		entity.setIdComanda(c.getIdComanda());
		entity.setComandaLista(c.getComandaLista());
		entity.setMozo(new MozoEntity(c.getMozo()));
		// entity.setFact(new FacturaEntity(c.getFact()));
		// entity.setMesa(new MesaEntity(c.getMesa()));
		List<PlatoEntity> p = new ArrayList<>();
		for (ItemComanda aux : c.getPlatos()) {
			// p.add(new PlatoEntity(aux)); // TODO
		}
		// entity.setPlatos(p); // TODO FIX
		return entity;

	}

	public boolean existeComanda(int idComanda) {
		ComandaEntity comandaEntity = getComandaEntity(idComanda);
		return comandaEntity != null;
	}

	public Comanda getComanda(int idComanda) {
		ComandaEntity comandaEntity = getComandaEntity(idComanda);
		return toNegocio(comandaEntity);
	}

	private ComandaEntity getComandaEntity(int idComanda) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		ComandaEntity comandaEntity = session.get(ComandaEntity.class, idComanda);
		session.close();
		return comandaEntity;
	}

	private Comanda toNegocio(ComandaEntity ce) {
		return null;
	}

}
