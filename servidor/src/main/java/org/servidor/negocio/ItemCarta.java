package org.servidor.negocio;

import java.util.List;

public class ItemCarta {

	private Float precio;
	private String descripcion;
	private List<Plato> plato;

	public ItemCarta(Float precio, String descripcion, List<Plato> plato) {
		super();
		this.precio = precio;
		this.descripcion = descripcion;
		this.plato = plato;
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

	public List<Plato> getPlato() {
		return plato;
	}

	public void setPlato(List<Plato> plato) {
		this.plato = plato;
	}

	// TODO faltan metodos

}
