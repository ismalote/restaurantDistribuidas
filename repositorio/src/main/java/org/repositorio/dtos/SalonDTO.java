package org.repositorio.dtos;

import java.io.Serializable;
import java.util.List;

public class SalonDTO extends AreaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7476299187136406150L;
	private String nombre;
	private List<SectorDTO> sectores;

	public SalonDTO(Integer idArea, String nombre, List<SectorDTO> sectores) {
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

	public List<SectorDTO> getSectores() {
		return sectores;
	}

	public void setSectores(List<SectorDTO> sectores) {
		this.sectores = sectores;
	}

}
