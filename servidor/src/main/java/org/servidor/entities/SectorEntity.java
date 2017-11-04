package org.servidor.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sector")
public class SectorEntity {

	@Id
	private Integer idSector;
	@OneToMany(mappedBy="mozo")
	private List<MozoEntity> mozos;
	@OneToMany(mappedBy="mesa")
	private List<MesaEntity> mesas;
	private Integer idSalon;
	private String nombre;

	public SectorEntity(Integer idSector, List<MozoEntity> mozos, List<MesaEntity> mesas, Integer idSalon,
			String nombre) {
		super();
		this.idSector = idSector;
		this.mozos = mozos;
		this.mesas = mesas;
		this.idSalon = idSalon;
		this.nombre = nombre;
	}

	public Integer getIdSector() {
		return idSector;
	}

	public void setIdSector(Integer idSector) {
		this.idSector = idSector;
	}

	public List<MozoEntity> getMozos() {
		return mozos;
	}

	public void setMozos(List<MozoEntity> mozos) {
		this.mozos = mozos;
	}

	public List<MesaEntity> getMesas() {
		return mesas;
	}

	public void setMesas(List<MesaEntity> mesas) {
		this.mesas = mesas;
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
