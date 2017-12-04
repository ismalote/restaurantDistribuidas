package org.servidor.dao;

import java.util.List;

import org.hibernate.Session;
import org.repositorio.exceptions.SaveFailedException;
import org.servidor.entities.AreaProduccionEntity;
import org.servidor.entities.LocalEntity;
import org.servidor.entities.ProductoComestibleEntity;
import org.servidor.entities.ProductoSimpleEntity;
import org.servidor.entities.StockEmbeddeEntity;
import org.servidor.entities.StockEntity;
import org.servidor.util.HibernateUtil;

public class StockDAO {
	
	private static StockDAO instancia;

	private StockDAO() {

	}

	public static StockDAO getInstancia() {
		if (instancia == null) {
			instancia = new StockDAO();
		}
		return instancia;
	}

	
	public boolean save(Integer cantidad, Integer local, Integer area, Integer producto) {
		StockEntity entity = this.toEntity(cantidad, local, area, producto);
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

	public StockEntity toEntity(Integer cantidad, Integer local, Integer area, Integer producto) {
		StockEntity s = new StockEntity();
		LocalEntity l = StockDAO.getInstancia().toSimpleLocalEntity(local);
		AreaProduccionEntity ap = StockDAO.getInstancia().toSimpleAreaEntity(area);
		ProductoComestibleEntity pc = StockDAO.getInstancia().toSimpleProductoEntity(producto);
		StockEmbeddeEntity ss = new StockEmbeddeEntity();
		ss.setIdArea(ap);
		ss.setIdLocal(l);
		ss.setIdProducto(pc);
		s.setIdStock(ss);
		s.setCantidad(cantidad);
		// TODO Auto-generated method stub
		return s;
	}

	private ProductoComestibleEntity toSimpleProductoEntity (Integer producto) {
		ProductoComestibleEntity pc = new  ProductoSimpleEntity();
		pc.setIdInsumo(producto);
		return pc;
	}

	private AreaProduccionEntity toSimpleAreaEntity(Integer area) {
		AreaProduccionEntity ap = new AreaProduccionEntity();
		ap.setIdAreaProduccion(area);
		return ap;
	}

	private LocalEntity toSimpleLocalEntity(Integer local) {
		LocalEntity lo= new LocalEntity();
		lo.setIdLocal(local);
		return lo;
	}
	
	public Integer toNegocio (StockEntity s){
		Integer cantidad = s.getCantidad();
		
		return cantidad;
	}
	
	public StockEntity buscarStock (List<StockEntity> list, Integer local , Integer area , Integer producto){

		for (StockEntity ss : list){
			if(ss.getIdStock().getIdProducto().getIdInsumo() == producto && 
					ss.getIdStock().getIdLocal().getIdLocal() == local &&
					ss.getIdStock().getIdArea().getIdAreaProduccion() == area){
				return ss;
			}
			
		}
		
		return null;
	}
}
