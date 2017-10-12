package org.servidor.entities;

import java.util.List;

public class ElaboradoEntity extends ProductoComestibleEntity {

	private List<ProductoComestibleEntity> productos;
	private UnidadEntity unidad;

	public List<ProductoComestibleEntity> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoComestibleEntity> productos) {
		this.productos = productos;
	}

	public UnidadEntity getUnidad() {
		return unidad;
	}

	public void setUnidad(UnidadEntity unidad) {
		this.unidad = unidad;
	}

}
