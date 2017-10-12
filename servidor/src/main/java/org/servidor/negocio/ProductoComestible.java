package org.servidor.negocio;

import org.repositorio.dtos.AreaDTO;

public abstract class ProductoComestible {

	protected AreaDTO area;
	protected Integer estimadoStock;

	public ProductoComestible(AreaDTO area, Integer estimadoStock) {
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
