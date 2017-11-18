package org.servidor.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.servidor.entities.PlatoEntity;
import org.servidor.entities.ProductoComestibleEntity;
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

	public Plato obtenerProducto(int idPlato) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		Plato p = (Plato) s.createQuery("from PlatoEntity where idPlato = :idPlato").setInteger("idPlato", idPlato)
				.uniqueResult();

		return p;
	}
	public PlatoEntity obtenerProductoEntity(int idPlato) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		PlatoEntity p = (PlatoEntity) s.createQuery("from PlatoEntity where idPlato = :idPlato").setInteger("idPlato", idPlato)
				.uniqueResult();

		return p;
	}
	public Plato obtenerProductoPorNombre(String nombrePlato) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		Plato p = (Plato) s.createQuery("from PlatoEntity where idPlato = :idPlato").setInteger("idPlato", idPlato)
				.uniqueResult();

		return p;
	}

	public Plato toNegocio(PlatoEntity pe) {
		return new Plato(pe);
	}
	
	public PlatoEntity toEntity(Plato plato) {
		PlatoEntity entity = new PlatoEntity();
		 entity.setIdPlato(plato.getIdProducto());
		 entity.setNombrePlato(plato.getNombrePlato());
		 entity.setPrecio(plato.getPrecio());
		 entity.setProductos(null); 
		 entity.setComisionExtra(plato.getComisionExtra());
		return entity;
		
	}

	public PlatoEntity toEntity(Plato plato) {
		return new PlatoEntity();
}
