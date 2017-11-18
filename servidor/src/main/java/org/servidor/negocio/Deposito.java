package org.servidor.negocio;

public class Deposito extends Area {

	private Stock stockDeposito;
	private Encargado encargadoDeposito;

	public Deposito(Integer idArea, Stock stockDeposito, Encargado encargadoDeposito) {
		super(idArea);
		this.stockDeposito = stockDeposito;
		this.encargadoDeposito = encargadoDeposito;
	}

	public Stock getStockDeposito() {
		return stockDeposito;
	}

	public void setStockDeposito(Stock stockDeposito) {
		this.stockDeposito = stockDeposito;
	}

	public Encargado getEncargadoDeposito() {
		return encargadoDeposito;
	}

	public void setEncargadoDeposito(Encargado encargadoDeposito) {
		this.encargadoDeposito = encargadoDeposito;
	}
}