package org.servidor.entities;

public class ItemBebidaEntity {

	private BebidaEntity bebida;
	private Integer cantidad;
	private double montoSubtotal;

	public BebidaEntity getBebida() {
		return bebida;
	}

	public void setBebida(BebidaEntity bebida) {
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
