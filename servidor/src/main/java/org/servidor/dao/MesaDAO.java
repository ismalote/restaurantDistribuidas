package org.servidor.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.repositorio.exceptions.SaveFailedException;
import org.servidor.entities.MesaEntity;
import org.servidor.entities.MesaSimpleEntity;
import org.servidor.entities.ReservaEntity;
import org.servidor.negocio.Mesa;
import org.servidor.negocio.MesaSimple;
import org.servidor.negocio.Reserva;
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

	

	public MesaSimple obtenerMesaSimplePorNumero(int numeroMesa) {

		MesaSimple resultado = null;

		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		MesaEntity entity = (MesaEntity) s.createQuery("From MesaSimpleEntity m where idMesa=?")
				.setInteger(0, numeroMesa).uniqueResult();
		resultado = this.toNegocio(entity);
		s.getTransaction().commit();
		s.close();
		return resultado;
	}

	public Mesa obtenerMesaPorNumero(int numeroMesa) {

		Mesa resultado = null;

		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		MesaEntity entity = (MesaEntity) s.createQuery("From MesaEntity m where idMesa=?").setInteger(0, numeroMesa)
				.uniqueResult();
		resultado = this.toNegocio(entity);
		s.getTransaction().commit();
		s.close();
		return resultado;
	}

	public List<Mesa> obtenerMesasPorSector(int sector) {
		List<Mesa> mesas = new ArrayList<Mesa>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<MesaEntity> list = (List<MesaEntity>) session.createQuery("From MesaEntity where sector = ?").setInteger(0, sector).list();
		for (MesaEntity mesaEntity : list) {
			mesas.add(toNegocio(mesaEntity));
		}
		return mesas;
	}

	private MesaSimple toNegocio(MesaEntity entity) {
		MesaSimple aux = new MesaSimple();
		aux.setIdMesa(entity.getIdMesa());
		aux.setEstadoMesa(entity.getEstadoMesa());
		aux.setReserva(new Reserva(entity.getReserva()));
		aux.setCantidadSillas(entity.getCantidadSillas());
		aux.setHoraOcupacion(entity.getHoraOcupacion());
		aux.setHoraLiberacion(entity.getHoraLiberacion());

		return aux;
	}

	public boolean save(Mesa mesa) {
		MesaEntity entity = this.toEntity(mesa);
		try {
			Session s = HibernateUtil.getSessionFactory().openSession();
			s.beginTransaction();
			s.persist(entity);
			s.flush();
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {
			throw new SaveFailedException(e);
		}
		return true;
	}

	private MesaSimpleEntity toEntity(Mesa m) {
		MesaEntity entity = new MesaSimpleEntity();
		entity.setCantidadSillas(m.getCantidadSillas());
		entity.setEstadoMesa(m.getEstadoMesa());
		entity.setHoraLiberacion(m.getHoraLiberacion());
		entity.setHoraOcupacion(m.getHoraOcupacion());
		entity.setIdMesa(m.getIdMesa());
		entity.setReserva(new ReservaEntity(m.getReserva()));

		return null;
	}

}
