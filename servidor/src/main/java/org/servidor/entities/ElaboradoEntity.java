package org.servidor.entities;

import java.util.List;

public class ElaboradoEntity extends ProductoComestibleEntity {

	private List<ProductoComestibleEntity> productos;
	private UnidadEntity unidad;
	

	


	public ElaboradoEntity(Integer idProducto, AreaProduccionEntity areaProdu, Integer cantidadPedido,
			String descripcion, Integer stock, Integer puntoPedido, Float precio, List<PlatoEntity> platos,
			List<ProductoComestibleEntity> pro,UnidadEntity uni) {
		super(idProducto, areaProdu, cantidadPedido, descripcion, stock, puntoPedido, precio, platos);
		this.productos=pro;
		this.unidad=uni;
		// TODO Auto-generated constructor stub
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
