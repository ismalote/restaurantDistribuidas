package org.servidor.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.servidor.Enum.EstadoMesa;

@Entity
@Table(name="mesa")
public abstract class MesaEntity {
	
	@Id
	private Integer idMesa;
	@OneToOne
	@JoinColumn(name = "idEstadoMesa")
	private EstadoMesa estadoMesa;
//	private Integer estadoMesa;
	
	@OneToMany(mappedBy = "mesa")
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

	

	public EstadoMesa getEstadoMesa() {
		return estadoMesa;
	}

	public void setEstadoMesa(EstadoMesa estadoMesa) {
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

	// TODO falta metodo y nose como poner simple y compuesta

}
