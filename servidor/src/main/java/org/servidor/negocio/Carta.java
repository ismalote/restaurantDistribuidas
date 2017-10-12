package org.servidor.negocio;

import java.util.List;

import org.repositorio.dtos.ItemCartaDTO;

public class Carta {

	private Integer idCarta;
	private List<ItemCartaDTO> itemsCarta;

	public Carta(Integer idCarta, List<ItemCartaDTO> itemsCarta) {
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

	public List<ItemCartaDTO> getItemsCarta() {
		return itemsCarta;
	}

	public void setItemsCarta(List<ItemCartaDTO> itemsCarta) {
		this.itemsCarta = itemsCarta;
	}

}
