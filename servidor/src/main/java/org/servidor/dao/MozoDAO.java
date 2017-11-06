package org.servidor.dao;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.servidor.entities.ComandaEntity;
import org.servidor.entities.MozoEntity;
import org.servidor.negocio.Comanda;
import org.servidor.negocio.Mozo;
import org.servidor.util.HibernateUtil;

public class MozoDAO {
	
	private static MozoDAO instancia;
	
	public static MozoDAO getInstancia() {
		if(instancia==null) {
			instancia= new MozoDAO();
		}
		return instancia;
	}
	
	public static void setInstancia(MozoDAO instancia) {
		MozoDAO.instancia = instancia;
	}




	public Mozo obtenerMozo(int numeroMozo) {
		
		Mozo resultado = null;
		
			Session s= HibernateUtil.getSessionFactory().openSession();
			s.beginTransaction();
			MozoEntity entity = (MozoEntity) s.createQuery("From MozoEntity m where m.idMozo= ?").setInteger(0,numeroMozo).uniqueResult();
			resultado = this.toNegocio(entity);
			s.getTransaction().commit();
			s.close();
			return resultado;
		
		
	}
	
	

	
	public Mozo toNegocio(MozoEntity mozo) {
		
		Mozo aux= new Mozo();
		 aux.setIdMozo(mozo.getIdMozo());
		 aux.setPorcentajeComision(mozo.getPorcentajeComision());
		 aux.setNombre(mozo.getNombre());
		 aux.setApellido(mozo.getApellido());
		 aux.setAntiguedad(mozo.getAntiguedad());
		 List<Comanda> c = new ArrayList<Comanda>();
		 for (ComandaEntity entity : mozo.getComandasAbiertas() ) {
			c.add(new Comanda(entity));
			
		}
		aux.setComandasAbiertas(c);
		
		return aux;
		}
	
	


}
