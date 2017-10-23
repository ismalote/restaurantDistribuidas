package org.repositorio.dtos;

import java.io.Serializable;
import java.util.List;

public class CartaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3425289682319203009L;
	private Integer idCarta;
	private List<ItemCartaDTO> itemsCarta;

	public CartaDTO(Integer idCarta, List<ItemCartaDTO> itemsCarta) {
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
