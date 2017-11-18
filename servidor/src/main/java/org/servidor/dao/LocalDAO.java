package org.servidor.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.repositorio.exceptions.SaveFailedException;
import org.servidor.entities.EncargadoEntity;
import org.servidor.entities.ListadoComprasEntity;
import org.servidor.entities.LocalEntity;
import org.servidor.entities.MozoEntity;
import org.servidor.negocio.AreaProduccion;
import org.servidor.negocio.Carta;
import org.servidor.negocio.Deposito;
import org.servidor.negocio.Encargado;
import org.servidor.negocio.ListadoCompras;
import org.servidor.negocio.Local;
import org.servidor.negocio.Mozo;
import org.servidor.util.HibernateUtil;

public class LocalDAO {

	private static LocalDAO instance;

	private LocalDAO() {
	}

	public static LocalDAO getInstance() {
		if (instance == null) {
			instance = new LocalDAO();
		}
		return instance;
	}

	public Local findById(int idLocal) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		LocalEntity localEntity = session.get(LocalEntity.class, idLocal);
		session.close();
		return toNegocio(localEntity);
	}

	public boolean save(Local local) {
		LocalEntity le = this.toEntity(local);
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.persist(le);
			session.flush();
			session.getTransaction().commit();
		} catch (Exception e) {
			throw new SaveFailedException(e);
		}
		return false;
	}

	private LocalEntity toEntity(Local local) {
		List<Encargado> encargadosAreas = local.getEncargadosAreas();
		List<ListadoCompras> listadosCompras = local.getListadosCompras();
		List<Mozo> mozos = local.getMozos();

		List<EncargadoEntity> encargadosAreasEntity = new ArrayList<EncargadoEntity>();
		List<ListadoComprasEntity> listadosComprasEntity = new ArrayList<ListadoComprasEntity>();
		List<MozoEntity> mozosEntity = new ArrayList<MozoEntity>();

		for (Encargado encargado : encargadosAreas) {
			encargadosAreasEntity.add(EncargadoDAO.getInstancia().toEntity(encargado));
		}

		for (ListadoCompras compras : listadosCompras) {
			listadosComprasEntity.add(ListadoCompraDAO.getInstancia().toEntity(compras));
		}

		for (Mozo mozo : mozos) {
			mozosEntity.add(MozoDAO.getInstancia().toEntity(mozo));
		}

		LocalEntity le = new LocalEntity();
		le.setCarta(CartaDAO.getInstancia().toEntity(local.getCarta()));
		return null;
	}

	public Local toNegocio(LocalEntity le) {
		List<EncargadoEntity> encargadosAreas = le.getEncargadosAreas();
		List<ListadoComprasEntity> listadosCompras = le.getListadosCompras();
		List<MozoEntity> mozos = le.getMozos();

		List<AreaProduccion> areaNegocio = new ArrayList<AreaProduccion>();
		List<Encargado> encargados = new ArrayList<Encargado>();
		List<ListadoCompras> listados = new ArrayList<ListadoCompras>();
		List<Mozo> mozosNegocio = new ArrayList<Mozo>();

		for (MozoEntity mozoEntity : mozos) {
			mozosNegocio.add(MozoDAO.getInstancia().toNegocio(mozoEntity));
		}

		for (ListadoComprasEntity l : listadosCompras) { // TODO Falta DAO
			listados.add(ListadoCompraDAO.getInstancia().toNegocio(l));
		}

		for (EncargadoEntity encargadoEntity : encargadosAreas) { // TODO Falta DAO
			encargados.add(EncargadoDAO.getInstancia().toNegocio(encargadoEntity));
		}

		Deposito deposito = DepositoDAO.getInstancia().toNegocio(le.getDeposito());
		Carta carta = CartaDAO.getInstancia().toNegocio(le.getCarta());
		return new Local(encargados, mozosNegocio, null, deposito, areaNegocio, null, carta, listados);
	}

}
