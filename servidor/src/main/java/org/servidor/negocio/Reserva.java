package org.servidor.negocio;

import java.util.Date;

import org.repositorio.dtos.ReservaDTO;
import org.servidor.dao.ReservaDAO;
import org.servidor.entities.ReservaEntity;

public class Reserva {

	private Date horaReserva;
	private Integer cantidadPersonas;

	public Reserva(Date horaReserva, Integer cantidadPersonas) {
		super();
		this.horaReserva = horaReserva;
		this.cantidadPersonas = cantidadPersonas;
	}

	public Reserva(ReservaEntity entity) {
		this.horaReserva = entity.getHoraReserva();
		this.cantidadPersonas = entity.getCantidadPersonas();
	}

	public Reserva(ReservaDTO dto) {
		this.horaReserva = dto.getHoraReserva();
		this.cantidadPersonas = dto.getCantidadPersonas();
	}

	public Reserva() {
		// TODO Auto-generated constructor stub
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

	public boolean save() {
		return ReservaDAO.getInstancia().save(this);
	}

	public ReservaDTO toDTO() {
		return new ReservaDTO(this.horaReserva, this.cantidadPersonas);
	}
}
