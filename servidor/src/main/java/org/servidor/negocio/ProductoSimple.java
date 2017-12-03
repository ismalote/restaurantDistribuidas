package org.servidor.negocio;

public class ProductoSimple extends ProductoComestible {

	public ProductoSimple(Integer idProducto, Integer cantidadPedido, Integer puntoPedido, String descripcion, Integer stock,
			Float precio) {
		super(idProducto, cantidadPedido, puntoPedido, descripcion, stock, precio);
	}
	
	public ProductoSimple(){
		
	}

}
