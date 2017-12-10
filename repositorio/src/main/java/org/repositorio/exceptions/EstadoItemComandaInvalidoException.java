package org.repositorio.exceptions;

import java.rmi.RemoteException;

public class EstadoItemComandaInvalidoException extends RemoteException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EstadoItemComandaInvalidoException(String message) {
		super(message);
	}

	public EstadoItemComandaInvalidoException() {
		super("Estoado de ItemComanda Invalido");
	}

}
