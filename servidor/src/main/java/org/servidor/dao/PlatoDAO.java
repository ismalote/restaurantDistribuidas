package org.servidor.dao;

import org.hibernate.Session;
import org.servidor.negocio.Plato;
import org.servidor.util.HibernateUtil;

public class PlatoDAO {

	private static PlatoDAO instancia;

	public static PlatoDAO getInstancia() {
		if (instancia == null)
			instancia = new PlatoDAO();

		return instancia;
	}

	private PlatoDAO() {

	}
	// .

	public Plato obtenerProducto(int idPlato) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		Plato p = (Plato) s.createQuery("from PlatoEntity where idPlato = :idPlato").setInteger("idPlato", idPlato)
				.uniqueResult();

		return p;
	}

}
