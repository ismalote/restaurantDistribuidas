package org.servidor.negocio;

public abstract class Insumo {

	protected Integer idInsumo;
	protected Float precio;
	protected Caducidad caducidad;

	public Insumo(Integer idInsumo, Float precio, Caducidad caducidad) {
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

	public Caducidad getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(Caducidad caducidad) {
		this.caducidad = caducidad;
	}

}
