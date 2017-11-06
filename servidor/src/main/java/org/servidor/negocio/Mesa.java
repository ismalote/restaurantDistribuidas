package org.servidor.negocio;

import java.util.Date;

import org.repositorio.dtos.MesaDTO;
import org.servidor.entities.MesaEntity;

public class Mesa {

	private Integer idMesa;
	private EstadoMesa estadoMesa;
	private Reserva reserva;
	private Integer cantidadSillas;
	private Date horaOcupacion;
	private Date horaLiberacion;

	public Mesa(Integer idMesa, EstadoMesa estadoMesa, Reserva reserva, Integer cantidadSillas,
			Date horaOcupacion, Date horaLiberacion) {
		super();
		this.idMesa = idMesa;
		this.estadoMesa = estadoMesa;
		this.reserva = reserva;
		this.cantidadSillas = cantidadSillas;
		this.horaOcupacion = horaOcupacion;
		this.horaLiberacion = horaLiberacion;
	}

	public Mesa(MesaEntity entity) {
		this.idMesa= entity.getIdMesa();
		this.estadoMesa = new EstadoMesa(entity.getEstadoMesa());
		this.reserva= new Reserva (entity.getReserva());
		this.cantidadSillas= entity.getCantidadSillas();
		this.horaOcupacion=entity.getHoraOcupacion();
		this.horaLiberacion= entity.getHoraLiberacion();
		
		
	}

	public Mesa(MesaDTO dto) {
		this.idMesa= dto.getIdMesa();
		this.estadoMesa = new EstadoMesa(dto.getEstadoMesa());
		this.reserva= new Reserva (dto.getReserva());
		this.cantidadSillas= dto.getCantidadSillas();
		this.horaOcupacion=dto.getHoraOcupacion();
		this.horaLiberacion= dto.getHoraLiberacion();
	}

	public Mesa() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdMesa() {
		return idMesa;
	}

	public void setIdMesa(Integer idMesa) {
		this.idMesa = idMesa;
	}

	public EstadoMesa getEstadoMesa() {
		return estadoMesa;
	}

	public void setEstadoMesa(EstadoMesa estadoMesa) {
		this.estadoMesa = estadoMesa;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
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
