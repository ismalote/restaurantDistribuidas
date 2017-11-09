package org.repositorio.exceptions;

public class ItemComandaFailException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6759521109939138032L;

	public ItemComandaFailException(String message) {
		super("Couldn't add ItemComanda to Comanda in " + message);
	}

	public ItemComandaFailException() {
		super("Couldn't add ItemComanda to Comanda in ");
	}

}
