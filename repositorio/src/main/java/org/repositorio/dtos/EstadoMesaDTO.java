package org.repositorio.dtos;

public class EstadoMesaDTO {

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
