package org.servidor.entities;

public class LimpiezaEntity extends InsumoEntity {

	private Integer idProductoLimpieza;
	private String descripcion;

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
