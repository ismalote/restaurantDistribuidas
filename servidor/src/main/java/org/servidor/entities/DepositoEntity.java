package org.servidor.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("deposito")
@Table(name = "deposito")
public class DepositoEntity {

	@Id
	private Integer idDeposito;

	@OneToOne
	@JoinColumn(name = "idStock")
	private StockEntity stockDeposito;

	@OneToOne
	@JoinColumn(name = "idEncargado")
	private EncargadoAreaEntity encargadoDeposito;

	public DepositoEntity() {
		// TODO Auto-generated constructor stub
	}

	public DepositoEntity(Integer idDeposito, StockEntity stockDeposito, EncargadoAreaEntity encargadoDeposito) {
		super();
		this.idDeposito = idDeposito;
		this.stockDeposito = stockDeposito;
		this.encargadoDeposito = encargadoDeposito;
	}

	public Integer getIdDeposito() {
		return idDeposito;
	}

	public void setIdDeposito(Integer idDeposito) {
		this.idDeposito = idDeposito;
	}

	public StockEntity getStockDeposito() {
		return stockDeposito;
	}

	public void setStockDeposito(StockEntity stockDeposito) {
		this.stockDeposito = stockDeposito;
	}

	public EncargadoAreaEntity getEncargadoDeposito() {
		return encargadoDeposito;
	}

	public void setEncargadoDeposito(EncargadoAreaEntity encargadoDeposito) {
		this.encargadoDeposito = encargadoDeposito;
	}

}
