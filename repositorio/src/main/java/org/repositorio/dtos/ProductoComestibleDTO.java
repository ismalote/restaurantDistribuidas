package org.repositorio.dtos;

import java.io.Serializable;

public abstract class ProductoComestibleDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4320034626363737189L;
	protected AreaDTO area;
	protected Integer estimadoStock;

	public ProductoComestibleDTO(AreaDTO area, Integer estimadoStock) {
		super();
		this.area = area;
		this.estimadoStock = estimadoStock;
	}

	public AreaDTO getArea() {
		return area;
	}

	public void setArea(AreaDTO area) {
		this.area = area;
	}

	public Integer getEstimadoStock() {
		return estimadoStock;
	}

	public void setEstimadoStock(Integer estimadoStock) {
		this.estimadoStock = estimadoStock;
	}

}
