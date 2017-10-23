package org.repositorio.dtos;

import java.io.Serializable;
import java.util.Date;

public class MesaCompuesta extends MesaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 412216314822575240L;

	public MesaCompuesta(Integer idMesa, EstadoMesaDTO estadoMesa, ReservaDTO reserva, Integer cantidadSillas,
			Date horaOcupacion, Date horaLiberacion) {
		super(idMesa, estadoMesa, reserva, cantidadSillas, horaOcupacion, horaLiberacion);
	}
}
