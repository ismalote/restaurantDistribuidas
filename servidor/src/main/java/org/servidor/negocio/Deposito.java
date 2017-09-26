package org.servidor.negocio;

public class Deposito extends Area{
	
	private Stock stockDeposito;
	private EncargadoArea encargadoDeposito;
	
	public Deposito(Integer idArea, Stock stockDeposito, EncargadoArea encargadoDeposito) {
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

	public EncargadoArea getEncargadoDeposito() {
		return encargadoDeposito;
	}

	public void setEncargadoDeposito(EncargadoArea encargadoDeposito) {
		this.encargadoDeposito = encargadoDeposito;
	}
	
	

}
