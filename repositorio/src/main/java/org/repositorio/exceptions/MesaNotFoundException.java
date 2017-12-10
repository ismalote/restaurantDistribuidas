package org.repositorio.exceptions;

import java.rmi.RemoteException;

public class MesaNotFoundException extends RemoteException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1635698836982765149L;

	public MesaNotFoundException(String message) {
		super("Mesa not found in " + message);
	}

	public MesaNotFoundException() {
		super("Mesa not found");
	}

}
