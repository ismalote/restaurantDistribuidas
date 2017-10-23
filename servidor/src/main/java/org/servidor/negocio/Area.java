package org.servidor.negocio;

public class Area {
	
	// to do: verificar si es necesario  que exista  esta clase y su entity

	protected Integer idArea;

	public Area(Integer idArea) {
		super();
		this.idArea = idArea;
	}

	public Integer getIdArea() {
		return idArea;
	}

	public void setIdArea(Integer idArea) {
		this.idArea = idArea;
	}

}
