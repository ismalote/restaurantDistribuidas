package org.servidor.negocio;

public class Deposito {

	private Integer idDeposito;
	private Stock stockDeposito;
	private EncargadoArea encargadoDeposito;

	public Deposito(Integer idArea, Stock stockDeposito, EncargadoArea encargadoDeposito) {
		this.idDeposito = idArea;
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

	public Integer getIdDeposito() {
		return idDeposito;
	}

	public void setIdDeposito(Integer idDeposito) {
		this.idDeposito = idDeposito;
	}

}