package org.servidor.negocio;

import java.util.List;

public class Sector {
	
	private List<Mozo> mozos;
	private List<Mesa> mesas;
	private Integer idSalon;
	private String nombre;
	
	public Sector(List<Mozo> mozos, List<Mesa> mesas, Integer idSalon, String nombre) {
		super();
		this.mozos = mozos;
		this.mesas = mesas;
		this.idSalon = idSalon;
		this.nombre = nombre;
	}

	public List<Mozo> getMozos() {
		return mozos;
	}

	public void setMozos(List<Mozo> mozos) {
		this.mozos = mozos;
	}

	public List<Mesa> getMesas() {
		return mesas;
	}

	public void setMesas(List<Mesa> mesas) {
		this.mesas = mesas;
	}

	public Integer getIdSalon() {
		return idSalon;
	}

	public void setIdSalon(Integer idSalon) {
		this.idSalon = idSalon;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//TODO faltan metodos
	

}
