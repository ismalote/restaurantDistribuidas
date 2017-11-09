package org.repositorio.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

import org.repositorio.dtos.AgregarItemComandaDTO;
import org.repositorio.dtos.AgregarItemsComandaDTO;
import org.repositorio.dtos.CrearComandaDTO;

public interface IAppRemote extends Remote {
	String URL_SERVICIO = "localhost/RestaurantDistribuida";
	Integer PORT_SERVICIO = 1099;

	boolean crearComanda(CrearComandaDTO comanda) throws RemoteException;

	boolean agregarItemAComanda(AgregarItemComandaDTO item) throws RemoteException;

	AgregarItemsComandaDTO agregarItemsAComanda(AgregarItemsComandaDTO item) throws RemoteException;

	boolean cerrarcomanda(String idComanda) throws RemoteException;

}