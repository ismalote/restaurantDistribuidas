package org.servidor.negocio;

import java.util.List;

public class DepositoCentral {

	private Integer id;
	private List<ItemStock> itemsStock;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<ItemStock> getItemsStock() {
		return itemsStock;
	}

	public void setItemsStock(List<ItemStock> itemsStock) {
		this.itemsStock = itemsStock;
	}

}
