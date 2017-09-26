package org.servidor.negocio;

import java.util.List;

public class Stock {
	
	private List<ItemStock> itemsStock;

	public Stock(List<ItemStock> itemsStock) {
		super();
		this.itemsStock = itemsStock;
	}

	public List<ItemStock> getItemsStock() {
		return itemsStock;
	}

	public void setItemsStock(List<ItemStock> itemsStock) {
		this.itemsStock = itemsStock;
	}
	
	
	//TODO faltan metodos

}
