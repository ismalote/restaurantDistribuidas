package org.repositorio.dtos;

import java.io.Serializable;

public class PlatoMenuDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -156561835293452117L;
	private Integer idPlato;
	private Float precio;
	private Boolean estadoStock;


	public PlatoMenuDTO(Integer idPlato, Float precio, Boolean estadoStock) {
		super();
		this.idPlato = idPlato;
		this.precio = precio;
		this.estadoStock = estadoStock;
	}

	public Boolean getEstadoStock() {
		return estadoStock;
	}

	public void setEstadoStock(Boolean estadoStock) {
		this.estadoStock = estadoStock;
	}

	public Integer getIdPlato() {
		return idPlato;
	}

	public void setIdPlato(Integer idPlato) {
		this.idPlato = idPlato;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}


}