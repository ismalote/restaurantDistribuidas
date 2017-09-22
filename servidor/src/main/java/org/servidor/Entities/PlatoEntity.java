package org.servidor.Entities;

import java.util.List;

public class PlatoEntity {
	
	private List<ElaboradoEntity> plato;
	private Float precio;
	private AreaEntity area;
	private Float comisionExtra;
	
	public List<ElaboradoEntity> getPlato() {
		return plato;
	}
	public void setPlato(List<ElaboradoEntity> plato) {
		this.plato = plato;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public AreaEntity getArea() {
		return area;
	}
	public void setArea(AreaEntity area) {
		this.area = area;
	}
	public Float getComisionExtra() {
		return comisionExtra;
	}
	public void setComisionExtra(Float comisionExtra) {
		this.comisionExtra = comisionExtra;
	}
	
	
	
	

}
