package org.servidor.negocio;

import org.repositorio.dtos.UnidadDTO;
import org.servidor.entities.UnidadEntity;

public class Unidad {

	private Integer codigo;
	private String descripcion;

	public Unidad(Integer codigo, String descripcion) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public Unidad(UnidadEntity entity) {
		this.codigo= entity.getCodigo();
		this.descripcion= entity.getDescripcion();
		
	}
	public Unidad(UnidadDTO dto) {
		this.codigo= dto.getCodigo();
		this.descripcion= dto.getDescripcion();
		
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
