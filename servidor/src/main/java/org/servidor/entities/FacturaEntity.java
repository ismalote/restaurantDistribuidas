package org.servidor.entities;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class FacturaEntity {

	private String cliente;
	private double montoTotal;
	@OneToOne
	@JoinColumn(name = "idComanda")
	private ComandaEntity comanda;

	public FacturaEntity(String cliente, double montoTotal, ComandaEntity comanda) {
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

	public ComandaEntity getComanda() {
		return comanda;
	}

	public void setComanda(ComandaEntity comanda) {
		this.comanda = comanda;
	}

}
