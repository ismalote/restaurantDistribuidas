package org.servidor.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.servidor.negocio.ProductoComestible;
import org.servidor.negocio.SemiElaborado;

@Entity
@Table(name = "semiElaborado")
@PrimaryKeyJoinColumn(name = "idInsumo")
public class SemiElaboradoEntity extends ProductoComestibleEntity {

	@OneToMany
	private List<ProductoComestibleEntity> materiales;

	public SemiElaboradoEntity(Integer idInsumo, Float precio, Date fechaCreacion, Date fechaCaducidad,
			String descripcion, String unidad) {
		super(idInsumo, precio, fechaCreacion, fechaCaducidad, descripcion, unidad);
	}

	public SemiElaboradoEntity() {
	}

	@Override
	public ProductoComestible getNegocio() {
		return new SemiElaborado();
	}
}
