package org.servidor.negocio;

import java.util.Date;
import java.util.List;

import org.repositorio.dtos.MesaCompuestaDTO;
import org.repositorio.dtos.MesaDTO;
import org.servidor.Enum.EstadoMesa;
import org.servidor.entities.MesaEntity;

public class MesaCompuesta extends Mesa {

	private List<Mesa> mesas;

	
	public MesaCompuesta() {
		super();
	}
	
	public MesaCompuesta(MesaEntity entity) {
		super(entity);
	}

	public MesaCompuesta(Integer idMesa, Reserva reserva, Integer cantidadSillas, Date horaOcupacion,
			Date horaLiberacion, EstadoMesa estadoMesa, List<Mesa> mesas) {
		super(idMesa, reserva, cantidadSillas, horaOcupacion, horaLiberacion, estadoMesa);
		this.mesas = mesas;
	}

	public List<Mesa> getMesas() {
		return mesas;
	}

	public void setMesas(List<Mesa> mesas) {
		this.mesas = mesas;
	}

	@Override
	public void cerrarMesa() {
		for (Mesa mesa : this.mesas) {
			mesa.setEstadoMesa(EstadoMesa.LIBRE);
		}
		super.save(); // TODO Check si cascade funca
	}

	@Override
	public int getNumeroMesa() {
		int mayor = 0;
		for (Mesa mesa : mesas) {
			int numeroMesa = mesa.getNumeroMesa();
			if (numeroMesa > mayor) {
				mayor = numeroMesa;
			}
		}
		if (mayor > 0) {
			return mayor;
		} else {
			throw new RuntimeException();
		}
	}

	@Override
	public Integer getCantidadSillas() {
		int cantidad = 0;
		for (Mesa mesa : mesas) {
			cantidad = cantidad + mesa.getCantidadSillas();

		}
		return cantidad;
	}

	@Override
	protected MesaDTO buildDTO() {
		return new MesaCompuestaDTO(); // TODO
	}

}
