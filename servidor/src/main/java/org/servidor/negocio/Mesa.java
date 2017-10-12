package org.servidor.negocio;

import java.util.Date;

import org.repositorio.dtos.EstadoMesaDTO;
import org.repositorio.dtos.ReservaDTO;

public class Mesa {

	private Integer idMesa;
	private EstadoMesaDTO estadoMesa;
	private ReservaDTO reserva;
	private Integer cantidadSillas;
	private Date horaOcupacion;
	private Date horaLiberacion;

	public Mesa(Integer idMesa, EstadoMesaDTO estadoMesa, ReservaDTO reserva, Integer cantidadSillas,
			Date horaOcupacion, Date horaLiberacion) {
		super();
		this.idMesa = idMesa;
		this.estadoMesa = estadoMesa;
		this.reserva = reserva;
		this.cantidadSillas = cantidadSillas;
		this.horaOcupacion = horaOcupacion;
		this.horaLiberacion = horaLiberacion;
	}

	public Integer getIdMesa() {
		return idMesa;
	}

	public void setIdMesa(Integer idMesa) {
		this.idMesa = idMesa;
	}

	public EstadoMesaDTO getEstadoMesa() {
		return estadoMesa;
	}

	public void setEstadoMesa(EstadoMesaDTO estadoMesa) {
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

	// TODO falta metodo y nose como poner simple y compuesta

}
