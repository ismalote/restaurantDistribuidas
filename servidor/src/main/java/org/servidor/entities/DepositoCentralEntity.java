package org.servidor.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="depositoCentral")
public class DepositoCentralEntity {

	// verificar la clase stock

	@Id
	private Integer idDeposito;
	@OneToOne 
	@JoinColumn (name="idStock")
	private StockEntity stockDeposito;

	public DepositoCentralEntity(Integer id, StockEntity stockDeposito) {
		super();
		this.idDeposito = id;
		this.stockDeposito = stockDeposito;
	}

	public DepositoCentralEntity() {
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return idDeposito;
	}

	public void setId(Integer id) {
		this.idDeposito = id;
	}

	public StockEntity getStockDeposito() {
		return stockDeposito;
	}

	public void setStockDeposito(StockEntity stockDeposito) {
		this.stockDeposito = stockDeposito;
	}

}
