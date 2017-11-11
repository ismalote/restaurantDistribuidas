package org.servidor.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.servidor.negocio.Mozo;

@Entity
@Table(name = "mozo")
public class MozoEntity {

	@Id
	private Integer idMozo;
	private Float porcentajeComision;
	private String nombre;
	private String apellido;
	private Integer antiguedad;
	@OneToMany(mappedBy = "mozo")
	private List<ComandaEntity> comandasAbiertas;
	@ManyToOne
	private SectorEntity mozoSector;
	@ManyToOne
	private LocalEntity localRestaurante;

	public MozoEntity(Integer idMozo, Float porcentajeComision, String nombre, String apellido, Integer antiguedad,
			List<ComandaEntity> comandasAbiertas) {
		super();
		this.idMozo = idMozo;
		this.porcentajeComision = porcentajeComision;
		this.nombre = nombre;
		this.apellido = apellido;
		this.antiguedad = antiguedad;
		this.comandasAbiertas = comandasAbiertas;
	}

	public MozoEntity() {
		// TODO Auto-generated constructor stub
	}

	public MozoEntity(Mozo mozo) {
		// TODO Auto-generated constructor stub
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

	public List<ComandaEntity> getComandasAbiertas() {
		return comandasAbiertas;
	}

	public void setComandasAbiertas(List<ComandaEntity> comandasAbiertas) {
		this.comandasAbiertas = comandasAbiertas;
	}

}
