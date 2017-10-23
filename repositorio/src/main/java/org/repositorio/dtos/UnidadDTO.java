package org.repositorio.dtos;

import java.io.Serializable;

public class UnidadDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 656180696817188128L;
	private Integer codigo;
	private String descripcion;

	public UnidadDTO(Integer codigo, String descripcion) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
