package org.servidor.entities;

import javax.persistence.OneToOne;

public class EstadoMesaEntity {

	private Boolean ocupada;
	private Integer idEstadoMesa;
	@OneToOne(mappedBy = "EstadoMesa")
	private MesaEntity mesa;

	public EstadoMesaEntity(Boolean ocupada, Integer idEstadoMesa, MesaEntity mesa) {
		super();
		this.ocupada = ocupada;
		this.idEstadoMesa = idEstadoMesa;
		this.mesa = mesa;
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

	public MesaEntity getMesa() {
		return mesa;
	}

	public void setMesa(MesaEntity mesa) {
		this.mesa = mesa;
	}

}
