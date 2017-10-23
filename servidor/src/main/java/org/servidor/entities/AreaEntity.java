package org.servidor.entities;

@Entity
@Table(name="Area")
public class AreaEntity {
	
	// borrar esta clase ? 

	@Id
	@Column(name="idArea")
	protected Integer idArea;
	
	private public AreaEntity() {
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
