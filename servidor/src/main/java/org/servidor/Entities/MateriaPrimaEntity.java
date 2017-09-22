package org.servidor.Entities;

public class MateriaPrimaEntity {
	
	private String codigo;
	private String descripcion;
	private UnidadEntity unidadCompra;
	private CaducidadEntity caducidad;
	
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
	public UnidadEntity getUnidadCompra() {
		return unidadCompra;
	}
	public void setUnidadCompra(UnidadEntity unidadCompra) {
		this.unidadCompra = unidadCompra;
	}
	public CaducidadEntity getCaducidad() {
		return caducidad;
	}
	public void setCaducidad(CaducidadEntity caducidad) {
		this.caducidad = caducidad;
	}
	
	
	
	
	
	

}
