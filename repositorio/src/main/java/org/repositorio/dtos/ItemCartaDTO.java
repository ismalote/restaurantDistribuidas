package org.repositorio.dtos;

import java.io.Serializable;
import java.util.List;

public class ItemCartaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3355861330769244070L;
	private Float precio;
	private String descripcion;
	private List<PlatoDTO> plato;

	public ItemCartaDTO(Float precio, String descripcion, List<PlatoDTO> plato) {
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

	public List<PlatoDTO> getPlato() {
		return plato;
	}

	public void setPlato(List<PlatoDTO> plato) {
		this.plato = plato;
	}

	// TODO faltan metodos

}
