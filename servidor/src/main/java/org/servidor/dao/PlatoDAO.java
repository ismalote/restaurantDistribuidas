package org.servidor.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.repositorio.exceptions.SaveFailedException;
import org.servidor.entities.ListadoComprasEntity;
import org.servidor.entities.PlatoEntity;
import org.servidor.entities.ProductoComestibleEntity;
import org.servidor.negocio.ListadoCompras;
import org.servidor.negocio.Plato;
import org.servidor.negocio.ProductoComestible;
import org.servidor.util.HibernateUtil;

public class PlatoDAO {

	private static PlatoDAO instancia;

	public static PlatoDAO getInstancia() {
		if (instancia == null)
			instancia = new PlatoDAO();

		return instancia;
	}

	private PlatoDAO() {

	}

	public Plato obtenerPlato(int idPlato) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		PlatoEntity p = (PlatoEntity) s.createQuery("from PlatoEntity where idPlato = :idPlato").setInteger("idPlato", idPlato)
				.uniqueResult();
		return toNegocio(p);
	}

	public PlatoEntity obtenerProductoEntity(int idPlato) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		PlatoEntity p = (PlatoEntity) s.createQuery("from PlatoEntity where idPlato = :idPlato")
				.setInteger("idPlato", idPlato).uniqueResult();

		return p;
	}

	public PlatoEntity obtenerProductoPorNombre(String nombrePlato) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		PlatoEntity p = (PlatoEntity) s.createQuery("from PlatoEntity where nombrePlato = :nombrePlato")
				.setString("nombrePlato", nombrePlato).uniqueResult();

		return p;
	}

	public Plato toNegocio(PlatoEntity pe) {
		return new Plato(pe);
	}

	public PlatoEntity toEntityP(Plato plato) {
		PlatoEntity entity = new PlatoEntity();
		entity.setIdPlato(plato.getIdPlato());
		entity.setNombrePlato(plato.getNombrePlato());
		entity.setPrecio(plato.getPrecio());
		List<ProductoComestibleEntity> prods = new ArrayList<ProductoComestibleEntity>();
		for (ProductoComestible prod : plato.getProductos()) {
			prods.add(ProductoComestibleDAO.getInstancia().toEntity(prod));
		}
		entity.setProductos(prods);
		entity.setComisionExtra(plato.getComisionExtra());
		return entity;

	}
	
	public PlatoEntity toEntity(Plato plato) {
		PlatoEntity entity = new PlatoEntity();
		entity.setIdPlato(plato.getIdPlato());
		entity.setNombrePlato(plato.getNombrePlato());
		entity.setPrecio(plato.getPrecio());
		entity.setProductos(null);
		entity.setComisionExtra(plato.getComisionExtra());
		return entity;

	}

	
	public List<Plato> listarPlatos(){
		List<Plato> platos = new ArrayList<Plato>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<PlatoEntity> entities = (List<PlatoEntity>)session.createQuery("from PlatoEntity").list();
		session.close();
		for (PlatoEntity p : entities) {
			platos.add(this.toNegocio(p));
		}
		return platos;
	}

	public void save(Plato plato) {
		
			PlatoEntity entity = this.toEntityP(plato);
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
		}

}
