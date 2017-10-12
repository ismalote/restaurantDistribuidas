package org.servidor.negocio;

import org.repositorio.dtos.AreaDTO;
import org.repositorio.dtos.EncargadoAreaDTO;
import org.repositorio.dtos.StockDTO;

public class Deposito extends AreaDTO {

	private StockDTO stockDeposito;
	private EncargadoAreaDTO encargadoDeposito;

	public Deposito(Integer idArea, StockDTO stockDeposito, EncargadoAreaDTO encargadoDeposito) {
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
