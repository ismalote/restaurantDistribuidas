package org.servidor.Negocio;

public abstract class ProductoComestible {

	protected Area area;
	protected Integer estimadoStock;
	
	public ProductoComestible(Area area, Integer estimadoStock) {
		super();
		this.area = area;
		this.estimadoStock = estimadoStock;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Integer getEstimadoStock() {
		return estimadoStock;
	}

	public void setEstimadoStock(Integer estimadoStock) {
		this.estimadoStock = estimadoStock;
	}
	
	

}
