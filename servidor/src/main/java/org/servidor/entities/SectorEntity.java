package org.servidor.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sector")
public class SectorEntity {

	@Id
	private Integer idSector;
	@OneToMany(mappedBy = "mozoSector")
	private List<MozoEntity> mozos;
	@OneToMany(mappedBy = "sector")
	private List<MesaEntity> mesas;
	private Integer idSalon;
	private String nombre;

	@ManyToOne
	private SalonEntity salon;

	public SectorEntity(Integer idSector, List<MozoEntity> mozos, List<MesaEntity> mesas, Integer idSalon,
			String nombre) {
		super();
		this.idSector = idSector;
		this.mozos = mozos;
		this.mesas = mesas;
		this.idSalon = idSalon;
		this.nombre = nombre;
	}

	public SectorEntity() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdSector() {
		return idSector;
	}

	public void setIdSector(Integer idSector) {
		this.idSector = idSector;
	}

	public Integer getIdSalon() {
		return idSalon;
	}

	public void setIdSalon(Integer idSalon) {
		this.idSalon = idSalon;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
