package org.servidor.entities;

public class BebidaEntity extends InsumoEntity {
	

	private String descripcion;
	
	public BebidaEntity

	public BebidaEntity(){}
	
	public BebidaEntity(Interger id, Float precio, Date fechaCreacion, Date caducidad, String tipo){
		super(id,precio,fechaCreacion,caducidad);
		this.descripcion=tipo;
		
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
