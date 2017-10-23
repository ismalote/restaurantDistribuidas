package org.servidor.negocio;

import java.util.Date;

public class MesaSimple extends Mesa {

	public MesaSimple(Integer idMesa, EstadoMesa estadoMesa, Reserva reserva, Integer cantidadSillas,
			Date horaOcupacion, Date horaLiberacion) {
		super(idMesa, estadoMesa, reserva, cantidadSillas, horaOcupacion, horaLiberacion);
	}
}
