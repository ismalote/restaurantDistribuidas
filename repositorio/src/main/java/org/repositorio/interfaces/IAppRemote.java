package org.repositorio.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

import org.repositorio.dtos.ComandaDTO;
import org.repositorio.dtos.ItemComandaDTO;


public interface IAppRemote extends Remote {
	String URL_SERVICIO = "localhost/RestaurantDistribuida";
	Integer PORT_SERVICIO = 1099;
	
	boolean crearComanda(ComandaDTO comanda) throws RemoteException;
	
	boolean agregarItemAComanda(ItemComandaDTO item);
	
	void pedirItemDeComanda(String item); // TODO BORRRAR
	
	boolean cerrarcomanda(String idComanda);
}