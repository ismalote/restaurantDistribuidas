package org.servidor.negocio;

import java.sql.Date;

public abstract class Insumo {

	protected Integer idInsumo;
	protected Float precio;
	protected Date fechaCreacion;
	protected Date fechaCaducidad;
	protected String descripcion;
	protected String unidad;

	public Insumo(Integer idInsumo, Float precio, Date fechaCreacion, Date fechaCaducidad, String descripcion,
			String unidad) {
		super();
		this.idInsumo = idInsumo;
		this.precio = precio;
		this.fechaCreacion = fechaCreacion;
		this.fechaCaducidad = fechaCaducidad;
		this.descripcion = descripcion;
		this.unidad = unidad;
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

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

}
