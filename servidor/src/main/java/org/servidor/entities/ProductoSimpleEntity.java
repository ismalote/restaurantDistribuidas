package org.servidor.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("simple")
public class ProductoSimpleEntity extends ProductoComestibleEntity {

	private List<ProductoComestibleEntity> productos;

	public ProductoSimpleEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductoSimpleEntity(Integer idInsumo, Float precio, Date fechaCreacion, Date fechaCaducidad,
			String descripcion, String unidad) {
		super(idInsumo, precio, fechaCreacion, fechaCaducidad, descripcion, unidad);
		// TODO Auto-generated constructor stub
	}

	public List<ProductoComestibleEntity> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoComestibleEntity> productos) {
		this.productos = productos;
	}

}
