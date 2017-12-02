package org.servidor.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.repositorio.exceptions.SaveFailedException;
import org.servidor.entities.ComandaEntity;
import org.servidor.entities.ItemComandaEntity;
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
	
	public List<Comanda> getComandasMozo (Integer idMozo){
		List<Comanda> comanditas = new ArrayList<Comanda>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<ComandaEntity> list = (List<ComandaEntity>) session.createQuery("From ComandaEntity where mozo = ?")
				.setInteger(0, idMozo).list();
		for (ComandaEntity comandaEntity : list) {
			comanditas.add(toNegocio(comandaEntity));
		}
		
		return null;
	}
	
	public Comanda toNegocio (ComandaEntity c){
		Comanda aux = new Comanda();
		aux.setCantidadComensales(c.getCantidadComensales());
		aux.setFact(FacturaDAO.getInstancia().toNegocio(c.getFact()));
		aux.setFecha(c.getFecha());
		aux.setIdComanda(c.getIdComanda());
		aux.setLocal(LocalDAO.getInstance().toNegocio(c.getLocalRestaurante()));
		aux.setMesa(MesaDAO.getInstancia().toNegocio2(c.getMesa()));
		aux.setMozo(MozoDAO.getInstancia().toNegocio(c.getMozo()));
		List<ItemComanda> items = new ArrayList<>();
		List<ItemComandaEntity> entitys = c.getPlatos();
		for (ItemComandaEntity ic:  entitys){
			ItemComanda icomanda = ItemComandaDAO.getInstancia().toNegocio(ic);
			items.add(icomanda);
			
		}
		aux.setPlatos(items);
		aux.setCerrada(c.getCerrada());
		return aux;
	}
 
}
