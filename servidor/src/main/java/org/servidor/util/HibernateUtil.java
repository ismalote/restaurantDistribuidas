package org.servidor.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.servidor.entities.ComandaEntity;
import org.servidor.entities.MesaEntity;
import org.servidor.entities.MozoEntity;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;
	static {
		try {
			Configuration config = new Configuration();
			config.addAnnotatedClass(MesaEntity.class);
			config.addAnnotatedClass(ComandaEntity.class);
			config.addAnnotatedClass(MozoEntity.class);
			sessionFactory = config.buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed. -->" + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}