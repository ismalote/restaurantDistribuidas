package org.servidor.negocio;

public class Bebida extends Insumo {

	private Integer idBebida;
	private String descripcion;

	public Bebida(Integer idInsumo, float precio, Caducidad caducidad, Integer idBebida, String descripcion) {
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
