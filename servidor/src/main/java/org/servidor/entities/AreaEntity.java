package org.servidor.entities;

@Entity
@Table(name="Area")
public class AreaEntity {

	protected Integer idArea;

	public Integer getIdArea() {
		return idArea;
	}

	public void setIdArea(Integer idArea) {
		this.idArea = idArea;
	}

}
