package org.repositorio.dtos;

import java.io.Serializable;

public abstract class EncargadoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -377661009498013031L;
	protected Integer idEncargado;
	protected String Nombre;
	protected String Apellido;
	protected AreaProduccionDTO area;

	public EncargadoDTO(Integer idEncargado, String nombre, String apellido, AreaProduccionDTO area) {
		super();
		this.idEncargado = idEncargado;
		Nombre = nombre;
		Apellido = apellido;
		this.area = area;
	}

	public Integer getIdEncargado() {
		return idEncargado;
	}

	public void setIdEncargado(Integer idEncargado) {
		this.idEncargado = idEncargado;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public AreaProduccionDTO getArea() {
		return area;
	}

	public void setArea(AreaProduccionDTO area) {
		this.area = area;
	}

}
