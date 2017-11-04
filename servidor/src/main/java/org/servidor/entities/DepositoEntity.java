package org.servidor.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="deposito")
public class DepositoEntity extends AreaEntity {

	@OneToOne 
	@JoinColumn (name="idStock")
	private StockEntity stockDeposito;
	@OneToOne
	@JoinColumn(name="idEncargado")
	private EncargadoAreaEntity encargadoDeposito;
	
	public DepositoEntity (){}
	
	public DepositoEntity (Integer id, EncargadoAreaEntity encargado, StockEntity stock){
		super (id);
		this.encargadoDeposito= encargado;
		this.stockDeposito= stock;
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
