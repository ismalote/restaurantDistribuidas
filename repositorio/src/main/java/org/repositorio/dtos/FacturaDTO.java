package org.repositorio.dtos;

import java.io.Serializable;

public class FacturaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1371403022295984753L;
	private String cliente;
	private double montoTotal;
	private ComandaDTO comanda;

	public FacturaDTO(String cliente, double montoTotal, ComandaDTO comanda) {
		super();
		this.cliente = cliente;
		this.montoTotal = montoTotal;
		this.comanda = comanda;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}

	public ComandaDTO getComanda() {
		return comanda;
	}

	public void setComanda(ComandaDTO comanda) {
		this.comanda = comanda;
	}
	
	@Override
	public String toString() {
		return "Factura [cliente=" + cliente + ", montoTotal=" + montoTotal + "]";
	}

}
