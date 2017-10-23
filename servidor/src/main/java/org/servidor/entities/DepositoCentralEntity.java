package org.servidor.entities;

public class DepositoCentralEntity {
	
	//verificar la clase stock 

	private StockEntity stockDeposito;
	
	public public DepositoCentralEntity() {
		// TODO Auto-generated constructor stub
	}

	public public DepositoCentralEntity( StockEntity stock) {
		// TODO Auto-generated constructor stub
		this.stockDeposito= stock;
	}


	public StockEntity getStockDeposito() {
		return stockDeposito;
	}

	public void setStockDeposito(StockEntity stockDeposito) {
		this.stockDeposito = stockDeposito;
	}

}
