package org.servidor.negocio;

import java.util.Date;
import java.util.List;

import org.servidor.Enum.EstadoMesa;

public class MesaCompuesta extends Mesa {

	private List<Mesa> mesas;
	public MesaCompuesta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MesaCompuesta(Integer idMesa, Reserva reserva, Integer cantidadSillas, Date horaOcupacion,
			Date horaLiberacion, EstadoMesa estadoMesa) {
		super(idMesa, reserva, cantidadSillas, horaOcupacion, horaLiberacion, estadoMesa);
		// TODO Auto-generated constructor stub
	}

	public List<Mesa> getMesas() {
		return mesas;
	}

	public void setMesas(List<Mesa> mesas) {
		this.mesas = mesas;
	}


	
}
