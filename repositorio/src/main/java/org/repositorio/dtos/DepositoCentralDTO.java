package org.repositorio.dtos;

import java.io.Serializable;

public class DepositoCentralDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7914275300366352242L;
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
