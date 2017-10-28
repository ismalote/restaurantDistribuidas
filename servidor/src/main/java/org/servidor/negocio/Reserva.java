package org.servidor.negocio;

import java.util.Date;

import org.repositorio.dtos.ReservaDTO;
import org.servidor.entities.ReservaEntity;

public class Reserva {

	private Boolean estado;
	private Date horaReserva;
	private Integer cantidadPersonas;

	public Reserva(Boolean estado, Date horaReserva, Integer cantidadPersonas) {
		super();
		this.estado = estado;
		this.horaReserva = horaReserva;
		this.cantidadPersonas = cantidadPersonas;
	}

	public Reserva(ReservaEntity entity) {
		this.estado = entity.getEstado();
		this.horaReserva= entity.getHoraReserva();
		this.cantidadPersonas=entity.getCantidadPersonas();
	}

	public Reserva(ReservaDTO dto) {
		this.estado = dto.getEstado();
		this.horaReserva= dto.getHoraReserva();
		this.cantidadPersonas=dto.getCantidadPersonas();
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
