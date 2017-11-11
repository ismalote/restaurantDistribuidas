package org.servidor.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "idInsumo")
public class LimpiezaEntity extends InsumoEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LimpiezaEntity(Integer idInsumo, Float precio, Date fechaCreacion, Date fechaCaducidad, String descripcion,
			Float cantidad, String unidad) {
		super(idInsumo, precio, fechaCreacion, fechaCaducidad, descripcion, unidad);
		// TODO Auto-generated constructor stub
	}

	public LimpiezaEntity() {
		// TODO Auto-generated constructor stub
	}
}
