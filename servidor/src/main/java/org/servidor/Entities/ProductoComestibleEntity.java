package org.servidor.Entities;

public abstract class ProductoComestibleEntity {

	protected AreaEntity area;
	protected Integer estimadoStock;
	
	public AreaEntity getArea() {
		return area;
	}
	public void setArea(AreaEntity area) {
		this.area = area;
	}
	public Integer getEstimadoStock() {
		return estimadoStock;
	}
	public void setEstimadoStock(Integer estimadoStock) {
		this.estimadoStock = estimadoStock;
	}

	
	

}
