package org.servidor.negocio;

import java.util.List;

public class Carta {

	private Integer idCarta;
	private List<ItemCarta> itemsCarta;

	public Carta(Integer idCarta, List<ItemCarta> itemsCarta) {
		super();
		this.idCarta = idCarta;
		this.itemsCarta = itemsCarta;
	}

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
