package org.servidor.negocio;

import java.util.Date;

import org.repositorio.dtos.MesaDTO;
import org.servidor.Enum.EstadoMesa;
import org.servidor.entities.MesaEntity;

public class MesaCompuesta extends Mesa {

	public MesaCompuesta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MesaCompuesta(Integer idMesa, Reserva reserva, Integer cantidadSillas, Date horaOcupacion,
			Date horaLiberacion, EstadoMesa estadoMesa) {
		super(idMesa, reserva, cantidadSillas, horaOcupacion, horaLiberacion, estadoMesa);
		// TODO Auto-generated constructor stub
	}

	public MesaCompuesta(MesaDTO dto) {
		super(dto);
		// TODO Auto-generated constructor stub
	}

	public MesaCompuesta(MesaEntity entity) {
		super(entity);
		// TODO Auto-generated constructor stub
	}

	
}
