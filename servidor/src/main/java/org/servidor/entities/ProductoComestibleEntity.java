package org.servidor.entities;

public abstract class ProductoComestibleEntity {
	
	@Id
	@Column(name="idProducto")
	protected Integer idProducto;
	
	
	protected AreaEntity area;
	protected Integer estimadoStock;
	
	public ProductoComestibleEntity() {
		
	}


	public ProductoComestibleEntity (Integer id, AreaEntity area1, Integer estimado) {
		this.area=ProductoComestibleEntity area1;
		this.estimadoStock= estimado;
		this.idProducto= id;
	}
	
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
