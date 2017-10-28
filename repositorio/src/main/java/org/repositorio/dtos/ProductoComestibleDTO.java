package org.repositorio.dtos;

import java.io.Serializable;

public abstract class ProductoComestibleDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4320034626363737189L;
	protected Integer idProducto;
	protected AreaProduccionDTO area;
	protected Integer cantidadPedido;
	protected Integer puntoPedido;
	protected String descripcion;
	protected Integer stock;
	protected Float precio;
	public ProductoComestibleDTO(Integer idProducto, AreaProduccionDTO area, Integer cantidadPedido,
			Integer puntoPedido, String descripcion, Integer stock, Float precio) {
		super();
		this.idProducto = idProducto;
		this.area = area;
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
	public AreaProduccionDTO getArea() {
		return area;
	}
	public void setArea(AreaProduccionDTO area) {
		this.area = area;
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

	
}
