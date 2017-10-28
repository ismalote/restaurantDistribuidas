package org.servidor.negocio;

public abstract class ProductoComestible {

	protected Integer idProducto;
	protected AreaProduccion area;
	protected Integer cantidadPedido;
	protected Integer puntoPedido;
	protected String descripcion;
	protected Integer stock;
	protected Float precio;

	public ProductoComestible(Integer idProducto, AreaProduccion area, Integer cantidadPedido, Integer puntoPedido,
			String descripcion, Integer stock, Float precio) {
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

	public AreaProduccion getArea() {
		return area;
	}

	public void setArea(AreaProduccion area) {
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
