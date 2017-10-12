package org.servidor.entities;

public abstract class InsumoEntity {

	protected Integer idInsumo;
	protected Float precio;
	protected CaducidadEntity caducidad;

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

	public CaducidadEntity getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(CaducidadEntity caducidad) {
		this.caducidad = caducidad;
	}

}
