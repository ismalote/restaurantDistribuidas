package org.repositorio.dtos;

import java.io.Serializable;

public class EstadoMesaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7362801892450001984L;
	private Boolean ocupada;

	public EstadoMesaDTO(Boolean ocupada) {
		super();
		this.ocupada = ocupada;
	}

	public Boolean getOcupada() {
		return ocupada;
	}

	public void setOcupada(Boolean ocupada) {
		this.ocupada = ocupada;
	}

}
