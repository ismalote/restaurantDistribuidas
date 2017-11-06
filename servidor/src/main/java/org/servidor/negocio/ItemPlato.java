package org.servidor.negocio;

import org.repositorio.dtos.ItemPlatoDTO;
import org.servidor.entities.ItemComandaEntity;

public class ItemPlato {

	private Integer idItemPlato;
	private Plato plato;
	private Integer cantidad;
	private double montoSubtotal;

	public ItemPlato(Integer idItemPlato, Plato plato, Integer cantidad, double montoSubtotal) {
		super();
		this.idItemPlato = idItemPlato;
		this.plato = plato;
		this.cantidad = cantidad;
		this.montoSubtotal = montoSubtotal;
	}

	public ItemPlato(ItemPlatoDTO plato2) {
		// TODO Auto-generated constructor stub
	}

	public ItemPlato(ItemComandaEntity plato2) {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdItemPlato() {
		return idItemPlato;
	}

	public void setIdItemPlato(Integer idItemPlato) {
		this.idItemPlato = idItemPlato;
	}

	public Plato getPlato() {
		return plato;
	}

	public void setPlato(Plato plato) {
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
