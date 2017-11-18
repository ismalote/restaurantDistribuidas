package org.servidor.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name = "idInsumo")
@Table(name = "limpieza")
public class LimpiezaEntity extends InsumoEntity {

	public LimpiezaEntity(Integer idInsumo, Float precio, Date fechaCreacion, Date fechaCaducidad, String descripcion,
			Float cantidad, String unidad) {
		super(idInsumo, precio, fechaCreacion, fechaCaducidad, descripcion, unidad);
		// TODO Auto-generated constructor stub
	}

	public LimpiezaEntity() {
		// TODO Auto-generated constructor stub
	}
}
