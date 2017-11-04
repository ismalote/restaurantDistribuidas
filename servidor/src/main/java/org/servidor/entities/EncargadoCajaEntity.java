package org.servidor.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="encargadoCaja")
public class EncargadoCajaEntity extends EncargadoEntity {

	public EncargadoCajaEntity(Integer idEncargado, String nombre, String apellido, AreaProduccionEntity areaProdu) {
		super(idEncargado, nombre, apellido, areaProdu);
		// TODO Auto-generated constructor stub
	}

	// TODO que onda aca? que le ponemos?
	

}
