package org.servidor.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("areaProduccion")
public class EncargadoAreaEntity extends EncargadoEntity {

	public EncargadoAreaEntity(Integer idEncargado, String nombre, String apellido, AreaProduccionEntity areaProdu,
			LocalEntity localRestaurante) {
		super(idEncargado, nombre, apellido, areaProdu, localRestaurante);
		// TODO Auto-generated constructor stub
	}

	public EncargadoAreaEntity() {
		// TODO Auto-generated constructor stub
		super();
	}

	// TODO que onda con este?

}
