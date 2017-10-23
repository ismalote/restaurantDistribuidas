package org.repositorio.dtos;

import java.io.Serializable;
import java.util.List;

public class PlatoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -156561835293452117L;
	private List<ElaboradoDTO> plato;
	private Float precio;
	private AreaDTO area;
	private Float comisionExtra;

	public PlatoDTO(List<ElaboradoDTO> plato, Float precio, AreaDTO area, Float comisionExtra) {
		super();
		this.plato = plato;
		this.precio = precio;
		this.area = area;
		this.comisionExtra = comisionExtra;
	}

	public List<ElaboradoDTO> getPlato() {
		return plato;
	}

	public void setPlato(List<ElaboradoDTO> plato) {
		this.plato = plato;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public AreaDTO getArea() {
		return area;
	}

	public void setArea(AreaDTO area) {
		this.area = area;
	}

	public Float getComisionExtra() {
		return comisionExtra;
	}

	public void setComisionExtra(Float comisionExtra) {
		this.comisionExtra = comisionExtra;
	}

}
