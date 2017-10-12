package org.repositorio.dtos;

import java.util.List;

public class StockDTO {

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
