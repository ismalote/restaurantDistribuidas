package org.repositorio.exceptions;

import java.rmi.RemoteException;

public class NoAlcanzaMesaException extends RemoteException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1635698836982765149L;

	public NoAlcanzaMesaException(String message) {
		super("Mesa not found in " + message);
	}

	public NoAlcanzaMesaException() {
		super("Mesa not found");
	}

}
