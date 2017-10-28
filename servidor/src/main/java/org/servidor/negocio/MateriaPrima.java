package org.servidor.negocio;

public class MateriaPrima {

	private String codigo;
	private String descripcion;
	private Unidad unidadCompra;
	private Caducidad caducidad;

	public MateriaPrima(String codigo, String descripcion, Unidad unidadCompra, Caducidad caducidad) {
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

	public Unidad getUnidadCompra() {
		return unidadCompra;
	}

	public void setUnidadCompra(Unidad unidadCompra) {
		this.unidadCompra = unidadCompra;
	}

	public Caducidad getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(Caducidad caducidad) {
		this.caducidad = caducidad;
	}

}
