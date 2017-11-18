package org.servidor.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.servidor.negocio.Reserva;

@Entity
@Table(name = "reserva")
public class ReservaEntity {

	@Id
	private Integer idReserva;
	private Boolean estado;
	private Date horaReserva;
	private Integer cantidadPersonas;

	public ReservaEntity(Integer idReserva, Boolean estado, Date horaReserva, Integer cantidadPersonas) {
		super();
		this.idReserva = idReserva;
		this.estado = estado;
		this.horaReserva = horaReserva;
		this.cantidadPersonas = cantidadPersonas;
	}

	public ReservaEntity() {
		// TODO Auto-generated constructor stub
	}

	public ReservaEntity(Reserva reserva) {
		this.idReserva= reserva.getCantidadPersonas();
		this.horaReserva=reserva.getHoraReserva();
		this.cantidadPersonas=reserva.getCantidadPersonas();
	}

	public Integer getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Integer idReserva) {
		this.idReserva = idReserva;
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
