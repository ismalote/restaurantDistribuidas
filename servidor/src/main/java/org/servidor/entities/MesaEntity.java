package org.servidor.entities;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.servidor.Enum.EstadoMesa;

@Entity
@Table(name = "mesa")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType=DiscriminatorType.STRING)
public abstract class MesaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idMesa;

	private EstadoMesa estadoMesa;

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

	public MesaEntity(Integer idMesa, EstadoMesa estadoMesa, SectorEntity sector, Integer cantidadSillas,
			Date horaOcupacion, Date horaLiberacion) {
		super();
		this.idMesa = idMesa;
		this.estadoMesa = estadoMesa;
		this.sector = sector;
		this.cantidadSillas = cantidadSillas;
		this.horaOcupacion = horaOcupacion;
		this.horaLiberacion = horaLiberacion;
	}

	public EstadoMesa getEstadoMesa() {
		return estadoMesa;
	}

	public void setEstadoMesa(EstadoMesa estadoMesa) {
		this.estadoMesa = estadoMesa;
	}

	public SectorEntity getSector() {
		return sector;
	}

	public void setSector(SectorEntity sector) {
		this.sector = sector;
	}

	public Integer getIdMesa() {
		return idMesa;
	}

	public void setIdMesa(Integer idMesa) {
		this.idMesa = idMesa;
	}

	public ReservaEntity getReserva() {
		return null; // TODO
	}

	public void setReserva(ReservaEntity reserva) {
		// this.reserva = reserva; TODO
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
