package org.servidor.negocio;

import java.util.Date;

import org.repositorio.dtos.EstadoMesaDTO;
import org.repositorio.dtos.MesaDTO;
import org.repositorio.dtos.ReservaDTO;

public class MesaCompuesta extends MesaDTO {

	public MesaCompuesta(Integer idMesa, EstadoMesaDTO estadoMesa, ReservaDTO reserva, Integer cantidadSillas,
			Date horaOcupacion, Date horaLiberacion) {
		super(idMesa, estadoMesa, reserva, cantidadSillas, horaOcupacion, horaLiberacion);
	}
}
