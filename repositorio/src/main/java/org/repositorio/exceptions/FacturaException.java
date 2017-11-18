package org.repositorio.exceptions;

public class FacturaException extends RuntimeException{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6759521109939138032L;

	public FacturaException(String message) {
		super("Factura not found in " + message);
	}

	public FacturaException() {
		super("Factura anot found");
	}

}
