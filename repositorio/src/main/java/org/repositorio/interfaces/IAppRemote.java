package org.repositorio.interfaces;

import java.rmi.Remote;

import org.repositorio.dtos.ComandaDTO;
import org.repositorio.dtos.ItemComandaDTO;

/**
 * Created by mmaldonado on 22/4/2017.
 */
public interface IAppRemote extends Remote {
	String URL_SERVICIO = "localhost/RestaurantDistribuida";
	Integer PORT_SERVICIO = 1099;
	
	boolean crearComanda(ComandaDTO comanda);
	
	boolean agregarItemAComanda(ItemComandaDTO item);
	
	void pedirItemDeComanda(String idItemComanda);
	
	boolean cerrarcomanda(String idComanda);
}