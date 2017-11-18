package org.servidor.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("mesaSimple")
public class MesaSimpleEntity extends MesaEntity{
	
	private int numeroMesa;

}
