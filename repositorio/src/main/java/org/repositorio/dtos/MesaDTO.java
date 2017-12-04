package org.repositorio.dtos;

import java.io.Serializable;
import java.util.Date;

public class MesaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1172104457781444998L;
	private Integer idMesa;
	private String estadoMesa;
	private ReservaDTO reserva;
	private Integer cantidadSillas;
	private Date horaOcupacion;
	private Date horaLiberacion;

	public MesaDTO(Integer idMesa, String estadoMesa, ReservaDTO reserva, Integer cantidadSillas, Date horaOcupacion,
			Date horaLiberacion) {
		super();
		this.idMesa = idMesa;
		this.estadoMesa = estadoMesa;
		this.reserva = reserva;
		this.cantidadSillas = cantidadSillas;
		this.horaOcupacion = horaOcupacion;
		this.horaLiberacion = horaLiberacion;
	}

	public MesaDTO() {
	}
	
	public Integer getIdMesa() {
		return idMesa;
	}

	public void setIdMesa(Integer idMesa) {
		this.idMesa = idMesa;
	}

	public String getEstadoMesa() {
		return estadoMesa;
	}

	public void setEstadoMesa(String estadoMesa) {
		this.estadoMesa = estadoMesa;
	}

	public ReservaDTO getReserva() {
		return reserva;
	}

	public void setReserva(ReservaDTO reserva) {
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

	@Override
	public String toString() {
		return String.valueOf(this.idMesa);
	}
	
	// TODO falta metodo y nose como poner simple y compuesta

}
