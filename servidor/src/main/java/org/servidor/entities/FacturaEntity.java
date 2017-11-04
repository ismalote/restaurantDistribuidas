package org.servidor.entities;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class FacturaEntity {

	@Id
	private Integer idFactura;
	private String cliente;
	private double montoTotal;
	@OneToOne
	@JoinColumn(name = "idComanda")
	private ComandaEntity comanda;

	public FacturaEntity(Integer idFactura, String cliente, double montoTotal, ComandaEntity comanda) {
		super();
		this.idFactura = idFactura;
		this.cliente = cliente;
		this.montoTotal = montoTotal;
		this.comanda = comanda;
	}

	public Integer getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Integer idFactura) {
		this.idFactura = idFactura;
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
