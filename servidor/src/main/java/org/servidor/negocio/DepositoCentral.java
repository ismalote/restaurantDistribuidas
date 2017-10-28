package org.servidor.negocio;

public class DepositoCentral {

	private Stock stockDeposito;

	public DepositoCentral(Stock stockDeposito) {
		super();
		this.stockDeposito = stockDeposito;
	}

	public Stock getStockDeposito() {
		return stockDeposito;
	}

	public void setStockDeposito(Stock stockDeposito) {
		this.stockDeposito = stockDeposito;
	}
}
