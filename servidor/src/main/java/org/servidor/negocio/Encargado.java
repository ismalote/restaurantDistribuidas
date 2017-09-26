package org.servidor.negocio;

public abstract class Encargado {

	protected Integer idEncargado;
	protected String Nombre;
	protected String Apellido;
	
	public Encargado(Integer idEncargado, String nombre, String apellido) {
		super();
		this.idEncargado = idEncargado;
		Nombre = nombre;
		Apellido = apellido;
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
	
	
	
	
}
