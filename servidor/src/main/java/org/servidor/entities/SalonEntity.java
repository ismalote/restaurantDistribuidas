package org.servidor.entities;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("salon")
public class SalonEntity extends AreaEntity {

	private String nombre;
	@OneToMany(mappedBy = "salon")
	private List<SectorEntity> sectores;

	public SalonEntity(Integer idArea, LocalEntity localRestaurante) {
		super(idArea, localRestaurante);
		// TODO Auto-generated constructor stub
	}

	public SalonEntity() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
