package org.servidor.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

public abstract class ProductoComestibleEntity {

	@Id
	@Column(name = "idProducto")
	protected Integer idProducto;

	@OneToOne
	@JoinColumn(name = "idAreaProdu")
	protected AreaProduccionEntity AreaProdu;

	protected Integer cantidadPedido;
	protected String descripcion;
	protected Integer stock;
	protected Integer puntoPedido;
	protected Float precio;

	@ManyToMany
	protected List<PlatoEntity> platos;

	public ProductoComestibleEntity(Integer idProducto, AreaProduccionEntity areaProdu, Integer cantidadPedido,
			String descripcion, Integer stock, Integer puntoPedido, Float precio, List<PlatoEntity> platos) {
		super();
		this.idProducto = idProducto;
		AreaProdu = areaProdu;
		this.cantidadPedido = cantidadPedido;
		this.descripcion = descripcion;
		this.stock = stock;
		this.puntoPedido = puntoPedido;
		this.precio = precio;
		this.platos = platos;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public AreaProduccionEntity getAreaProdu() {
		return AreaProdu;
	}

	public void setAreaProdu(AreaProduccionEntity areaProdu) {
		AreaProdu = areaProdu;
	}

	public Integer getCantidadPedido() {
		return cantidadPedido;
	}

	public void setCantidadPedido(Integer cantidadPedido) {
		this.cantidadPedido = cantidadPedido;
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

	public Integer getPuntoPedido() {
		return puntoPedido;
	}

	public void setPuntoPedido(Integer puntoPedido) {
		this.puntoPedido = puntoPedido;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public List<PlatoEntity> getPlatos() {
		return platos;
	}

	public void setPlatos(List<PlatoEntity> platos) {
		this.platos = platos;
	}

}
