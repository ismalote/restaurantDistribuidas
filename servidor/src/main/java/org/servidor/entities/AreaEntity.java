package org.servidor.entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "area")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Area_type")
public class AreaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Integer idArea;
	@ManyToOne

	protected LocalEntity localRestaurante;

	public AreaEntity(Integer idArea, LocalEntity localRestaurante) {
		super();
		this.idArea = idArea;
		this.localRestaurante = localRestaurante;
	}

	public AreaEntity() {
		// TODO Auto-generated constructor stub
	}
	public Integer getIdArea() {
		return idArea;
	}

	public void setIdArea(Integer idArea) {
		this.idArea = idArea;
	}

	public LocalEntity getLocalRestaurante() {
		return localRestaurante;
	}

	public void setLocalRestaurante(LocalEntity localRestaurante) {
		this.localRestaurante = localRestaurante;
	}

}
