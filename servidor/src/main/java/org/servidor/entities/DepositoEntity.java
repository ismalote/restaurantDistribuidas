package org.servidor.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("deposito")
public class DepositoEntity extends AreaEntity {

	@OneToOne
	@JoinColumn(name = "idStock")
	private StockEntity stockDeposito;
	@OneToOne
	@JoinColumn(name = "idEncargado")
	private EncargadoAreaEntity encargadoDeposito;

	public DepositoEntity(Integer idArea, LocalEntity localRestaurante) {
		super(idArea, localRestaurante);
		// TODO Auto-generated constructor stub
	}

	public DepositoEntity() {
		// TODO Auto-generated constructor stub
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
