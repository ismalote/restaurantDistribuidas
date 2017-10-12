package org.repositorio.dtos;

import java.util.List;

public class ElaboradoDTO extends ProductoComestibleDTO {

	private List<ProductoComestibleDTO> productos;
	private UnidadDTO unidad;

	public ElaboradoDTO(AreaDTO area, Integer estimadoStock) {
		super(area, estimadoStock);
	}

	public ElaboradoDTO(AreaDTO area, Integer estimadoStock, List<ProductoComestibleDTO> productos, UnidadDTO unidad) {
		super(area, estimadoStock);
		this.productos = productos;
		this.unidad = unidad;
	}

	public List<ProductoComestibleDTO> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoComestibleDTO> productos) {
		this.productos = productos;
	}

	public UnidadDTO getUnidad() {
		return unidad;
	}

	public void setUnidad(UnidadDTO unidad) {
		this.unidad = unidad;
	}

}
