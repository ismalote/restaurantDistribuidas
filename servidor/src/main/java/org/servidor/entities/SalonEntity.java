package org.servidor.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="salon")
public class SalonEntity extends AreaEntity {

	private String nombre;
	@OneToMany(mappedBy = "salon")
	private List<SectorEntity> sectores;

	public SalonEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalonEntity(Integer id, String nom, List<SectorEntity> sectores) {
		super(id);
		// TODO Auto-generated constructor stub
		this.nombre = nom;
		this.sectores = sectores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<SectorEntity> getSectores() {
		return sectores;
	}

	public void setSectores(List<SectorEntity> sectores) {
		this.sectores = sectores;
	}

}
