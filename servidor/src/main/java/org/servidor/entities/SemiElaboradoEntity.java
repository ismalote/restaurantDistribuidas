package org.servidor.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="idInsumo")
public class SemiElaboradoEntity extends ProductoComestibleEntity {

	@OneToMany(mappedBy = "semielaborado")
	private List<ProductoComestibleEntity> materiales;

	public SemiElaboradoEntity(Integer idInsumo, Float precio, Date fechaCreacion, Date fechaCaducidad,
			String descripcion, String unidad) {
		super(idInsumo, precio, fechaCreacion, fechaCaducidad, descripcion, unidad);
		// TODO Auto-generated constructor stub
	}

	public SemiElaboradoEntity() {
		// TODO Auto-generated constructor stub
	}
}
