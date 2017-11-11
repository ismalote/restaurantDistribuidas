package org.servidor.entities;

import java.sql.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("materiaPrima")
public class MateriaPrimaEntity extends InsumoEntity {

	public MateriaPrimaEntity(Integer idInsumo, Float precio, Date fechaCreacion, Date fechaCaducidad,
			String descripcion, String unidad) {
		super(idInsumo, precio, fechaCreacion, fechaCaducidad, descripcion, unidad);
		// TODO Auto-generated constructor stub
	}
	public MateriaPrimaEntity() {
	
		super();
		// TODO Auto-generated constructor stub
	}
	// sacar ?? ya que insumo viene cubriendo las propiedades de materia prima
	// preguntar

}
