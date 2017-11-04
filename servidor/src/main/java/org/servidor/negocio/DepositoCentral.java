package org.servidor.negocio;

public class DepositoCentral {

	private Integer id;
	private Stock stockDeposito;

	public DepositoCentral(Integer id, Stock stockDeposito) {
		super();
		this.id = id;
		this.stockDeposito = stockDeposito;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Stock getStockDeposito() {
		return stockDeposito;
	}

	public void setStockDeposito(Stock stockDeposito) {
		this.stockDeposito = stockDeposito;
	}

}
