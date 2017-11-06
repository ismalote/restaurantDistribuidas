package org.repositorio.dtos;

import java.io.Serializable;

public class MateriaPrimaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8371237561112477683L;
	private String codigo;
	private String descripcion;
	private CaducidadDTO caducidad;

	public MateriaPrimaDTO(String codigo, String descripcion, CaducidadDTO caducidad) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.caducidad = caducidad;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public CaducidadDTO getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(CaducidadDTO caducidad) {
		this.caducidad = caducidad;
	}

}
