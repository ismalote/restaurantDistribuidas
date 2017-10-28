package org.servidor.negocio;

import org.repositorio.dtos.AreaDTO;
import org.servidor.entities.AreaEntity;

public class Area {
	
	// to do: verificar si es necesario  que exista  esta clase y su entity

	protected Integer idArea;

	public Area(Integer idArea) {
		super();
		this.idArea = idArea;
	}

	public Area(AreaEntity entity) {
		this.idArea= entity.getIdArea();
	}

	public Area(AreaDTO dto) {
		this.idArea=dto.getIdArea();
	}

	public Integer getIdArea() {
		return idArea;
	}

	public void setIdArea(Integer idArea) {
		this.idArea = idArea;
	}

}
