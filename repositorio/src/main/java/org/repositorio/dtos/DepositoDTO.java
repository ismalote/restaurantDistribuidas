package org.repositorio.dtos;

public class DepositoDTO extends AreaDTO {

	private StockDTO stockDeposito;
	private EncargadoAreaDTO encargadoDeposito;

	public DepositoDTO(Integer idArea, StockDTO stockDeposito, EncargadoAreaDTO encargadoDeposito) {
		super(idArea);
		this.stockDeposito = stockDeposito;
		this.encargadoDeposito = encargadoDeposito;
	}

	public StockDTO getStockDeposito() {
		return stockDeposito;
	}

	public void setStockDeposito(StockDTO stockDeposito) {
		this.stockDeposito = stockDeposito;
	}

	public EncargadoAreaDTO getEncargadoDeposito() {
		return encargadoDeposito;
	}

	public void setEncargadoDeposito(EncargadoAreaDTO encargadoDeposito) {
		this.encargadoDeposito = encargadoDeposito;
	}

}