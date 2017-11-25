package org.servidor.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;;

@Entity
@DiscriminatorValue(value = "BARRA")
public class CafeteriaEntity extends AreaProduccionEntity {

	public CafeteriaEntity(Integer idArea, LocalEntity localRestaurante) {
		super(idArea, null, null, localRestaurante);
	}
}