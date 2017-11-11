package org.repositorio.dtos;

import java.io.Serializable;
import java.util.Date;

public class MesaCompuestaDTO extends MesaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MesaCompuestaDTO(Integer idMesa, EstadoMesaDTO estadoMesa, ReservaDTO reserva, Integer cantidadSillas,
			Date horaOcupacion, Date horaLiberacion) {
		super(idMesa, estadoMesa, reserva, cantidadSillas, horaOcupacion, horaLiberacion);
		// TODO Auto-generated constructor stub
	}



	
}
