package org.servidor.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "productoSimple")
@PrimaryKeyJoinColumn(name = "idInsumo")
public class ProductoSimpleEntity extends ProductoComestibleEntity {

	public ProductoSimpleEntity() {
		super();
	}

	public ProductoSimpleEntity(Integer idInsumo, Float precio, Date fechaCreacion, Date fechaCaducidad,
			String descripcion, String unidad) {
		super(idInsumo, precio, fechaCreacion, fechaCaducidad, descripcion, unidad);
		// TODO Auto-generated constructor stub
	}

}
