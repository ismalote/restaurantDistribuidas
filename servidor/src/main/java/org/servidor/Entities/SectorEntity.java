package org.servidor.Entities;

import java.util.List;

public class SectorEntity {
	
	private List<MozoEntity> mozos;
	private List<MesaEntity> mesas;
	private Integer idSalon;
	private String nombre;
	
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
	
	
	
	//TODO faltan metodos
	

}
