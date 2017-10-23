package org.repositorio.dtos;

import java.io.Serializable;

public class AreaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7445287877217300934L;
	protected Integer idArea;

	public AreaDTO(Integer idArea) {
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
