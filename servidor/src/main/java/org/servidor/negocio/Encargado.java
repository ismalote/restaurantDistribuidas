package org.servidor.negocio;

public abstract class Encargado {

	protected Integer idEncargado;
	protected String Nombre;
	protected String Apellido;
	protected AreaProduccion area;

	public Encargado(Integer idEncargado, String nombre, String apellido, AreaProduccion area) {
		super();
		this.idEncargado = idEncargado;
		Nombre = nombre;
		Apellido = apellido;
		this.area = area;
	}

	public Integer getIdEncargado() {
		return idEncargado;
	}

	public void setIdEncargado(Integer idEncargado) {
		this.idEncargado = idEncargado;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public AreaProduccion getArea() {
		return area;
	}

	public void setArea(AreaProduccion area) {
		this.area = area;
	}


	
}
