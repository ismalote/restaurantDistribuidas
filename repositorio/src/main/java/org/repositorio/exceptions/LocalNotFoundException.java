package org.repositorio.exceptions;

public class LocalNotFoundException extends RuntimeException {
	
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
