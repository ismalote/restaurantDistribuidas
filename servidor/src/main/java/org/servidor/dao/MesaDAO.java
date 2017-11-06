package org.servidor.dao;



import org.hibernate.Session;
import org.servidor.entities.MesaEntity;
import org.servidor.negocio.EstadoMesa;
import org.servidor.negocio.Mesa;
import org.servidor.negocio.Reserva;
import org.servidor.util.HibernateUtil;

public class MesaDAO {
	
	public static MesaDAO instancia;

	public static MesaDAO getInstancia() {
		if(instancia==null) {
			instancia= new MesaDAO();
		}
		return instancia;
	}

	public static void setInstancia(MesaDAO instancia) {
		MesaDAO.instancia = instancia;
	}
	
	
	public Mesa obtenerMesaPorNumero(int numeroMesa) {
		
		Mesa resultado = null;
		
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		MesaEntity entity = (MesaEntity) s.createQuery("From MesaEntity m where idMesa=?").setInteger(0, numeroMesa).uniqueResult();
		resultado= this.toNegocio(entity);
		s.getTransaction().commit();
		s.close();
		return resultado;
	}

	private Mesa toNegocio(MesaEntity entity) {
		Mesa aux= new Mesa();
		aux.setIdMesa(entity.getIdMesa());
		aux.setEstadoMesa(new EstadoMesa(entity.getEstadoMesa()));
		aux.setReserva(new Reserva(entity.getReserva()));
		aux.setCantidadSillas(entity.getCantidadSillas());
		aux.setHoraOcupacion(entity.getHoraOcupacion());
		aux.setHoraLiberacion(entity.getHoraLiberacion());
		
		
		return aux;
	}
	
}
