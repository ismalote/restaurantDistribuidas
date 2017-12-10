package org.repositorio.exceptions;

import java.rmi.RemoteException;

public class FacturaException extends RemoteException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6759521109939138032L;

	public FacturaException(String message) {
		super("Factura not found in " + message);
	}

	public FacturaException() {
		super("Factura anot found");
	}

}
