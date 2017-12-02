package org.servidor.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("encargadoCaja")
public class EncargadoCajaEntity extends OperadorEntity {

	public EncargadoCajaEntity(Integer idEncargado, String nombre, String apellido, AreaProduccionEntity areaProdu,
			LocalEntity localRestaurante) {
		super(idEncargado, nombre, apellido, areaProdu, localRestaurante);
		// TODO Auto-generated constructor stub
	}

	public EncargadoCajaEntity() {
		// TODO Auto-generated constructor stub
	}
	// TODO que onda aca? que le ponemos?

}
