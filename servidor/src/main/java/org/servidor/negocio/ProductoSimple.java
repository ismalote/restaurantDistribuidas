package org.servidor.negocio;

import java.util.List;

public class ProductoSimple extends ProductoComestible {

	private List<ProductoComestible> productos;

	public ProductoSimple(Integer idProducto, Integer cantidadPedido, Integer puntoPedido, String descripcion, Integer stock,
			Float precio) {
		super(idProducto, cantidadPedido, puntoPedido, descripcion, stock, precio);
	}
	
	public ProductoSimple(){
		
	}

	public List<ProductoComestible> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoComestible> productos) {
		this.productos = productos;
	}

}
