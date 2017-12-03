package org.servidor.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.servidor.entities.ProductoComestibleEntity;
import org.servidor.entities.ProductoSimpleEntity;
import org.servidor.entities.SemiElaboradoEntity;
import org.servidor.negocio.ProductoComestible;
import org.servidor.negocio.ProductoSimple;
import org.servidor.util.HibernateUtil;

public class ProductoComestibleDAO {
	
	private static ProductoComestibleDAO instancia;
	
	private ProductoComestibleDAO() {
		
	}

	public static ProductoComestibleDAO getInstancia() {
		if(instancia==null) {
			instancia= new ProductoComestibleDAO();
		}
		return instancia;
	}

	
	public ProductoComestible obtenerProducto(int idProd) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		ProductoComestibleEntity entity = (ProductoComestibleEntity) s.createQuery("FROM ProductoComestibleEntity as e  where e.idInsumo= ?").setInteger(0, idProd).uniqueResult();
		ProductoComestible negocio = entity.getNegocio();
		 return negocio;
	}
		

	ProductoComestible toNegocio(ProductoComestibleEntity entity) {
		
		return new ProductoComestible(entity.getIdInsumo(), entity.getCantidadPedido(), entity.getPuntoPedido(), entity.getDescripcion(),
				entity.getStock(), entity.getPrecio()) {
		};
	}
	
	public ProductoComestibleEntity toEntity(ProductoComestible pc) {
		
		ProductoComestibleEntity entity = null;
			if (pc instanceof ProductoSimple){
				entity = new ProductoSimpleEntity();
				entity.setIdInsumo(pc.getIdProducto());
				entity.setStock(pc.getStock());
				entity.setDescripcion(pc.getDescripcion());
			} else {
				entity = new SemiElaboradoEntity();
				entity.setIdInsumo(pc.getIdProducto());
				entity.setStock(pc.getStock());
				entity.setDescripcion(pc.getDescripcion());
			}
			
			return entity;
	}

	//TODO probar
	public void update(ProductoComestible pc) {
		ProductoComestibleEntity entity = this.toEntity(pc);
	
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.persist(entity);
		session.flush();
		session.getTransaction().commit();
		session.close();	
		
	}
	
	public List<ProductoComestible> listarProductos(){
		List<ProductoComestible> prods = new ArrayList<ProductoComestible>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<ProductoComestibleEntity> entities = (List<ProductoComestibleEntity>)session.createQuery("from ProductoComestibleEntity").list();
		session.close();
		for (ProductoComestibleEntity p : entities) {
			prods.add(this.toNegocio(p));
		}
		return prods;
	}
	
	

}
