package org.servidor.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.repositorio.exceptions.SaveFailedException;
import org.servidor.Enum.TipoArea;
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
	
	//dado un pedido te trae el listado de sus productos
	public List<ItemListado> obtenerItemsAComprarDePedido(int idCompra) {
		List<ItemListado> list = new ArrayList<ItemListado>();
		List<ItemListadoEntity> listentity = new ArrayList<ItemListadoEntity>();

		Session s = HibernateUtil.getSessionFactory().openSession();
		ListadoComprasEntity entity = (ListadoComprasEntity) s.createQuery("FROM ListadoComprasEntity as l  where l.idListadoCompras= ?").setInteger(0, idCompra).uniqueResult();
		
		listentity = entity.getInsumos();
		
		for (ItemListadoEntity itemListadoEntity : listentity) {
			list.add(this.itemListToNegocio(itemListadoEntity));
		}
		return list;
	}
	
	private ItemListado itemListToNegocio(ItemListadoEntity listentity) {
		return new ItemListado(listentity.getIdItemlistado(), ProductoComestibleDAO.getInstancia().toNegocio(listentity.getInsumo()), listentity.getCantidad());
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

	
	public List<ListadoCompras> listarPedidoCompras(){
		List<ListadoCompras> compras = new ArrayList<ListadoCompras>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<ListadoComprasEntity> entities = (List<ListadoComprasEntity>)session.createQuery("from ListadoComprasEntity").list();
		session.close();
		for (ListadoComprasEntity p : entities) {
			compras.add(this.toNegocio(p));
		}
		return compras;
	}
	
	
	
	public ListadoCompras toNegocio(ListadoComprasEntity listado) {
		return new ListadoCompras(listado.getIdListadoCompras(), TipoArea.valueOf(listado.getAreaSolicitante()));
	}

	public ListadoComprasEntity toEntity(ListadoCompras compras) {
		return new ListadoComprasEntity(compras.getIdListadoCompras(), compras.getAreaSolicitante().toString(), 
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
