package org.repositorio.exceptions;

import java.rmi.RemoteException;

public class LocalNotFoundException extends RemoteException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6759521109939138032L;

	public LocalNotFoundException(String message) {
		super("Comanda not found in " + message);
	}

	public LocalNotFoundException() {
		super("Comanda not found");
	}

}
