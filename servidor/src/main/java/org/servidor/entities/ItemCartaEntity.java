package org.servidor.entities;

import java.util.List;

public class ItemCartaEntity {

	private Float precio;
	private String descripcion;
	
	@OneToMany
	@JoinColumn(name="idCarta")
	private List<PlatoEntity> plato;
	
	@OneToOne(mappedBy="ItemCartaEntity")
	private CartaEntity carta;
	
	
	
	public ItemCartaEntity () {
		
	}
	
	public ItemCartaEntity (Float precio, String descripcion, List <PlatoEntity> platos, CartaEntity carta) {
		this.carta= carta;
		this.descripcion= descripcion;
		this.precio= precio;
		this.plato= platos;
		
	}

	
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

	// TODO faltan metodos

}
