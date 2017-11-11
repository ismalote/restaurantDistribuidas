package org.servidor.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ItemStock")
public class ItemStockEntity {

	@Id
	private Integer idItemStock;
	@OneToOne
	@JoinColumn(name = "idInsumo")
	private InsumoEntity producto;
	 @ManyToOne
	// @JoinColumn(name = "idStock")
	 private StockEntity stock;
	private Integer CantidadEnStock;
	private Integer estimadoStock;

	public ItemStockEntity(Integer idItemStock,
			InsumoEntity producto /* , StockEntity stock */, Integer cantidadEnStock, Integer estimadoStock) {
		super();
		this.idItemStock = idItemStock;
		this.producto = producto;
		// this.stock = stock;
		CantidadEnStock = cantidadEnStock;
		this.estimadoStock = estimadoStock;
	}

	public ItemStockEntity() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdItemStock() {
		return idItemStock;
	}

	public void setIdItemStock(Integer idItemStock) {
		this.idItemStock = idItemStock;
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
