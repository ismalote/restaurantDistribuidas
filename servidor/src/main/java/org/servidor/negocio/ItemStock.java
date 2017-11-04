package org.servidor.negocio;

public class ItemStock {

	private Insumo producto;
	private Integer CantidadEnStock;
	private Integer estimadoStock;
	private Integer idItemStock;

	public ItemStock(Insumo producto, Integer cantidadEnStock, Integer estimadoStock, Integer idItemStock) {
		super();
		this.producto = producto;
		CantidadEnStock = cantidadEnStock;
		this.estimadoStock = estimadoStock;
		this.idItemStock = idItemStock;
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

	public Integer getIdItemStock() {
		return idItemStock;
	}

	public void setIdItemStock(Integer idItemStock) {
		this.idItemStock = idItemStock;
	}

}
