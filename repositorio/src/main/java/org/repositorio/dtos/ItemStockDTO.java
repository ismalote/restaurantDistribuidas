package org.repositorio.dtos;

import java.io.Serializable;

public class ItemStockDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3349436372116671575L;
	private InsumoDTO producto;
	private Integer CantidadEnStock;
	private Integer estimadoStock;

	public ItemStockDTO(InsumoDTO producto, Integer cantidadEnStock, Integer estimadoStock) {
		super();
		this.producto = producto;
		CantidadEnStock = cantidadEnStock;
		this.estimadoStock = estimadoStock;
	}

	public InsumoDTO getProducto() {
		return producto;
	}

	public void setProducto(InsumoDTO producto) {
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
