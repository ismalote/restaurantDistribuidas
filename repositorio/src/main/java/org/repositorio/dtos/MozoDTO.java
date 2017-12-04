package org.repositorio.dtos;

import java.io.Serializable;
import java.util.List;

public class MozoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -493855349530985514L;
	private Integer idMozo;
	private Float porcentajeComision;
	private String Nombre;
	private String Apellido;
	private Integer antiguedad;
	private List<ComandaDTO> comandasAbiertas;

	

	public MozoDTO(Integer idMozo, Float porcentajeComision, String nombre, String apellido, Integer antiguedad,
			List<ComandaDTO> comandasAbiertas) {
		super();
		this.idMozo = idMozo;
		this.porcentajeComision = porcentajeComision;
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.antiguedad = antiguedad;
		this.comandasAbiertas = comandasAbiertas;
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



	public List<ComandaDTO> getComandasAbiertas() {
		return comandasAbiertas;
	}



	public void setComandasAbiertas(List<ComandaDTO> comandasAbiertas) {
		this.comandasAbiertas = comandasAbiertas;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}
