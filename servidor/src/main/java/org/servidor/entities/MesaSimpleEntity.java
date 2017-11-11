package org.servidor.entities;

import java.util.Date;

public class MesaSimpleEntity extends MesaEntity{
	
	
	private int numeroMesa;

	
	public MesaSimpleEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MesaSimpleEntity(Integer idMesa, Integer estadoMesa, SectorEntity sector, Integer cantidadSillas,
			Date horaOcupacion, Date horaLiberacion) {
		super(idMesa, estadoMesa, sector, cantidadSillas, horaOcupacion, horaLiberacion);
		// TODO Auto-generated constructor stub
	}

	public int getNumeroMesa() {
		return numeroMesa;
	}

	public void setNumeroMesa(int numeroMesa) {
		this.numeroMesa = numeroMesa;
	}
	

}
