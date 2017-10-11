package org.servidor.util;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import org.repositorio.interfaces.IAppRemote;

/**
 * Created by Josue on 22/4/2017.
 */
public class RMIUtil extends UnicastRemoteObject implements IAppRemote {

    private static final long serialVersionUID = 1L;

    public RMIUtil() throws RemoteException {
        super();
    }

}
