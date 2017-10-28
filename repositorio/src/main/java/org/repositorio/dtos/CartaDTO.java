package org.repositorio.dtos;

import java.io.Serializable;
import java.util.List;

public class CartaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3425289682319203009L;
	private Integer idCarta;
	private List<PlatoDTO> platos;

	public CartaDTO(Integer idCarta, List<PlatoDTO> itemsCarta) {
		super();
		this.idCarta = idCarta;
		this.platos = itemsCarta;
	}

	public Integer getIdCarta() {
		return idCarta;
	}

	public void setIdCarta(Integer idCarta) {
		this.idCarta = idCarta;
	}

	public List<PlatoDTO> getItemsCarta() {
		return platos;
	}

	public void setItemsCarta(List<PlatoDTO> itemsCarta) {
		this.platos = itemsCarta;
	}

}
