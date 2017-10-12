package org.servidor.entities;

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

	public List<ItemCartaEntity> getItemsCarta() {
		return itemsCarta;
	}

	public void setItemsCarta(List<ItemCartaEntity> itemsCarta) {
		this.itemsCarta = itemsCarta;
	}

}
