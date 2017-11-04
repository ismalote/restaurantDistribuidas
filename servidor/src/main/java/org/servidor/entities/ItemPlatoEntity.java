package org.servidor.entities;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class ItemPlatoEntity {

	@Id
	private Integer idItemPlato;
	@OneToOne
	@JoinColumn(name = "idInsumo")
	private PlatoEntity plato;
	private Integer cantidad;
	private double montoSubtotal;

	public ItemPlatoEntity(Integer idItemPlato, PlatoEntity plato, Integer cantidad, double montoSubtotal) {
		super();
		this.idItemPlato = idItemPlato;
		this.plato = plato;
		this.cantidad = cantidad;
		this.montoSubtotal = montoSubtotal;
	}

	public Integer getIdItemPlato() {
		return idItemPlato;
	}

	public void setIdItemPlato(Integer idItemPlato) {
		this.idItemPlato = idItemPlato;
	}

	public PlatoEntity getPlato() {
		return plato;
	}

	public void setPlato(PlatoEntity plato) {
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
