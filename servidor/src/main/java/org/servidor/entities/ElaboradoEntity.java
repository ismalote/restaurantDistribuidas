package org.servidor.entities;

import java.util.List;

public class ElaboradoEntity extends ProductoComestibleEntity {

	private List<ProductoComestibleEntity> productos;

	

	


	public ElaboradoEntity(Integer idProducto, AreaProduccionEntity areaProdu, Integer cantidadPedido,
			String descripcion, Integer stock, Integer puntoPedido, Float precio, List<PlatoEntity> platos,
			List<ProductoComestibleEntity> pro) {
		super(idProducto, areaProdu, cantidadPedido, descripcion, stock, puntoPedido, precio, platos);
		this.productos=pro;
		
		// TODO Auto-generated constructor stub
	}

	public List<ProductoComestibleEntity> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoComestibleEntity> productos) {
		this.productos = productos;
	}



}
