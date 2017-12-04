package org.servidor.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "factura")
public class FacturaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idFactura;
	private String cliente;
	private float montoTotal;
	@OneToOne
	@JoinColumn(name = "idComanda")
	private ComandaEntity comanda;

	public FacturaEntity(Integer idFactura, String cliente, float montoTotal, ComandaEntity comanda) {
		super();
		this.idFactura = idFactura;
		this.cliente = cliente;
		this.montoTotal = montoTotal;
		this.comanda = comanda;
	}

	public FacturaEntity() {
		// TODO Auto-generated constructor stub
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

	public float getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(float montoTotal) {
		this.montoTotal = montoTotal;
	}

	public ComandaEntity getComanda() {
		return comanda;
	}

	public void setComanda(ComandaEntity comanda) {
		this.comanda = comanda;
	}

}
