package org.servidor.negocio;

import org.repositorio.dtos.InsumoDTO;

public class ItemStock {
	
	private InsumoDTO producto;
	private Integer CantidadEnStock;
	private Integer estimadoStock;
	public ItemStock(InsumoDTO producto, Integer cantidadEnStock, Integer estimadoStock) {
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
