package org.servidor.dao;

import org.hibernate.Session;
import org.repositorio.exceptions.SaveFailedException;
import org.servidor.entities.ReservaEntity;
import org.servidor.negocio.Reserva;
import org.servidor.util.HibernateUtil;

public class ReservaDAO {

	private static ReservaDAO instancia;

	private ReservaDAO() {
	}

	public static ReservaDAO getInstancia() {
		if (instancia == null) {
			instancia = new ReservaDAO();
		}
		return instancia;
	}

	

	public Reserva obtenerReserva(int numeroReserva) {
		Reserva resultado = null;

		Session s = HibernateUtil.getSessionFactory().openSession();
		ReservaEntity entity = s.get(ReservaEntity.class, numeroReserva);
		resultado = this.toNegocio(entity);
		s.close();
		return resultado;

	}

	public boolean save(Reserva reserva) {
		ReservaEntity entity = this.toEntity(reserva);
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

	private ReservaEntity toEntity(Reserva reserva) {
		return new ReservaEntity(reserva);
	}

	public Reserva toNegocio(ReservaEntity reserva) {
		return new Reserva(reserva.getHoraReserva(), reserva.getCantidadPersonas());
	}

}
