package org.repositorio.dtos;

public class DepositoCentralDTO {

	private StockDTO stockDeposito;

	public DepositoCentralDTO(StockDTO stockDeposito) {
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
