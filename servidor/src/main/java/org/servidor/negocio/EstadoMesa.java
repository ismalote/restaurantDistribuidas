package org.servidor.negocio;

import org.repositorio.dtos.EstadoMesaDTO;
import org.servidor.entities.EstadoMesaEntity;

public class EstadoMesa {

	private Boolean ocupada;
	private Integer idEstadoMesa;
	private Mesa mesa;

	public EstadoMesa(Boolean ocupada, Integer idEstadoMesa, Mesa mesa) {
		super();
		this.ocupada = ocupada;
		this.idEstadoMesa = idEstadoMesa;
		this.mesa = mesa;
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

	public Integer getIdEstadoMesa() {
		return idEstadoMesa;
	}

	public void setIdEstadoMesa(Integer idEstadoMesa) {
		this.idEstadoMesa = idEstadoMesa;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

}
