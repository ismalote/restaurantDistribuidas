package org.repositorio.dtos;

import java.io.Serializable;

public class ItemPlandeProduccionDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1038983125942479592L;
	private PlatoDTO plato;
	private Integer cantidadEstimada;

	public ItemPlandeProduccionDTO(PlatoDTO plato, Integer cantidadEstimada) {
		super();
		this.plato = plato;
		this.cantidadEstimada = cantidadEstimada;
	}

	public PlatoDTO getPlato() {
		return plato;
	}

	public void setPlato(PlatoDTO plato) {
		this.plato = plato;
	}

	public Integer getCantidadEstimada() {
		return cantidadEstimada;
	}

	public void setCantidadEstimada(Integer cantidadEstimada) {
		this.cantidadEstimada = cantidadEstimada;
	}

}
