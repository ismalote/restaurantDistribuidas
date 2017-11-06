package org.servidor.negocio;

import java.util.List;

import org.repositorio.dtos.AreaDTO;
import org.servidor.entities.AreaEntity;

public class Salon extends Area {

	private String nombre;
	private List<Sector> sectores;

	public Salon(AreaEntity entity) {
		super(entity);
		// TODO Auto-generated constructor stub
	}

	public Salon(AreaDTO dto) {
		super(dto);
		// TODO Auto-generated constructor stub
	}

	public Salon(Integer idArea) {
		super(idArea);
		// TODO Auto-generated constructor stub
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
