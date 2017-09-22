package org.servidor.Entities;

import java.util.List;

public class CartaEntity {
	
	private Integer idCarta;
	private List<ItemCartaEntity> itemsCarta;
	
	

	public Integer getIdCarta() {
		return idCarta;
	}

	public void setIdCarta(Integer idCarta) {
		this.idCarta = idCarta;
	}

	public List<ItemCarta> getItemsCarta() {
		return itemsCarta;
	}

	public void setItemsCarta(List<ItemCarta> itemsCarta) {
		this.itemsCarta = itemsCarta;
	}
	
	

}
