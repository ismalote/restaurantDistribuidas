package org.repositorio.dtos;

import java.io.Serializable;
import java.util.Date;

public class ReservaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -766515447721507901L;
	private Date horaReserva;
	private Integer cantidadPersonas;
	private String descripcion;

	public ReservaDTO(Date horaReserva, Integer cantidadPersonas, String descripcion) {
		super();
		this.horaReserva = horaReserva;
		this.cantidadPersonas = cantidadPersonas;
		this.descripcion = descripcion;
	}

	public Date getHoraReserva() {
		return horaReserva;
	}

	public void setHoraReserva(Date horaReserva) {
		this.horaReserva = horaReserva;
	}

	public Integer getCantidadPersonas() {
		return cantidadPersonas;
	}

	public void setCantidadPersonas(Integer cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
