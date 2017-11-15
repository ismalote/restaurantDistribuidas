package org.servidor.entities;

import java.util.Date;

import org.servidor.Enum.EstadoMesa;

public class MesaSimpleEntity extends MesaEntity {

	private Integer numeroMesa;

	public MesaSimpleEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MesaSimpleEntity(Integer idMesa, EstadoMesa estadoMesa, SectorEntity sector, Integer cantidadSillas,
			Date horaOcupacion, Date horaLiberacion) {
		super(idMesa, estadoMesa, sector, cantidadSillas, horaOcupacion, horaLiberacion);
	}

	public Integer getNumeroMesa() {
		return numeroMesa;
	}

	public void setNumeroMesa(Integer numeroMesa) {
		this.numeroMesa = numeroMesa;
	}

}
