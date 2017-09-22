package org.servidor.Entities;

import java.util.List;

public class ItemCartaEntity {
	
	private Float precio;
	private String descripcion;
	private List<PlatoEntity> plato;
	
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public List<PlatoEntity> getPlato() {
		return plato;
	}
	public void setPlato(List<PlatoEntity> plato) {
		this.plato = plato;
	}
	
	
	
	//TODO faltan metodos
	
}
