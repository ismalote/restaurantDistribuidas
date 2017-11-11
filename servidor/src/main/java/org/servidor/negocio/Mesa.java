package org.servidor.negocio;

import java.util.Date;

import org.repositorio.dtos.MesaDTO;
import org.servidor.Enum.EstadoMesa;
import org.servidor.dao.MesaDAO;
import org.servidor.entities.MesaEntity;

public abstract class Mesa {

	private Integer idMesa;
	private Reserva reserva;
	private Integer cantidadSillas;
	private Date horaOcupacion;
	private Date horaLiberacion;
	protected EstadoMesa estadoMesa;

	public Mesa(Integer idMesa, Reserva reserva, Integer cantidadSillas, Date horaOcupacion, Date horaLiberacion,
			EstadoMesa estadoMesa) {
		super();
		this.idMesa = idMesa;

		this.reserva = reserva;
		this.cantidadSillas = cantidadSillas;
		this.horaOcupacion = horaOcupacion;
		this.horaLiberacion = horaLiberacion;
	}

	public Mesa(MesaEntity entity) {
		this.idMesa= entity.getIdMesa();

		this.reserva = new Reserva(entity.getReserva());
		this.cantidadSillas= entity.getCantidadSillas();
		this.horaOcupacion=entity.getHoraOcupacion();
		this.horaLiberacion= entity.getHoraLiberacion();
		
		
	}

	public Mesa(MesaDTO dto) {
		this.idMesa = dto.getIdMesa();

		this.reserva = new Reserva(dto.getReserva());
		this.cantidadSillas = dto.getCantidadSillas();
		this.horaOcupacion = dto.getHoraOcupacion();
		this.horaLiberacion = dto.getHoraLiberacion();
	}

	public Mesa() {
		// TODO Auto-generated constructor stub
	}

	public abstract void cerrarMesa();

	public abstract int getNumeroMesa();
	

	public Integer getIdMesa() {
		return idMesa;
	}

	public void setIdMesa(Integer idMesa) {
		this.idMesa = idMesa;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public abstract Integer getCantidadSillas();

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

	public EstadoMesa getEstadoMesa() {
		return estadoMesa;
	}

	public void setEstadoMesa(EstadoMesa estadoMesa) {
		this.estadoMesa = estadoMesa;
	}

	public boolean save() {
		return MesaDAO.getInstancia().save(this);
	}
	// TODO falta metodo y nose como poner simple y compuesta

}
