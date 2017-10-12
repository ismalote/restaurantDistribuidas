package org.servidor.negocio;

import org.repositorio.dtos.BebidaDTO;

public class ItemBebida {

	private BebidaDTO bebida;
	private Integer cantidad;
	private double montoSubtotal;

	public ItemBebida(BebidaDTO bebida, Integer cantidad, double montoSubtotal) {
		super();
		this.bebida = bebida;
		this.cantidad = cantidad;
		this.montoSubtotal = montoSubtotal;
	}

	public BebidaDTO getBebida() {
		return bebida;
	}

	public void setBebida(BebidaDTO bebida) {
		this.bebida = bebida;
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
