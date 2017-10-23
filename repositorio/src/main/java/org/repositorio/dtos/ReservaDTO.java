package org.repositorio.dtos;

import java.io.Serializable;
import java.util.Date;

public class ReservaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -766515447721507901L;
	private Boolean estado;
	private Date horaReserva;
	private Integer cantidadPersonas;

	public ReservaDTO(Boolean estado, Date horaReserva, Integer cantidadPersonas) {
		super();
		this.estado = estado;
		this.horaReserva = horaReserva;
		this.cantidadPersonas = cantidadPersonas;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
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

}
