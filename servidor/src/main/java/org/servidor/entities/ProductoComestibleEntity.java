package org.servidor.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.servidor.negocio.ProductoComestible;

@Entity
@Table(name = "productoComestible")
public abstract class ProductoComestibleEntity extends InsumoEntity {

	@ManyToOne
	protected AreaProduccionEntity AreaProdu;

	protected Integer cantidadPedido;
	protected String descripcion;
	protected Integer stock;
	protected Integer puntoPedido;

	public ProductoComestibleEntity() {
	}

	public ProductoComestibleEntity(Integer idInsumo, Float precio, Date fechaCreacion, Date fechaCaducidad,
			String descripcion, String unidad) {
		super(idInsumo, precio, fechaCreacion, fechaCaducidad, descripcion, unidad);
	}

	public abstract ProductoComestible getNegocio();
	
	
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

}
