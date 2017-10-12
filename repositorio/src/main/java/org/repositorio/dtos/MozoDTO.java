package org.repositorio.dtos;

public class MozoDTO {

	private Integer idMozo;
	private Float porcentajeComision;
	private String Nombre;
	private String Apellido;
	private Integer antiguedad;

	public MozoDTO(Integer idMozo, Float porcentajeComision, String nombre, String apellido, Integer antiguedad) {
		super();
		this.idMozo = idMozo;
		this.porcentajeComision = porcentajeComision;
		Nombre = nombre;
		Apellido = apellido;
		this.antiguedad = antiguedad;
	}

	public Integer getIdMozo() {
		return idMozo;
	}

	public void setIdMozo(Integer idMozo) {
		this.idMozo = idMozo;
	}

	public Float getPorcentajeComision() {
		return porcentajeComision;
	}

	public void setPorcentajeComision(Float porcentajeComision) {
		this.porcentajeComision = porcentajeComision;
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

	public Integer getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}

	// TODO faltan metodos

}
