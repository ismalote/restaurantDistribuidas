package org.servidor.negocio;

import java.util.List;

import org.repositorio.dtos.ItemStockDTO;

public class Stock {

	private List<ItemStockDTO> itemsStock;

	public Stock(List<ItemStockDTO> itemsStock) {
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
