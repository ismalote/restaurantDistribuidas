package org.repositorio.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;

/**
 * Created by mmaldonado on 22/4/2017.
 */
public interface IAppRemote extends Remote {
    String URL_SERVICIO = "localhost/RestaurantDistribuida";
    Integer PORT_SERVICIO = 1099;
    
    
    
}
