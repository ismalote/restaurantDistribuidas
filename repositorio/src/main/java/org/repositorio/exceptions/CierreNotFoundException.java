package org.repositorio.exceptions;

public class CierreNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -6759521109939138032L;

	public CierreNotFoundException(String message) {
		super("Comanda not found in " + message);
	}

	public CierreNotFoundException() {
		super("Caja not found");
	}
}
