package org.servidor.negocio;

import java.util.List;

public class Stock {

	private List<ItemStock> itemsStock;
	private Integer idInsumo;

	public Stock(List<ItemStock> itemsStock, Integer idInsumo) {
		super();
		this.itemsStock = itemsStock;
		this.idInsumo = idInsumo;
	}

	public List<ItemStock> getItemsStock() {
		return itemsStock;
	}

	public void setItemsStock(List<ItemStock> itemsStock) {
		this.itemsStock = itemsStock;
	}

	public Integer getIdInsumo() {
		return idInsumo;
	}

	public void setIdInsumo(Integer idInsumo) {
		this.idInsumo = idInsumo;
	}

	// TODO faltan metodos

}
