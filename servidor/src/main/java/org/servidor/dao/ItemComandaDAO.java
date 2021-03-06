package org.servidor.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.servidor.entities.ComandaEntity;
import org.servidor.entities.ItemComandaEntity;
import org.servidor.negocio.ItemComanda;
import org.servidor.util.HibernateUtil;

public class ItemComandaDAO {

	private static ItemComandaDAO instancia;

	private ItemComandaDAO() {

	}

	public static ItemComandaDAO getInstancia() {
		if (instancia == null) {
			instancia = new ItemComandaDAO();
		}
		return instancia;
	}

	public ItemComanda obtenerItemComanda(int idItemComanda) {
		ItemComanda resultado = new ItemComanda();
		Session s = HibernateUtil.getSessionFactory().openSession();
		ItemComandaEntity entity = (ItemComandaEntity) s
				.createQuery("FROM ItemComandaEntity as e  where e.idItemComanda= ?").setInteger(0, idItemComanda)
				.uniqueResult();
		resultado = this.toNegocio(entity);
		return resultado;
	}

	public void cambiarEstado(int idItemComanda) {

	}

	public void save(ItemComanda itemComanda) {
		ItemComandaEntity entity = toEntity(itemComanda, null);
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.saveOrUpdate(entity);
		session.flush();
		session.getTransaction().commit();
		session.close();

	}

	public ItemComanda toNegocio(ItemComandaEntity entity) {
		ItemComanda resultado = new ItemComanda();
		resultado.setPlato(PlatoDAO.getInstancia().toNegocio(entity.getPlato()));
		resultado.setEstado(entity.getEstado());
		resultado.setIdItemComanda(entity.getIdItemComanda());

		return resultado;
	}

	public ItemComandaEntity toEntity(ItemComanda item, ComandaEntity c) {
		ItemComandaEntity entity = new ItemComandaEntity();
		entity.setPlato(PlatoDAO.getInstancia().obtenerProductoEntity(item.getPlato().getIdPlato()));
		entity.setIdItemComanda(item.getIdItemComanda());
		entity.setCantidad(item.getCantidad());
		entity.setEstado(item.getEstado());
		entity.setComanda(c);
		return entity;
	}

	public List<ItemComanda> obtenerItemAreaLocal(Integer idArea) {

		List<ItemComanda> resultado = new ArrayList<ItemComanda>();

		Session s = HibernateUtil.getSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<ItemComandaEntity> items = (List<ItemComandaEntity>) s.createQuery(
				"FROM ItemComandaEntity i where i.plato.area.idAreaProduccion= :idA and i.estado='PRODUCCION'").setInteger("idA", idArea).list();
		for (ItemComandaEntity item : items) {
			resultado.add(this.toNegocio(item));
		}

		return resultado;
	}

	public List<ItemComanda> getItemsComanda(Integer idComanda) {
		// TODO Auto-generated method stub

		List<ItemComanda> resultado = new ArrayList<ItemComanda>();

		Session s = HibernateUtil.getSessionFactory().openSession();
		List<ItemComandaEntity> items = (List<ItemComandaEntity>) s
				.createQuery("FROM ItemComandaEntity as e  where e.comanda.idComanda= ?").setInteger(0, idComanda)
				.list();
		for (ItemComandaEntity item : items) {
			resultado.add(this.toNegocio(item));
		}

		return resultado;

	}

}
