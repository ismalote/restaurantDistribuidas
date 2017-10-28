package org.servidor.negocio;

public class ItemPlandeProduccion {

	private Plato plato;
	private Integer cantidadEstimada;

	public ItemPlandeProduccion(Plato plato, Integer cantidadEstimada) {
		super();
		this.plato = plato;
		this.cantidadEstimada = cantidadEstimada;
	}

	public Plato getPlato() {
		return plato;
	}

	public void setPlato(Plato plato) {
		this.plato = plato;
	}

	public Integer getCantidadEstimada() {
		return cantidadEstimada;
	}

	public void setCantidadEstimada(Integer cantidadEstimada) {
		this.cantidadEstimada = cantidadEstimada;
	}

}
