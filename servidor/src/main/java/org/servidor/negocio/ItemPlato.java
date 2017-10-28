package org.servidor.negocio;

import org.repositorio.dtos.ItemPlatoDTO;
import org.servidor.entities.ItemPlatoEntity;

public class ItemPlato {

	private Plato plato;
	private Integer cantidad;
	private double montoSubtotal;

	public ItemPlato(Plato plato, Integer cantidad, double montoSubtotal) {
		super();
		this.plato = plato;
		this.cantidad = cantidad;
		this.montoSubtotal = montoSubtotal;
	}

	public ItemPlato(ItemPlatoEntity entity) {
		this.plato= new Plato(entity.getPlato());
		this.cantidad= entity.getCantidad();
		this.montoSubtotal=entity.getMontoSubtotal();
		
	}

	public ItemPlato(ItemPlatoDTO dto) {
		this.plato= new Plato(dto.getPlato());
		this.cantidad= dto.getCantidad();
		this.montoSubtotal=dto.getMontoSubtotal();
	
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
