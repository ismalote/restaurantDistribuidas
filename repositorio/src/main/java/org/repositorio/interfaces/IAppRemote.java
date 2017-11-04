package org.repositorio.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

import org.repositorio.dtos.ComandaDTO;
import org.repositorio.dtos.CrearComandaDTO;
import org.repositorio.dtos.ItemComandaDTO;
import org.repositorio.exceptions.BusinessException;


public interface IAppRemote extends Remote {
	String URL_SERVICIO = "localhost/RestaurantDistribuida";
	Integer PORT_SERVICIO = 1099;
	
	void crearComanda(CrearComandaDTO comanda) throws BusinessException, Exception;
	
	boolean agregarItemAComanda(ItemComandaDTO item);
	
	void pedirItemDeComanda(String item);
	
	boolean cerrarcomanda(String idComanda);
}