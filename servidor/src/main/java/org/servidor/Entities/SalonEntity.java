package org.servidor.Entities;

import java.util.List;

public class SalonEntity extends AreaEntity {
	
	private String nombre;
	private List<SectorEntity> sectores;
	
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
