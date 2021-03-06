package org.repositorio.dtos;

import java.io.Serializable;

public abstract class InsumoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8263014237296991697L;
	protected Integer idInsumo;
	protected Float precio;
	protected CaducidadDTO caducidad;

	public InsumoDTO(Integer idInsumo, Float precio, CaducidadDTO caducidad) {
		super();
		this.idInsumo = idInsumo;
		this.precio = precio;
		this.caducidad = caducidad;
	}

	public Integer getIdInsumo() {
		return idInsumo;
	}

	public void setIdInsumo(Integer idInsumo) {
		this.idInsumo = idInsumo;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public CaducidadDTO getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(CaducidadDTO caducidad) {
		this.caducidad = caducidad;
	}

}
