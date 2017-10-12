package org.repositorio.dtos;

public class ItemPlandeProduccionDTO {

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
