package org.servidor.negocio;

import org.repositorio.dtos.CaducidadDTO;

public abstract class Insumo {

	protected Integer idInsumo;
	protected Float precio;
	protected CaducidadDTO caducidad;

	public Insumo(Integer idInsumo, Float precio, CaducidadDTO caducidad) {
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
