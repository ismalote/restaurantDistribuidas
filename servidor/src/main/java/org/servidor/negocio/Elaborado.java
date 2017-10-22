package org.servidor.negocio;

import java.util.List;

public class Elaborado extends ProductoComestible {

	private List<ProductoComestible> productos;
	private Unidad unidad;

	public Elaborado(Area area, Integer estimadoStock) {
		super(area, estimadoStock);
	}

	public Elaborado(Area area, Integer estimadoStock, List<ProductoComestible> productos, Unidad unidad) {
		super(area, estimadoStock);
		this.productos = productos;
		this.unidad = unidad;
	}

	public List<ProductoComestible> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoComestible> productos) {
		this.productos = productos;
	}

	public Unidad getUnidad() {
		return unidad;
	}

	public void setUnidad(Unidad unidad) {
		this.unidad = unidad;
	}

}
