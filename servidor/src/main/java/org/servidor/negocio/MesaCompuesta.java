package org.servidor.negocio;

import java.util.Date;
import java.util.List;

import org.repositorio.dtos.MesaDTO;
import org.servidor.Enum.EstadoMesa;
import org.servidor.entities.MesaEntity;

public class MesaCompuesta extends Mesa {

	private List<Mesa> mesas;

	public MesaCompuesta() {
		super();
	}

	public MesaCompuesta(Integer idMesa, Reserva reserva, Integer cantidadSillas, Date horaOcupacion,
			Date horaLiberacion, EstadoMesa estadoMesa, List<Mesa> mesas) {
		super(idMesa, reserva, cantidadSillas, horaOcupacion, horaLiberacion, estadoMesa);
		this.mesas = mesas;
	}

	public MesaCompuesta(MesaDTO dto) {
		super(dto);
	}

	public MesaCompuesta(MesaEntity entity) {
		super(entity);
	}

	@Override
	public void cerrarMesa() {
		for (Mesa mesa : this.mesas) {
			mesa.cerrarMesa();
		}
	}

}
