package org.servidor.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	private Integer CantidadEnStock;
	private Integer estimadoStock;


	public ItemStockEntity(InsumoEntity producto, Integer cantidadEnStock, Integer estimadoStock, Integer idItemStock) {
		super();
		this.producto = producto;
		CantidadEnStock = cantidadEnStock;
		this.estimadoStock = estimadoStock;
		this.idItemStock = idItemStock;
	}

	public InsumoEntity getProducto() {
		return producto;
	}

	public void setProducto(InsumoEntity producto) {
		this.producto = producto;
	}

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

	public Integer getIdItemStock() {
		return idItemStock;
	}

	public void setIdItemStock(Integer idItemStock) {
		this.idItemStock = idItemStock;
	}

}
