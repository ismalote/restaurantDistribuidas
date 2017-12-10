package org.repositorio.exceptions;

import java.rmi.RemoteException;

public class ComandaNotFoundException extends RemoteException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6759521109939138032L;

	public ComandaNotFoundException(String message) {
		super("Comanda not found in " + message);
	}

	public ComandaNotFoundException() {
		super("Comanda not found");
	}

}
