package org.servidor.objetoRemoto;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import org.repositorio.interfaces.IAppRemote;

public class ObjetoRemoto extends UnicastRemoteObject implements IAppRemote {

	private static final long serialVersionUID = 1L;

	public ObjetoRemoto() throws RemoteException {
		super();
	}

}
