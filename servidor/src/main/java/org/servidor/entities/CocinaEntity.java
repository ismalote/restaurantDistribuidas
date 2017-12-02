package org.servidor.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;;

@Entity
@DiscriminatorValue(value = "COCINA")
public class CocinaEntity extends AreaProduccionEntity {

	public CocinaEntity(Integer idArea, LocalEntity localRestaurante) {
		super(idArea, null, null, localRestaurante);
	}

	public CocinaEntity() {
	}
}