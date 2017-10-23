package org.servidor.entities;

import java.util.List;

public class ElaboradoEntity extends ProductoComestibleEntity {

	private List<ProductoComestibleEntity> productos;
	private UnidadEntity unidad;
	
	public ElaboradoEntity () {
		
	}
	
	public ElaboradoEntity (Integer id, AreaEntity area1, Integer estimado, UnidadEntity unidad, 
			List<ProductoComestibleEntity> productos) {
		super (id,area1,estimado);
		this.productos= productos;
		this.unidad= unidad;
	}

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
