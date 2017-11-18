package org.servidor.dao;

public class SectorDAO {

	private static SectorDAO instancia;

	
	
	private SectorDAO() {
	
	}



	public static SectorDAO getInstancia() {
		if (instancia == null) {
			instancia = new SectorDAO();
		}
		return instancia;
	}

	

	/*
	 * anulamos el metodo porque no caracteriza al Sector, sino que quiere obtener las Mesas y filtrarlas por Sector. 
	 */
//	public List<Integer> listarMesaLibrePorSector(Integer sector, Integer cantidadComensales) {
//		List<Integer> resultado = new ArrayList<>();
//		List<MesaEntity> aux = new ArrayList<>();
//		Session s = HibernateUtil.getSessionFactory().openSession();
//		Query q = s.createQuery("From SectorEntity as se where se.idSector= :codigo AND ");
//		q.setInteger("codigo", sector);
//		SectorEntity entity = (SectorEntity) q.uniqueResult();
//		aux.addAll(entity.getMesas());
//		for (MesaEntity mesaEntity : aux) {
//			if (mesaEntity.getEstadoMesa() == EstadoMesa.LIBRE
//					&& mesaEntity.getCantidadSillas() >= cantidadComensales) {
//				resultado.add(mesaEntity.getNumeroMesa());
//			}
//		}
//		return resultado;
//	}
}
