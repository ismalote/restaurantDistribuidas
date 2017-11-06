package org.servidor.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="encargadoArea")
public class EncargadoAreaEntity extends EncargadoEntity {

	public EncargadoAreaEntity(Integer idEncargado, String nombre, String apellido, AreaProduccionEntity areaProdu) {
		super(idEncargado, nombre, apellido, areaProdu);
		// TODO Auto-generated constructor stub
	}

	// TODO que onda con este?
	

}
