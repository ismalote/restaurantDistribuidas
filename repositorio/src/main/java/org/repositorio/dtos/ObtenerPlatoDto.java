package org.repositorio.dtos;

import java.io.Serializable;

public class ObtenerPlatoDto implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idPlato;
	private Float precio;
	private String nombrePlato;
	
	public ObtenerPlatoDto(Integer idPlato, Float precio, String nombrePlato) {
		super();
		this.idPlato = idPlato;
		this.precio = precio;
		this.nombrePlato = nombrePlato;
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

	public String getNombrePlato() {
		return nombrePlato;
	}

	public void setNombrePlato(String nombrePlato) {
		this.nombrePlato = nombrePlato;
	}
	
	

}
