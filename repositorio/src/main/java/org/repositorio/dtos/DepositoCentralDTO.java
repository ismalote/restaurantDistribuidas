package org.repositorio.dtos;

import java.io.Serializable;
import java.util.List;

public class DepositoCentralDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7914275300366352242L;
	private List<ItemStockDTO> itemsStock;

	public List<ItemStockDTO> getItemsStock() {
		return itemsStock;
	}

	public void setItemsStock(List<ItemStockDTO> itemsStock) {
		this.itemsStock = itemsStock;
	}

}
