package org.servidor.negocio;

import java.util.List;

public class Elaborado extends ProductoComestible {

	private List<ProductoComestible> productos;
	private Unidad unidad;



	public Elaborado(Integer idProducto, AreaProduccion area, Integer cantidadPedido, Integer puntoPedido,
			String descripcion, Integer stock, Float precio) {
		super(idProducto, area, cantidadPedido, puntoPedido, descripcion, stock, precio);
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
