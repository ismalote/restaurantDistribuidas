package org.servidor.negocio;

import org.repositorio.dtos.CaducidadDTO;
import org.repositorio.dtos.InsumoDTO;

public class Bebida extends InsumoDTO {

	private Integer idBebida;
	private String descripcion;

	public Bebida(Integer idInsumo, float precio, CaducidadDTO caducidad, Integer idBebida, String descripcion) {
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
