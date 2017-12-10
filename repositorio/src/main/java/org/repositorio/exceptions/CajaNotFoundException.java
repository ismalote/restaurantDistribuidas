package org.repositorio.exceptions;

import java.rmi.RemoteException;

public class CajaNotFoundException extends RemoteException {

	private static final long serialVersionUID = -6759521109939138032L;

	public CajaNotFoundException(String message) {
		super("Comanda not found in " + message);
	}

	public CajaNotFoundException() {
		super("Caja not found");
	}

}
