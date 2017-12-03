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
		if (instancia == null) {
			instancia = new ProductoComestibleDAO();
		}
		return instancia;
	}

	public ProductoComestible obtenerProducto(int idProd) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		ProductoComestibleEntity entity = (ProductoComestibleEntity) s
				.createQuery("FROM ProductoComestibleEntity as e  where e.idInsumo= ?").setInteger(0, idProd)
				.uniqueResult();
		ProductoComestible negocio = entity.getNegocio();
		return negocio;
	}

	public ProductoComestible toNegocio(ProductoComestibleEntity entity) {
		ProductoComestible negocio = entity.getNegocio();
		negocio.setCantidadPedido(entity.getCantidadPedido());
		negocio.setDescripcion(entity.getDescripcion());
		negocio.setIdProducto(entity.getIdInsumo());
		negocio.setPrecio(entity.getPrecio());
		negocio.setPuntoPedido(entity.getPuntoPedido());
		negocio.setStock(entity.getStock().getCantidad());

		return negocio;
	}

	public ProductoComestibleEntity toEntity(ProductoComestible pc) {

		ProductoComestibleEntity entity = null;
		if (pc instanceof ProductoSimple){
			entity = new ProductoSimpleEntity();
			entity.setIdInsumo(pc.getIdProducto());
	// revisar la transformacion del cantidad al embedded		
	//		entity.setStock(pc.getStock());
			
			entity.setDescripcion(pc.getDescripcion());			
		} else {
			entity = new SemiElaboradoEntity();
			entity.setIdInsumo(pc.getIdProducto());
	// revisar la transformacion del cantidad al embedded					
	//		entity.setStock(pc.getStock());
			
			entity.setDescripcion(pc.getDescripcion());			
		}
			
			return entity;
	}

	// TODO probar
	public void update(ProductoComestible pc) {
		try {

			ProductoComestibleEntity entity = this.toEntity(pc);

			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.saveOrUpdate(entity);
			session.flush();
			session.getTransaction().commit();
			session.close();

		} catch (Exception e) {
			System.out.println();
		}
	}

	public List<ProductoComestible> listarProductos() {
		List<ProductoComestible> prods = new ArrayList<ProductoComestible>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<ProductoComestibleEntity> entities = (List<ProductoComestibleEntity>) session
				.createQuery("from ProductoComestibleEntity").list();
		session.close();
		for (ProductoComestibleEntity p : entities) {
			prods.add(this.toNegocio(p));
		}
		return prods;
	}

}
