package org.servidor.negocio;

public class Operador {

	protected Integer idOperador;
	protected String Nombre;
	protected String Apellido;
	protected AreaProduccion area;

	public Operador(Integer idEncargado, String nombre, String apellido, AreaProduccion area) {
		super();
		this.idOperador = idEncargado;
		Nombre = nombre;
		Apellido = apellido;
		this.area = area;
	}

	public Integer getIdOperador() {
		return idOperador;
	}

	public void setIdOperador(Integer idEncargado) {
		this.idOperador = idEncargado;
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
