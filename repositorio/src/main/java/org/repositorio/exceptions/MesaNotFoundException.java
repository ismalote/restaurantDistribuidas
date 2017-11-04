package org.repositorio.exceptions;

public class MesaNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1635698836982765149L;

	public MesaNotFoundException(String message) {
		super("Mesa not found in " + message);
	}

	public MesaNotFoundException() {
		super("Mesa not found");
	}

}
