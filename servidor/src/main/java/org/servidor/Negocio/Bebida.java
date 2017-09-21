package org.servidor.Negocio;

public class Bebida extends Insumo {

	private Integer idBebida;
	private String descripcion;
	
	public Bebida() {
		super(idBebida, precio, caducidad);
		// TODO Auto-generated constructor stub
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
