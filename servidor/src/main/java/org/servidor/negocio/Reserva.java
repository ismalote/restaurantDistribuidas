package org.servidor.negocio;

import java.util.Date;

import org.repositorio.dtos.ReservaDTO;
import org.servidor.dao.ReservaDAO;
import org.servidor.entities.ReservaEntity;

public class Reserva {

	private Date horaReserva;
	private Integer cantidadPersonas;
	private String descripcion;

	public Reserva(Date horaReserva, Integer cantidadPersonas, String descripcion) {
		super();
		this.horaReserva = horaReserva;
		this.cantidadPersonas = cantidadPersonas;
		this.descripcion = descripcion;
	}

	public Reserva(ReservaEntity entity) {
		this.horaReserva = entity.getHoraReserva();
		this.cantidadPersonas = entity.getCantidadPersonas();
	}

	public Reserva(ReservaDTO dto) {
		this.horaReserva = dto.getHoraReserva();
		this.cantidadPersonas = dto.getCantidadPersonas();
		this.descripcion = dto.getDescripcion();
	}

	public Reserva() {
		// TODO Auto-generated constructor stub
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
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

	public boolean save() {
		return ReservaDAO.getInstancia().save(this);
	}

	public ReservaDTO toDTO() {
		return new ReservaDTO(this.horaReserva, this.cantidadPersonas, this.descripcion);
	}
}
