package org.servidor.util;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import org.repositorio.dtos.ComandaDTO;
import org.repositorio.dtos.ItemComandaDTO;
import org.repositorio.interfaces.IAppRemote;

/**
 * 
 */
public class ObjetoRemoto extends UnicastRemoteObject implements IAppRemote {

	private static final long serialVersionUID = 1L;

	public ObjetoRemoto() throws RemoteException {
		super();
	}

	@Override
	public boolean crearComanda(ComandaDTO comanda) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean agregarItemAComanda(ItemComandaDTO item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void pedirItemDeComanda(String idItemComanda) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean cerrarcomanda(String idComanda) {
		// TODO Auto-generated method stub
		return false;
	}
}
