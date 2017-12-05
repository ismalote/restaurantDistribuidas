package org.servidor.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.servidor.entities.ProductoComestibleEntity;
import org.servidor.entities.ProductoSimpleEntity;
import org.servidor.entities.SemiElaboradoEntity;
import org.servidor.entities.StockEntity;
import org.servidor.negocio.AreaProduccion;
import org.servidor.negocio.Local;
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
		return negocio;
	}
	
	public ProductoComestibleEntity toStockEntity(ProductoComestible pc, Local l, AreaProduccion a) {

		ProductoComestibleEntity entity = null;
		if (pc instanceof ProductoSimple) {
			entity = new ProductoSimpleEntity();
		} else {
			entity = new SemiElaboradoEntity();
		}

		entity.setCantidadPedido(pc.getCantidadPedido());
		entity.setPuntoPedido(pc.getPuntoPedido());
		entity.setIdInsumo(pc.getIdProducto());
		// revisar la transformacion del cantidad al embedded
		List<StockEntity> stock = new ArrayList<>();
		stock.add(StockDAO.getInstancia().toEntity(pc.getStock(), l.getIdLocal(), a.getId(), entity.getIdInsumo()));
		entity.setStock(stock);

		entity.setDescripcion(pc.getDescripcion());
		return entity;
	}

	public ProductoComestibleEntity toEntity(ProductoComestible pc) {

		ProductoComestibleEntity entity = null;
		if (pc instanceof ProductoSimple) {
			entity = new ProductoSimpleEntity(pc.getIdProducto(), pc.getPrecio(), new Date(), null, pc.getDescripcion(), "kg", pc.getCantidadPedido(), pc.getPuntoPedido());
		} else {
			entity = new SemiElaboradoEntity(pc.getIdProducto(), pc.getPrecio(), new Date(), null, pc.getDescripcion(), "kg", pc.getCantidadPedido(), pc.getPuntoPedido());
		}

		entity.setCantidadPedido(pc.getCantidadPedido());
		entity.setPuntoPedido(pc.getPuntoPedido());
		entity.setIdInsumo(pc.getIdProducto());

		entity.setDescripcion(pc.getDescripcion());
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

	public void updateStock(ProductoComestible pc, Local l, AreaProduccion a) {
		try {

			ProductoComestibleEntity entity = this.toStockEntity(pc, l, a);

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
