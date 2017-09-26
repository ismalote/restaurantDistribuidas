package org.servidor.negocio;

public class ItemStock {
	
	private Insumo producto;
	private Integer CantidadEnStock;
	private Integer estimadoStock;
	public ItemStock(Insumo producto, Integer cantidadEnStock, Integer estimadoStock) {
		super();
		this.producto = producto;
		CantidadEnStock = cantidadEnStock;
		this.estimadoStock = estimadoStock;
	}
	public Insumo getProducto() {
		return producto;
	}
	public void setProducto(Insumo producto) {
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
