package org.servidor;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import org.hibernate.Session;
import org.repositorio.interfaces.IAppRemote;
import org.servidor.util.HibernateUtil;
import org.servidor.util.ObjetoRemoto;

/**
 * Created by Josue on 22/4/2017.
 */
public class Servidor {

	private static Servidor instancia;
	private ObjetoRemoto objetoRemoto;

	private Servidor() {
		inicializacion();
	}

	public static Servidor getInstancia() {
		if (instancia == null) {
			instancia = new Servidor();
		}
		return instancia;
	}

	public ObjetoRemoto getObjetoRemoto() {
		return objetoRemoto;
	}

	public void setObjetoRemoto(ObjetoRemoto objetoRemoto) {
		this.objetoRemoto = objetoRemoto;
	}

	private void inicializacion() {
		try {
			System.out.println("----------------------------------------------------------");
			System.out.println("INICIALIZACION");
			System.out.println("----------------------------------------------------------");
			System.out.println("");
			System.out.println("----------------------------------------------------------");
			System.out.println("HIBERNATE:");
			System.out.println("----------------------------------------------------------");
			Session s = HibernateUtil.getInstancia().getSessionFactory().openSession();
			s.close();
			System.out.println("----------------------------------------------------------");
			System.out.println("RMI:");
			System.out.println("Fijado en " + IAppRemote.URL_SERVICIO + " puerto: " + IAppRemote.PORT_SERVICIO);
			System.out.println("----------------------------------------------------------");
			setObjetoRemoto(new ObjetoRemoto());
			LocateRegistry.createRegistry(IAppRemote.PORT_SERVICIO);
			Naming.rebind(IAppRemote.URL_SERVICIO, getObjetoRemoto());

			// INICIALIZANDO FACTORY
			System.out.println("----------------------------------------------------------");
			System.out.println("FACTORY:");
			System.out.println("----------------------------------------------------------");

			System.out.println("----------------------------------------------------------");
			System.out.println("INICIALIZACION COMPLETO");
			System.out.println("----------------------------------------------------------");

			while (true) {

			}
		} catch (Exception e) {
			System.out.println("ERROR AL INICIALIZAR SERVIDOR");
			e.printStackTrace();
		}
	}
}
