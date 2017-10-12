package org.repositorio.dtos;

public abstract class ProductoComestibleDTO {

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
