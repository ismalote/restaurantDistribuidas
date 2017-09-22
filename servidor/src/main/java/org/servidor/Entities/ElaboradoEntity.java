package org.servidor.Negocio;

import java.util.List;

public class Elaborado extends ProductoComestible {

	private List<ProductoComestible> productos;
	private Unidad unidad;
	
	public Elaborado() {
		super(area, estimadoStock);
		// TODO Auto-generated constructor stub
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
