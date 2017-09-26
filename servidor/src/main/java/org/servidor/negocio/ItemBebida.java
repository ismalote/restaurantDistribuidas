package org.servidor.negocio;

public class ItemBebida {
	
	private Bebida bebida;
	private Integer cantidad;
	private double montoSubtotal;
	
	public ItemBebida(Bebida bebida, Integer cantidad, double montoSubtotal) {
		super();
		this.bebida = bebida;
		this.cantidad = cantidad;
		this.montoSubtotal = montoSubtotal;
	}

	public Bebida getBebida() {
		return bebida;
	}

	public void setBebida(Bebida bebida) {
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
