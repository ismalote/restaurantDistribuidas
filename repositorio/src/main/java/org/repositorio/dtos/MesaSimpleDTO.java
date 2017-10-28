package org.repositorio.dtos;

import java.io.Serializable;
import java.util.Date;

public class MesaSimpleDTO extends MesaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6505793254455019383L;

	public MesaSimpleDTO(Integer idMesa, EstadoMesaDTO estadoMesa, ReservaDTO reserva, Integer cantidadSillas,
			Date horaOcupacion, Date horaLiberacion) {
		super(idMesa, estadoMesa, reserva, cantidadSillas, horaOcupacion, horaLiberacion);
	}
}
