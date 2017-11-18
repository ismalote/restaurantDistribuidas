package org.servidor.negocio;

import java.util.ArrayList;
import java.util.List;

import org.repositorio.dtos.ComandaDTO;
import org.repositorio.dtos.MozoDTO;
import org.servidor.entities.ComandaEntity;
import org.servidor.entities.MozoEntity;

public class Mozo {

	private Integer idMozo;
	private Float porcentajeComision;
	private String nombre;
	private String apellido;
	private Integer antiguedad;
	private List<Comanda> comandasAbiertas;
	private List<Mesa> mesas;

	public Mozo(Integer idMozo, Float porcentajeComision, String nombre, String apellido, Integer antiguedad,
			List<Comanda> comandasAbiertas, List<Mesa> mesas) {
		super();
		this.idMozo = idMozo;
		this.porcentajeComision = porcentajeComision;
		this.nombre = nombre;
		this.apellido = apellido;
		this.antiguedad = antiguedad;
		this.comandasAbiertas = comandasAbiertas;
		this.mesas = mesas;
	}

	public Mozo(MozoEntity entity) {
		this.idMozo = entity.getIdMozo();
		this.porcentajeComision = entity.getPorcentajeComision();
		this.nombre = entity.getNombre();
		this.apellido = entity.getApellido();
		this.antiguedad = entity.getAntiguedad();
		List<Comanda> comandasAbiertas = new ArrayList<>();
		for (ComandaEntity c : entity.getComandasAbiertas()) {
			comandasAbiertas.add(new Comanda(c));

		}
	}

	public Mozo(MozoDTO dto) {

		this.idMozo = dto.getIdMozo();
		this.porcentajeComision = dto.getPorcentajeComision();
		this.nombre = dto.getNombre();
		this.apellido = dto.getApellido();
		this.antiguedad = dto.getAntiguedad();
		List<Comanda> comandasAbiertas = new ArrayList<>();
		for (ComandaDTO c : dto.getComandasAbiertas()) {
			comandasAbiertas.add(new Comanda(c));

		}
	}

	public Mozo() {
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

	public List<Comanda> getComandasAbiertas() {
		return comandasAbiertas;
	}

	public void setComandasAbiertas(List<Comanda> comandasAbiertas) {
		this.comandasAbiertas = comandasAbiertas;
	}

}
