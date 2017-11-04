package org.servidor.objetoRemoto;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import org.repositorio.dtos.CrearComandaDTO;
import org.repositorio.dtos.ItemComandaDTO;
import org.repositorio.interfaces.IAppRemote;
import org.servidor.controlador.Controlador;

public class ObjetoRemoto extends UnicastRemoteObject implements IAppRemote {

	private static final long serialVersionUID = 1L;

	public ObjetoRemoto() throws RemoteException {
		super();
	}

	public boolean crearComanda(CrearComandaDTO comanda) {
		Controlador.getInstancia().crearNuevacomanda(comanda);
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
