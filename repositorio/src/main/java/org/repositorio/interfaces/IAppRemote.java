package org.repositorio.interfaces;

import java.rmi.Remote;

import org.repositorio.dtos.ComandaDTO;
import org.repositorio.dtos.ItemComandaDTO;


public interface IAppRemote extends Remote {
	String URL_SERVICIO = "localhost/RestaurantDistribuida";
	Integer PORT_SERVICIO = 1099;
	
	boolean crearComanda(ComandaDTO comanda);
	
	boolean agregarItemAComanda(ItemComandaDTO item);
	
	void pedirItemDeComanda(String item);
	
	boolean cerrarcomanda(String idComanda);
}