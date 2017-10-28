package org.servidor.entities;

public class DepositoCentralEntity {
	
	//verificar la clase stock 

	private StockEntity stockDeposito;
	



	public DepositoCentralEntity(StockEntity stockDeposito) {
		super();
		this.stockDeposito = stockDeposito;
	}

	public StockEntity getStockDeposito() {
		return stockDeposito;
	}

	public void setStockDeposito(StockEntity stockDeposito) {
		this.stockDeposito = stockDeposito;
	}

}
