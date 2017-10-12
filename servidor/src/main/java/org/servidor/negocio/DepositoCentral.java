package org.servidor.negocio;

import org.repositorio.dtos.StockDTO;

public class DepositoCentral {

	private StockDTO stockDeposito;

	public DepositoCentral(StockDTO stockDeposito) {
		super();
		this.stockDeposito = stockDeposito;
	}

	public StockDTO getStockDeposito() {
		return stockDeposito;
	}

	public void setStockDeposito(StockDTO stockDeposito) {
		this.stockDeposito = stockDeposito;
	}

}
