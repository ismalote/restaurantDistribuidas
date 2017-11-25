package org.servidor.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ItemInsumo")
public class ItemInsumoEntity {

	@Id
	private Integer idItemInsumo;
	@OneToOne
	@JoinColumn(name = "idInsumo")
	private InsumoEntity producto;
	private Integer CantidadEnStock;
	private Integer estimadoStock;

	public ItemInsumoEntity(Integer idItemInsumo,
			InsumoEntity producto /* , StockEntity stock */, Integer cantidadEnStock, Integer estimadoStock) {
		super();
		this.idItemInsumo = idItemInsumo;
		this.producto = producto;
		// this.stock = stock;
		this.CantidadEnStock = cantidadEnStock;
		this.estimadoStock = estimadoStock;
	}

	public ItemInsumoEntity() {
		// TODO Auto-generated constructor stub
	}


	public InsumoEntity getProducto() {
		return producto;
	}

	public void setProducto(InsumoEntity producto) {
		this.producto = producto;
	}

	// public StockEntity getStock() {
	// return stock;
	// }

	// public void setStock(StockEntity stock) {
	// this.stock = stock;
	// }

	public Integer getCantidadEnStock() {
		return CantidadEnStock;
	}

	public void setCantidadEnStock(Integer cantidadEnStock) {
		CantidadEnStock = cantidadEnStock;
	}

	public Integer getEstimadoStock() {
		return estimadoStock;
	}

	public void setEstimadoStock(Integer estimadoStock) {
		this.estimadoStock = estimadoStock;
	}

}
