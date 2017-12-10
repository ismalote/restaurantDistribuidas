package org.servidor.negocio;

import java.util.Date;

import org.repositorio.dtos.MesaDTO;
import org.repositorio.dtos.MesaSimpleDTO;
import org.servidor.Enum.EstadoMesa;
import org.servidor.entities.MesaEntity;
import org.servidor.entities.MesaSimpleEntity;

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
		this.numeroMesa = ((MesaSimpleEntity) entity).getNumeroMesa();
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
		return this.cantidadSillas;
	}

	@Override
	public MesaDTO buildDTO() {
		MesaSimpleDTO ms = new MesaSimpleDTO(); // TODO
		return ms;
	}

	public void setNumeroMesa(Integer numeroMesa2) {
		// TODO Auto-generated method stub
		this.numeroMesa= numeroMesa2;
		
	}

}
