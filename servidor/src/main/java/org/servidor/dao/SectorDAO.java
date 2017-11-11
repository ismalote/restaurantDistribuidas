package org.servidor.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.servidor.Enum.EstadoMesa;
import org.servidor.entities.MesaEntity;
import org.servidor.entities.SectorEntity;
import org.servidor.negocio.Mesa;
import org.servidor.util.HibernateUtil;

public class SectorDAO {
	
	private static SectorDAO instancia;

	public static SectorDAO getInstancia() {
		if(instancia==null) {
			instancia=new SectorDAO();
		}
		return instancia;
	}

	public static void setInstancia(SectorDAO instancia) {
		SectorDAO.instancia = instancia;
	}
	
	
	public List<Integer> listarMesaLibrePorSector (int sector){
		List<Integer> resultado= new ArrayList<>();
		List<MesaEntity> aux= new ArrayList<>();
		Session s= HibernateUtil.getSessionFactory().openSession();
		Query q= s.createQuery("From SectorEntity as se where se.idSector= :codigo" );
		q.setInteger("codigo", sector);
		SectorEntity entity= (SectorEntity) q.uniqueResult();
		aux.addAll(entity.getMesas());
		for (MesaEntity mesaEntity : aux) {
			if (mesaEntity.getEstadoMesa()==EstadoMesa.LIBRE)
			resultado.add(mesaEntity.getNumeroMesa());
		}
		
				return resultado;
		}
	

}
