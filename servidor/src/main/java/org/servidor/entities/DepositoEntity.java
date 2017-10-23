package org.servidor.entities;

public class DepositoEntity extends AreaEntity {

	
	private StockEntity stockDeposito;
	private EncargadoAreaEntity encargadoDeposito;
	
	public DepositoEntity (){}
	
	public DepositoEntity (Integer id, EncargadoAreaEntity encargado, StockDeposito stock){
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
