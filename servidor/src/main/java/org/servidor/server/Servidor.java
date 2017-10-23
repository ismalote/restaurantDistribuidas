package org.servidor.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import org.repositorio.interfaces.IAppRemote;
import org.servidor.objetoRemoto.ObjetoRemoto;


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
			
			setObjetoRemoto(new ObjetoRemoto());
			LocateRegistry.createRegistry(IAppRemote.PORT_SERVICIO);
			Naming.rebind(IAppRemote.URL_SERVICIO, getObjetoRemoto());
		
			System.out.println("SERVIDOR:");
			System.out.println("Fijado en " + IAppRemote.URL_SERVICIO + " puerto: " + IAppRemote.PORT_SERVICIO);
			System.out.println("----------------------------------------------------------");
		

			

			
		} catch (Exception e) {
			System.out.println("ERROR AL INICIALIZAR SERVIDOR");
			e.printStackTrace();
		}
	}
}
