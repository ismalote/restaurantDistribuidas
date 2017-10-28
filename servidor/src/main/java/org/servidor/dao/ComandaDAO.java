package org.servidor.dao;

import org.hibernate.Session;
import org.servidor.negocio.Comanda;
import org.servidor.util.HibernateUtil;

public class ComandaDAO {
	
	 public static  ComandaDAO instancia;
	
	 
	

	public static ComandaDAO getInstancia() {
		if(instancia==null) {
			instancia = new ComandaDAO();
		}
		return instancia;
	}




	public static void setInstancia(ComandaDAO instancia) {
		ComandaDAO.instancia = instancia;
	}




	public void grabarComanda(Comanda comanda) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.persist(comanda);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}
	
	
	
}
