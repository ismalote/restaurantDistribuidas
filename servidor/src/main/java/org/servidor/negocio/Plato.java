package org.servidor.negocio;

import java.util.List;

import org.repositorio.dtos.AreaDTO;
import org.repositorio.dtos.ElaboradoDTO;

public class Plato {

	private List<ElaboradoDTO> plato;
	private Float precio;
	private AreaDTO area;
	private Float comisionExtra;

	public Plato(List<ElaboradoDTO> plato, Float precio, AreaDTO area, Float comisionExtra) {
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
