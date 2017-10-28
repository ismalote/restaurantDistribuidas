package org.servidor.entities;

import javax.persistence.Column;
import javax.persistence.Id;

public class AreaEntity {
	
	// borrar esta clase ? 

	@Id
	@Column(name="idArea")
	protected Integer idArea;
	
	public AreaEntity() {
		// TODO Auto-generated constructor stub
	}
	public AreaEntity(Integer id) {
		// TODO Auto-generated method stub
		this.idArea=id;
	}

	public Integer getIdArea() {
		return idArea;
	}

	public void setIdArea(Integer idArea) {
		this.idArea = idArea;
	}

}
