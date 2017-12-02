package org.servidor.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.repositorio.exceptions.SaveFailedException;
import org.servidor.entities.ItemListadoEntity;
import org.servidor.entities.ListadoComprasEntity;
import org.servidor.negocio.ItemListado;
import org.servidor.negocio.ListadoCompras;
import org.servidor.util.HibernateUtil;

public class ListadoCompraDAO {

	private static ListadoCompraDAO instancia;

	private ListadoCompraDAO() {
	}

	public static ListadoCompraDAO getInstancia() {
		if (instancia == null) {
			instancia = new ListadoCompraDAO();
		}
		return instancia;
	}
	
	public ListadoCompras obtenerListadoCompra(int idCompra) {
		ListadoCompras listado = new ListadoCompras();
		Session s = HibernateUtil.getSessionFactory().openSession();
		ListadoComprasEntity entity = (ListadoComprasEntity) s.createQuery("FROM ListadoComprasEntity as l  where l.idListadoCompras= ?").setInteger(0, idCompra).uniqueResult();
		listado = this.toNegocio(entity);
		return listado;
	}
	
	public boolean save(ListadoCompras compras) {
		ListadoComprasEntity entity = this.toEntity(compras);
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

	public ListadoCompras toNegocio(ListadoComprasEntity listado) {
		return new ListadoCompras(listado.getIdListadoCompras(), listado.getAreaSolicitante());
	}

	public ListadoComprasEntity toEntity(ListadoCompras compras) {
		return new ListadoComprasEntity(compras.getIdListadoCompras(), compras.getAreaSolicitante(), 
				this.ListadoProdToEntity(compras.getInsumos())); 
	}

	private List<ItemListadoEntity> ListadoProdToEntity(List<ItemListado> insumos) {
		List<ItemListadoEntity> lista = new ArrayList<ItemListadoEntity>();
		for (ItemListado item : insumos) {
			lista.add(new ItemListadoEntity(item.getId(), ProductoComestibleDAO.getInstancia().toEntity(item.getInsumo()),
					item.getCantidad()));
		}
		return null;
	}
}
