package org.repositorio.exceptions;

import java.rmi.RemoteException;

public class MozoNotFoundException extends RemoteException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1213798182754777966L;

	public MozoNotFoundException(String message) {
		super("Mozo not found in " + message);
	}

	public MozoNotFoundException() {
		super("Mozo not found");
	}

}
