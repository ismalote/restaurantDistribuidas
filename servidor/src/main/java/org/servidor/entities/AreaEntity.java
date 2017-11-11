package org.servidor.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="area")
public class AreaEntity {

	@Id
	@Column(name="idArea")
	protected Integer idArea;
	@ManyToOne
	@JoinColumn (name="idLocal")
	private LocalEntity local;
	
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
