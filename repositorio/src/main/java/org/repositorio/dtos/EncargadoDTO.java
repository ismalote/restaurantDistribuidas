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

	public EncargadoDTO(Integer idEncargado, String nombre, String apellido) {
		super();
		this.idEncargado = idEncargado;
		Nombre = nombre;
		Apellido = apellido;
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

}
