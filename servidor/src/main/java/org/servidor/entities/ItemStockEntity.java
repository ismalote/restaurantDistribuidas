package org.servidor.entities;

public class ItemStockEntity {

	private InsumoEntity producto;
	private Integer CantidadEnStock;
	private Integer estimadoStock;

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

}
