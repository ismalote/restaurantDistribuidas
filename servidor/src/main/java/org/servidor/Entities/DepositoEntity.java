package org.servidor.Entities;

public class DepositoEntity extends AreaEntity{
	
	private StockEntity stockDeposito;
	private EncargadoAreaEntity encargadoDeposito;
	public StockEntity getStockDeposito() {
		return stockDeposito;
	}
	public void setStockDeposito(StockEntity stockDeposito) {
		this.stockDeposito = stockDeposito;
	}
	public EncargadoAreaEntity getEncargadoDeposito() {
		return encargadoDeposito;
	}
	public void setEncargadoDeposito(EncargadoAreaEntity encargadoDeposito) {
		this.encargadoDeposito = encargadoDeposito;
	}
	
	


	
	

}
