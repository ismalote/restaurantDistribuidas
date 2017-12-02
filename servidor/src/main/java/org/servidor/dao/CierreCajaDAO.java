package org.servidor.dao;

import org.hibernate.Session;
import org.repositorio.exceptions.SaveFailedException;
import org.servidor.entities.CajaEntity;
import org.servidor.entities.CierredeCajaEntity;
import org.servidor.negocio.Caja;
import org.servidor.negocio.CierredeCaja;
import org.servidor.util.HibernateUtil;

public class CierreCajaDAO {
	
	private static CierreCajaDAO  instancia;
	
	private CierreCajaDAO() {

	}

	public static CierreCajaDAO getInstancia() {
		if (instancia == null) {
			instancia = new CierreCajaDAO();
		}
		return instancia;
	}
	
	public boolean save(CierredeCaja cierre) {
		CierredeCajaEntity entity = this.toEntity(cierre);
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

	private CierredeCajaEntity toEntity(CierredeCaja cierre) {
		// TODO Auto-generated method stub
		CierredeCajaEntity aux = new CierredeCajaEntity();
		aux.setIdCierre(cierre.getIdCierre());
		aux.setFechaCierre(cierre.getFechaCierre());
		CajaEntity cajita = CajaDAO.getInstancia().toEntity(cierre.getCaja());
		aux.setCaja(cajita);
		aux.setMontoDelDia(cierre.getMontoNeto());
		aux.setMontoComisiones(cierre.getMontoComisiones());
		return aux;
	}
	
	
	private CierredeCaja toNegocio (CierredeCajaEntity c){
		CierredeCaja aux= new CierredeCaja();
		aux.setEstado(c.isEstado());
		aux.setFechaCierre(c.getFechaCierre());
		aux.setIdCierre(c.getIdCierre());
		Caja cajita = CajaDAO.getInstancia().toNegocio(c.getCaja());
		aux.setCaja(cajita);
		
		return aux;
		
	}



}
