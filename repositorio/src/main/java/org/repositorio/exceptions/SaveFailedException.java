package org.repositorio.exceptions;

public class SaveFailedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6759521109939138032L;

	public SaveFailedException(Throwable t) {
		super("Comanda couldn't be saved", t);
	}

}
