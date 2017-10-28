package org.servidor.negocio;

import org.repositorio.dtos.EstadoMesaDTO;
import org.servidor.entities.EstadoMesaEntity;

public class EstadoMesa {

	private Boolean ocupada;

	public EstadoMesa(Boolean ocupada) {
		super();
		this.ocupada = ocupada;
	}

	public EstadoMesa(EstadoMesaEntity entity) {
		this.ocupada= entity.getOcupada();
	}

	public EstadoMesa(EstadoMesaDTO dto) {
		this.ocupada= dto.getOcupada();
	}

	public Boolean getOcupada() {
		return ocupada;
	}

	public void setOcupada(Boolean ocupada) {
		this.ocupada = ocupada;
	}

}
