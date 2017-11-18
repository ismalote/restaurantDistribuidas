package org.repositorio.exceptions;

public class EstadoItemComandaException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public EstadoItemComandaException(String message) {
		super(message);
	}

	public EstadoItemComandaException() {
		super("ItemComanda not found");
	}


	
}
