package org.servidor.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.servidor.Enum.EstadoMesa;

@Entity
@DiscriminatorValue(value = "simple")
public class MesaSimpleEntity extends MesaEntity {

	private Integer numeroMesa;

	public MesaSimpleEntity() {
		super();
	}

	public MesaSimpleEntity(Integer idMesa, EstadoMesa estadoMesa, Integer cantidadSillas, Date horaOcupacion,
			Date horaLiberacion) {
		super(idMesa, estadoMesa, cantidadSillas, horaOcupacion, horaLiberacion);
		// TODO Auto-generated constructor stub
	}

	public Integer getNumeroMesa() {
		return numeroMesa;
	}

	public void setNumeroMesa(Integer numeroMesa) {
		this.numeroMesa = numeroMesa;
	}

}
