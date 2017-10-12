package org.servidor.negocio;

import java.util.List;

import org.repositorio.dtos.AreaDTO;
import org.repositorio.dtos.ProductoComestibleDTO;
import org.repositorio.dtos.UnidadDTO;

public class Elaborado extends ProductoComestibleDTO {

	private List<ProductoComestibleDTO> productos;
	private UnidadDTO unidad;

	public Elaborado(AreaDTO area, Integer estimadoStock) {
		super(area, estimadoStock);
	}

	public Elaborado(AreaDTO area, Integer estimadoStock, List<ProductoComestibleDTO> productos, UnidadDTO unidad) {
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
