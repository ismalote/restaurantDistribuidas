package org.servidor.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.servidor.negocio.Reserva;

@Entity
@Table(name = "reserva")
public class ReservaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idReserva;
	private Date horaReserva;
	private Integer cantidadPersonas;
	private String descripcion;

	public ReservaEntity(Integer idReserva, Boolean estado, Date horaReserva, Integer cantidadPersonas,
			String descripcion) {
		super();
		this.idReserva = idReserva;
		this.horaReserva = horaReserva;
		this.cantidadPersonas = cantidadPersonas;
		this.descripcion = descripcion;
	}

	public ReservaEntity() {
		// TODO Auto-generated constructor stub
	}

	public ReservaEntity(Reserva reserva) {
		this.horaReserva = reserva.getHoraReserva();
		this.cantidadPersonas = reserva.getCantidadPersonas();
		this.descripcion = reserva.getDescripcion();
	}

	public Integer getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Integer idReserva) {
		this.idReserva = idReserva;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
