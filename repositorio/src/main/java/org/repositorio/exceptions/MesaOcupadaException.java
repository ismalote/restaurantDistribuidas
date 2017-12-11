package org.repositorio.exceptions;

import java.rmi.RemoteException;

public class MesaOcupadaException extends RemoteException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1635698836982765149L;

	public MesaOcupadaException(String message) {
		super("Mesa ocupada " + message);
	}

	public MesaOcupadaException() {
		super("Mesa ocupada");
	}

}
