package org.servidor.negocio;

import org.repositorio.dtos.CaducidadDTO;
import org.repositorio.dtos.InsumoDTO;

public class Limpieza extends InsumoDTO {

	private Integer idProductoLimpieza;
	private String descripcion;

	public Limpieza(Integer idInsumo, float precio, CaducidadDTO caducidad) {
		super(idInsumo, precio, caducidad);
	}

	public Integer getIdProductoLimpieza() {
		return idProductoLimpieza;
	}

	public void setIdProductoLimpieza(Integer idProductoLimpieza) {
		this.idProductoLimpieza = idProductoLimpieza;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
