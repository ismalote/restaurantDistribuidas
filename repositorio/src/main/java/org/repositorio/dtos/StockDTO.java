package org.repositorio.dtos;

import java.io.Serializable;
import java.util.List;

public class StockDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8113272470029174522L;
	private List<ItemStockDTO> itemsStock;

	public StockDTO(List<ItemStockDTO> itemsStock) {
		super();
		this.itemsStock = itemsStock;
	}

	public List<ItemStockDTO> getItemsStock() {
		return itemsStock;
	}

	public void setItemsStock(List<ItemStockDTO> itemsStock) {
		this.itemsStock = itemsStock;
	}

	// TODO faltan metodos

}
