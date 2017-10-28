package org.servidor.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Id;

public abstract class InsumoEntity {
	
	@Id
	@Column(name="idInsumo")
	protected Integer idInsumo;
	protected Float precio;
	protected Date fechaCreacion;
	protected Date fechaCaducidad;
	
	
	public InsumoEntity (){}
	
	public InsumoEntity (Integer id, Float pre, Date fCreacion, Date fCaducidad){
		this.idInsumo= id;
		this.precio= pre;
		this.fechaCreacion= fCreacion;
		this.fechaCaducidad= fCaducidad;
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

}
