package org.servidor.negocio;

import java.util.Date;

import org.repositorio.dtos.MesaDTO;
import org.repositorio.dtos.MesaSimpleDTO;
import org.servidor.Enum.EstadoMesa;
import org.servidor.entities.MesaEntity;

public class MesaSimple extends Mesa {

	private int numeroMesa;
	
	public MesaSimple() {
		super();
	}

	public MesaSimple(Integer idMesa, Reserva reserva, Integer cantidadSillas, Date horaOcupacion, Date horaLiberacion,
			EstadoMesa estadoMesa) {
		super(idMesa, reserva, cantidadSillas, horaOcupacion, horaLiberacion, estadoMesa);
	}

	public MesaSimple(MesaDTO dto) {
		super(dto);
	}

	public MesaSimple(MesaEntity entity) {
		super(entity);
	}

	@Override
	public void cerrarMesa() {
		this.estadoMesa = EstadoMesa.LIBRE;
		this.save();
	}

	@Override
	public int getNumeroMesa() {
		return this.numeroMesa;
	}

	@Override
	public Integer getCantidadSillas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MesaDTO buildDTO() {
		MesaSimpleDTO ms = new MesaSimpleDTO(); // TODO
		return ms;
	}

}
