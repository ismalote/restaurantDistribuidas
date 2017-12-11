package org.servidor.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.repositorio.exceptions.SaveFailedException;
import org.servidor.entities.MesaCompuestaEntity;
import org.servidor.entities.MesaEntity;
import org.servidor.entities.MesaSimpleEntity;
import org.servidor.negocio.Mesa;
import org.servidor.negocio.MesaCompuesta;
import org.servidor.negocio.MesaSimple;
import org.servidor.util.HibernateUtil;

public class MesaDAO {

	private static MesaDAO instancia;

	private MesaDAO() {

	}

	public static MesaDAO getInstancia() {
		if (instancia == null) {
			instancia = new MesaDAO();
		}
		return instancia;
	}

	public Mesa obtenerMesaPorNumero(int numeroMesa) {

		Mesa resultado = null;

		Session s = HibernateUtil.getSessionFactory().openSession();
		MesaEntity entity = (MesaEntity) s.createQuery("From MesaEntity m where idMesa=?").setInteger(0, numeroMesa)
				.uniqueResult();
		resultado = this.toNegocio(entity);
		s.close();
		return resultado;
	}

	public Mesa getMesa(int id) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		MesaEntity entity = s.get(MesaEntity.class, id);
		Mesa resultado = this.toNegocio(entity);
		s.close();
		return resultado;
	}

	@SuppressWarnings("unchecked")
	public List<Mesa> obtenerMesasLibres() {
		List<Mesa> mesas = new ArrayList<Mesa>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<MesaEntity> list = (List<MesaEntity>) session.createQuery("From MesaEntity where estadoMesa = 'LIBRE'")
				.list();
		for (MesaEntity mesaEntity : list) {
			mesas.add(toNegocio(mesaEntity));
		}
		return mesas;
	}

	public Mesa toNegocio(MesaEntity entity) {
		Mesa aux = null;
		if (entity instanceof MesaSimpleEntity) {
			aux = new MesaSimple(entity);
		} else {
			aux = new MesaCompuesta(entity);
		}
		return aux;
	}

	public boolean save(Mesa mesa) {
		MesaEntity entity = this.toEntity(mesa);
		try {
			Session s = HibernateUtil.getSessionFactory().openSession();
			s.beginTransaction();
			s.saveOrUpdate(entity);
			s.flush();
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {
			throw new SaveFailedException(e);
		}
		return true;
	}

	public MesaEntity toEntity(Mesa m) {
		if (m instanceof MesaCompuesta) {
			List<Mesa> mesas = ((MesaCompuesta) m).getMesas();
			List<MesaEntity> mesasEntity = new ArrayList<MesaEntity>();
			for (Mesa mesaActual : mesas) {
				mesasEntity.add(this.toEntity(mesaActual));
			}
			MesaCompuestaEntity entity = new MesaCompuestaEntity();
			entity.setCantidadSillas(m.getCantidadSillas());
			entity.setHoraLiberacion(m.getHoraLiberacion());
			entity.setHoraOcupacion(m.getHoraOcupacion());
			entity.setIdMesa(m.getIdMesa());
			entity.setMesas(mesasEntity);
			entity.setEstadoMesa(m.getEstadoMesa());
			return entity;
		} else {
			MesaSimpleEntity entity = new MesaSimpleEntity();
			entity.setCantidadSillas(m.getCantidadSillas());
			entity.setEstadoMesa(m.getEstadoMesa());
			entity.setHoraLiberacion(m.getHoraLiberacion());
			entity.setHoraOcupacion(m.getHoraOcupacion());
			entity.setIdMesa(m.getIdMesa());
			entity.setNumeroMesa(m.getNumeroMesa());
			return entity;
		}
	}

	public Mesa toNegocio2(MesaEntity m) {
		if (m instanceof MesaCompuestaEntity) {
			List<MesaEntity> mesasEntity = ((MesaCompuestaEntity) m).getMesas();
			List<Mesa> mesas = new ArrayList<Mesa>();
			for (MesaEntity mesaActual : mesasEntity) {
				mesas.add(this.toNegocio(mesaActual));
			}
			MesaCompuesta negocio = new MesaCompuesta();
			negocio.setCantidadSillas(m.getCantidadSillas());
			negocio.setEstadoMesa(m.getEstadoMesa());
			negocio.setHoraLiberacion(m.getHoraLiberacion());
			negocio.setHoraOcupacion(m.getHoraOcupacion());
			negocio.setIdMesa(m.getIdMesa());
			negocio.setMesas(mesas);
			return negocio;
		} else {
			MesaSimple negocio = new MesaSimple();
			negocio.setCantidadSillas(m.getCantidadSillas());
			negocio.setEstadoMesa(m.getEstadoMesa());
			negocio.setHoraLiberacion(m.getHoraLiberacion());
			negocio.setHoraOcupacion(m.getHoraOcupacion());
			negocio.setIdMesa(m.getIdMesa());

			negocio.setNumeroMesa(((MesaSimpleEntity) m).getNumeroMesa());
			return negocio;
		}

	}

}
