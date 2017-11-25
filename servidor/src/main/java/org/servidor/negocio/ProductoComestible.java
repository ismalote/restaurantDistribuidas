package org.servidor.negocio;

import org.repositorio.dtos.ProductoComestibleDTO;
import org.servidor.entities.ProductoComestibleEntity;

public abstract class ProductoComestible {

	protected Integer idProducto;

	protected Integer cantidadPedido;
	protected Integer puntoPedido;
	protected String descripcion;
	protected Integer stock;
	protected Float precio;

	public ProductoComestible(Integer idProducto, Integer cantidadPedido, Integer puntoPedido, String descripcion,
			Integer stock, Float precio) {
		super();
		this.idProducto = idProducto;
		this.cantidadPedido = cantidadPedido;
		this.puntoPedido = puntoPedido;
		this.descripcion = descripcion;
		this.stock = stock;
		this.precio = precio;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public Integer getCantidadPedido() {
		return cantidadPedido;
	}

	public void setCantidadPedido(Integer cantidadPedido) {
		this.cantidadPedido = cantidadPedido;
	}

	public Integer getPuntoPedido() {
		return puntoPedido;
	}

	public void setPuntoPedido(Integer puntoPedido) {
		this.puntoPedido = puntoPedido;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public static ProductoComestible getNew(ProductoComestibleEntity entity) {

		return null;
	}

	public static ProductoComestible getNewDTO(ProductoComestibleDTO dto) {

		return null;
	}

}
