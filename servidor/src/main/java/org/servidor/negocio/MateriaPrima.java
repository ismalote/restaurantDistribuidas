package org.servidor.negocio;

import org.repositorio.dtos.CaducidadDTO;
import org.repositorio.dtos.UnidadDTO;

public class MateriaPrima {

	private String codigo;
	private String descripcion;
	private UnidadDTO unidadCompra;
	private CaducidadDTO caducidad;

	public MateriaPrima(String codigo, String descripcion, UnidadDTO unidadCompra, CaducidadDTO caducidad) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.unidadCompra = unidadCompra;
		this.caducidad = caducidad;
	}

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

	public UnidadDTO getUnidadCompra() {
		return unidadCompra;
	}

	public void setUnidadCompra(UnidadDTO unidadCompra) {
		this.unidadCompra = unidadCompra;
	}

	public CaducidadDTO getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(CaducidadDTO caducidad) {
		this.caducidad = caducidad;
	}

}
