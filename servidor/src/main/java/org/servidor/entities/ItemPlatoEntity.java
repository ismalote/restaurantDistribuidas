package org.servidor.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="items")
public class ItemPlatoEntity {

	@Id
	private Integer idItemPlato;
	private Integer cantidad;
	private double montoSubtotal;

	public ItemPlatoEntity(Integer idItemPlato, PlatoEntity plato, Integer cantidad, double montoSubtotal) {
		super();
		this.idItemPlato = idItemPlato;
		this.cantidad = cantidad;
		this.montoSubtotal = montoSubtotal;
	}

	public Integer getIdItemPlato() {
		return idItemPlato;
	}

	public void setIdItemPlato(Integer idItemPlato) {
		this.idItemPlato = idItemPlato;
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
