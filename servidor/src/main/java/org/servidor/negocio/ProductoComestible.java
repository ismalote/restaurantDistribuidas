package org.servidor.negocio;

import org.repositorio.dtos.ProductoComestibleDTO;
import org.servidor.entities.ElaboradoEntity;
import org.servidor.entities.ProductoComestibleEntity;

public abstract class ProductoComestible {

	protected Area area;
	protected Integer estimadoStock;

	public ProductoComestible(Area area, Integer estimadoStock) {
		super();
		this.area = area;
		this.estimadoStock = estimadoStock;
	}

	public ProductoComestible(ElaboradoEntity entity) {
		
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
	
	public static ProductoComestible getNew(ProductoComestibleEntity entity) {
		
		return null;
	}
	public static ProductoComestible getNewDTO(ProductoComestibleDTO dto) {
		
		return null;
	}

}
