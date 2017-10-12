package org.repositorio.dtos;

public class ItemPlatoDTO {

	private PlatoDTO plato;
	private Integer cantidad;
	private double montoSubtotal;

	public ItemPlatoDTO(PlatoDTO plato, Integer cantidad, double montoSubtotal) {
		super();
		this.plato = plato;
		this.cantidad = cantidad;
		this.montoSubtotal = montoSubtotal;
	}

	public PlatoDTO getPlato() {
		return plato;
	}

	public void setPlato(PlatoDTO plato) {
		this.plato = plato;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public double getMontoSubtotal() {
		return montoSubtotal;
	}

	public void setMontoSubtotal(double montoSubtotal) {
		this.montoSubtotal = montoSubtotal;
	}

}
