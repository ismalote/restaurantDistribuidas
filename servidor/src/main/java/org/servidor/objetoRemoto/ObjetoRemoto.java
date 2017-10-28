package org.servidor.objetoRemoto;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import org.repositorio.dtos.ComandaDTO;
import org.repositorio.dtos.ItemComandaDTO;
import org.repositorio.interfaces.IAppRemote;

public class ObjetoRemoto extends UnicastRemoteObject implements IAppRemote {

	private static final long serialVersionUID = 1L;

	public ObjetoRemoto() throws RemoteException {
		super();
	}

	@Override
	public boolean crearComanda(ComandaDTO comanda) throws RemoteException {
		return false;
	}

	@Override
	public boolean agregarItemAComanda(ItemComandaDTO item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void pedirItemDeComanda(String item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean cerrarcomanda(String idComanda) {
		// TODO Auto-generated method stub
		return false;
	}

}
