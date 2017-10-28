package org.repositorio.dtos;

import java.io.Serializable;

public class EstadoMesaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7362801892450001984L;
	private Boolean ocupada;
	private Integer idEstadoMesa;
	private MesaDTO mesa;

	public EstadoMesaDTO(Boolean ocupada, Integer idEstadoMesa, MesaDTO mesa) {
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

	public MesaDTO getMesa() {
		return mesa;
	}

	public void setMesa(MesaDTO mesa) {
		this.mesa = mesa;
	}

}
