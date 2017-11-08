package org.servidor.objetoRemoto;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import org.repositorio.dtos.AgregarItemComandaDTO;
import org.repositorio.dtos.CrearComandaDTO;
import org.repositorio.interfaces.IAppRemote;
import org.servidor.controlador.Controlador;

public class ObjetoRemoto extends UnicastRemoteObject implements IAppRemote {

	private static final long serialVersionUID = 1L;

	private Controlador controlador;

	public ObjetoRemoto() throws RemoteException {
		super();
		this.controlador = Controlador.getInstancia();
	}

	public boolean crearComanda(CrearComandaDTO comanda) {
		this.controlador.crearNuevacomanda(comanda);
		return false;
	}

	@Override
	public boolean agregarItemAComanda(AgregarItemComandaDTO item) {
		return this.controlador.agregarItemAComanda(item);
	}

	@Override
	public boolean cerrarcomanda(String idComanda) {
		// TODO Auto-generated method stub
		return false;
	}

}
