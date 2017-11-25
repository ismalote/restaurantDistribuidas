package org.servidor.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;;

@Entity
@DiscriminatorValue(value = "CAFETERIA")
public class BarraEntity extends AreaProduccionEntity {

	public BarraEntity(Integer idArea, LocalEntity localRestaurante) {
		super(idArea, null, null, localRestaurante);
	}
}