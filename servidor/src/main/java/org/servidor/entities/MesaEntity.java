package org.servidor.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mesa")
public class MesaEntity {

	@Id
	private Integer idMesa;

	private Integer estadoMesa;
	// private Integer estadoMesa;

	// @OneToMany(mappedBy = "mesa")
	// private ReservaEntity reserva;

	@ManyToOne
	private SectorEntity sector;
	private Integer cantidadSillas;
	private Date horaOcupacion;
	private Date horaLiberacion;

	public MesaEntity() {
		// TODO Auto-generated constructor stub
	}

	public MesaEntity(Integer idMesa, Integer estadoMesa, SectorEntity sector, Integer cantidadSillas,
			Date horaOcupacion, Date horaLiberacion) {
		super();
		this.idMesa = idMesa;
		this.estadoMesa = estadoMesa;
		this.sector = sector;
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

	// public ReservaEntity getReserva() {
	// return reserva;
	// }

	// public void setReserva(ReservaEntity reserva) {
	// this.reserva = reserva;
	// }

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
