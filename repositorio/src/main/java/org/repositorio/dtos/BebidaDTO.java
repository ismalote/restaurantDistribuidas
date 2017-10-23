package org.repositorio.dtos;

import java.io.Serializable;

public class BebidaDTO extends InsumoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2621467313550474435L;
	private Integer idBebida;
	private String descripcion;

	public BebidaDTO(Integer idInsumo, float precio, CaducidadDTO caducidad, Integer idBebida, String descripcion) {
		super(idInsumo, precio, caducidad);
		this.idBebida = idBebida;
		this.descripcion = descripcion;
	}

	public Integer getIdBebida() {
		return idBebida;
	}

	public void setIdBebida(Integer idBebida) {
		this.idBebida = idBebida;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
