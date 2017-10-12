package org.repositorio.dtos;

public class LimpiezaDTO extends InsumoDTO {

	private Integer idProductoLimpieza;
	private String descripcion;

	public LimpiezaDTO(Integer idInsumo, float precio, CaducidadDTO caducidad) {
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
