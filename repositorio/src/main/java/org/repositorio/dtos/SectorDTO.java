package org.repositorio.dtos;

import java.util.List;

public class SectorDTO {

	private List<MozoDTO> mozos;
	private List<MesaDTO> mesas;
	private Integer idSalon;
	private String nombre;

	public SectorDTO(List<MozoDTO> mozos, List<MesaDTO> mesas, Integer idSalon, String nombre) {
		super();
		this.mozos = mozos;
		this.mesas = mesas;
		this.idSalon = idSalon;
		this.nombre = nombre;
	}

	public List<MozoDTO> getMozos() {
		return mozos;
	}

	public void setMozos(List<MozoDTO> mozos) {
		this.mozos = mozos;
	}

	public List<MesaDTO> getMesas() {
		return mesas;
	}

	public void setMesas(List<MesaDTO> mesas) {
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

	// TODO faltan metodos

}
