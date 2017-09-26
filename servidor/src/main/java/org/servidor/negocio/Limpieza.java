package org.servidor.negocio;

public class Limpieza extends Insumo {

	private Integer idProductoLimpieza;
	private String descripcion;
	
	public Limpieza(Integer idInsumo, float precio, Caducidad caducidad) {
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
