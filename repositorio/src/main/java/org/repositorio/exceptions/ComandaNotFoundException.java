package org.repositorio.exceptions;

public class ComandaNotFoundException extends RuntimeException {

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
