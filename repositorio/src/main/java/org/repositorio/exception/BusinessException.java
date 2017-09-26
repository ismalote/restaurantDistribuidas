package org.repositorio.exception;

public class BusinessException extends Exception {

	private static final long serialVersionUID = 5572653696321475333L;

	public BusinessException(String mensaje) {
		super(mensaje);
	}
}
