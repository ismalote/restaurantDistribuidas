package org.servidor.negocio;

import java.util.List;

public class Plato {

	private List<Elaborado> plato;
	private Float precio;
	private Area area;
	private Float comisionExtra;

	public Plato(List<Elaborado> plato, Float precio, Area area, Float comisionExtra) {
		super();
		this.plato = plato;
		this.precio = precio;
		this.area = area;
		this.comisionExtra = comisionExtra;
	}

	public List<Elaborado> getPlato() {
		return plato;
	}

	public void setPlato(List<Elaborado> plato) {
		this.plato = plato;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Float getComisionExtra() {
		return comisionExtra;
	}

	public void setComisionExtra(Float comisionExtra) {
		this.comisionExtra = comisionExtra;
	}

}
