package org.servidor.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Josue on 22/4/2017.
 */
public class HibernateUtil {

	private static class HibernateUtilHolder {
		private static final HibernateUtil instance = new HibernateUtil();
	}

	private SessionFactory sessionFactory = null;

	private HibernateUtil() {
		configurarFactoryHibernate();
	}

	@SuppressWarnings("rawtypes")
	private void configurarFactoryHibernate() {
		try {
			Configuration configuration = new Configuration();
			for (Class clase : getEntityClassesFromPackage("edu.uade.prendaDistribuida.servidor.entities")) {
				configuration.addAnnotatedClass(clase);
			}
			sessionFactory = configuration.buildSessionFactory(new StandardServiceRegistryBuilder().build());
		} catch (Throwable ex) {
			System.err.println("Error al iniciar Factory Hibernate." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static HibernateUtil getInstancia() {
		return HibernateUtilHolder.instance;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	private static List<Class<?>> getEntityClassesFromPackage(String packageName)
			throws ClassNotFoundException, IOException, URISyntaxException {
		List<String> classNames = getClassNamesFromPackage(packageName);
		List<Class<?>> classes = new ArrayList<Class<?>>();
		for (String className : classNames) {
			Class<?> cls = Class.forName(packageName + "." + className);
			Annotation[] annotations = cls.getAnnotations();

			for (Annotation annotation : annotations) {
				System.out.println(cls.getCanonicalName() + ": " + annotation.toString());
				if (annotation instanceof javax.persistence.Entity) {
					classes.add(cls);
				}
			}
		}

		return classes;
	}

	private static ArrayList<String> getClassNamesFromPackage(String packageName)
			throws IOException, URISyntaxException, ClassNotFoundException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		ArrayList<String> names = new ArrayList<>();

		packageName = packageName.replace(".", "/");
		URL packageURL = classLoader.getResource(packageName);

		URI uri = new URI(packageURL.toString());
		File folder = new File(uri.getPath());
		File[] files = folder.listFiles();
		for (File file : files) {
			if (!file.isDirectory()) {
				String name = file.getName();
				name = name.substring(0, name.lastIndexOf('.')); // REMUEVE ".class"
				names.add(name);
			}
		}

		return names;
	}
}
