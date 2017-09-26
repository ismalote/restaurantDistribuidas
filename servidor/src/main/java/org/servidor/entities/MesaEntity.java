package org.servidor.entities;

import java.util.Date;

public class MesaEntity {
	
	private Integer idMesa;
	private EstadoMesaEntity estadoMesa;
	private ReservaEntity reserva;
	private Integer cantidadSillas;
	private Date horaOcupacion;
	private Date horaLiberacion;
	public Integer getIdMesa() {
		return idMesa;
	}
	public void setIdMesa(Integer idMesa) {
		this.idMesa = idMesa;
	}
	public EstadoMesaEntity getEstadoMesa() {
		return estadoMesa;
	}
	public void setEstadoMesa(EstadoMesaEntity estadoMesa) {
		this.estadoMesa = estadoMesa;
	}
	public ReservaEntity getReserva() {
		return reserva;
	}
	public void setReserva(ReservaEntity reserva) {
		this.reserva = reserva;
	}
	public Integer getCantidadSillas() {
		return cantidadSillas;
	}
	public void setCantidadSillas(Integer cantidadSillas) {
		this.cantidadSillas = cantidadSillas;
	}
	public Date getHoraOcupacion() {
		return horaOcupacion;
	}
	public void setHoraOcupacion(Date horaOcupacion) {
		this.horaOcupacion = horaOcupacion;
	}
	public Date getHoraLiberacion() {
		return horaLiberacion;
	}
	public void setHoraLiberacion(Date horaLiberacion) {
		this.horaLiberacion = horaLiberacion;
	}
	
	
	
	
	//TODO falta metodo y nose como poner simple y compuesta
	

}
