package org.servidor.Entities;

import java.util.Date;

public class ReservaEntity {
	
	private Boolean estado;
	private Date horaReserva;
	private Integer cantidadPersonas;
	
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
