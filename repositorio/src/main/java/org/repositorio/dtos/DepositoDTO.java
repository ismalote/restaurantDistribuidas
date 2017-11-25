package org.repositorio.dtos;

import java.io.Serializable;
import java.util.List;

public class DepositoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8790809135225160135L;
	private List<ItemStockDTO> itemsStock;
	private EncargadoAreaDTO encargadoDeposito;

	public List<ItemStockDTO> getItemsStock() {
		return itemsStock;
	}

	public void setItemsStock(List<ItemStockDTO> itemsStock) {
		this.itemsStock = itemsStock;
	}

	public EncargadoAreaDTO getEncargadoDeposito() {
		return encargadoDeposito;
	}

	public void setEncargadoDeposito(EncargadoAreaDTO encargadoDeposito) {
		this.encargadoDeposito = encargadoDeposito;
	}
}
