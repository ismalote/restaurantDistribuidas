package org.servidor.negocio;

import java.util.List;

public class Salon extends Area {

	private String nombre;
	private List<Sector> sectores;

	public Salon(Integer idArea, String nombre, List<Sector> sectores) {
		super(idArea);
		this.nombre = nombre;
		this.sectores = sectores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Sector> getSectores() {
		return sectores;
	}

	public void setSectores(List<Sector> sectores) {
		this.sectores = sectores;
	}

}
