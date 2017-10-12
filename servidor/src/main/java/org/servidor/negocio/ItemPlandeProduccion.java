package org.servidor.negocio;

import org.repositorio.dtos.PlatoDTO;

public class ItemPlandeProduccion {

	private PlatoDTO plato;
	private Integer cantidadEstimada;

	public ItemPlandeProduccion(PlatoDTO plato, Integer cantidadEstimada) {
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
