package org.repositorio.dtos;

import java.util.Date;

public class MesaSimpleDTO extends MesaDTO {

	public MesaSimpleDTO(Integer idMesa, EstadoMesaDTO estadoMesa, ReservaDTO reserva, Integer cantidadSillas,
			Date horaOcupacion, Date horaLiberacion) {
		super(idMesa, estadoMesa, reserva, cantidadSillas, horaOcupacion, horaLiberacion);
	}
}
