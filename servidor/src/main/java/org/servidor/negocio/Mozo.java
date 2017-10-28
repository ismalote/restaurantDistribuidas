package org.servidor.negocio;

import java.util.List;
import org.repositorio.dtos.MozoDTO;
import org.servidor.entities.MozoEntity;

public class Mozo {

	private Integer idMozo;
	private Float porcentajeComision;
	private String nombre;
	private String apellido;
	private Integer antiguedad;
	private List<Mesa> mesas;

	public Mozo(Integer idMozo, Float porcentajeComision, String nombre, String apellido, Integer antiguedad) {
		super();
		this.idMozo = idMozo;
		this.porcentajeComision = porcentajeComision;
		this.nombre = nombre;
		this.apellido = apellido;
		this.antiguedad = antiguedad;
	}


	public Mozo(MozoEntity entity) {
		this.idMozo= entity.getIdMozo();
		this.porcentajeComision= entity.getPorcentajeComision();
		this.Nombre= entity.getNombre();
		this.Apellido= entity.getApellido();
		this.antiguedad= entity.getAntiguedad();
		
	}



	public Mozo(MozoDTO dto) {
		
		this.idMozo= dto.getIdMozo();
		this.porcentajeComision= dto.getPorcentajeComision();
		this.Nombre= dto.getNombre();
		this.Apellido= dto.getApellido();
		this.antiguedad= dto.getAntiguedad();
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
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}

	public List<Mesa> getMesas() {
		return mesas;
	}

	public void setMesas(List<Mesa> mesas) {
		this.mesas = mesas;
	}

	// TODO faltan metodos

}
