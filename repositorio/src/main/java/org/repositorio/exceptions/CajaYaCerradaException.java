package org.repositorio.exceptions;

import java.rmi.RemoteException;

public class CajaYaCerradaException extends RemoteException {

	private static final long serialVersionUID = -6759521109939138032L;

	public CajaYaCerradaException(String message) {
		super("Comanda not found in " + message);
	}

	public CajaYaCerradaException() {
		super("Caja not found");
	}
}
