package org.repositorio.dtos;

import java.io.Serializable;
import java.util.List;

public class PlatoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -156561835293452117L;
	private List<ProductoComestibleDTO> productos;
	private Float precio;
	private AreaDTO area;
	private Float comisionExtra;

	public PlatoDTO(List<ProductoComestibleDTO> plato, Float precio, AreaDTO area, Float comisionExtra) {
		super();
		this.productos = plato;
		this.precio = precio;
		this.area = area;
		this.comisionExtra = comisionExtra;
	}

	public List<ProductoComestibleDTO> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoComestibleDTO> plato) {
		this.productos = plato;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public AreaDTO getArea() {
		return area;
	}

	public void setArea(AreaDTO area) {
		this.area = area;
	}

	public Float getComisionExtra() {
		return comisionExtra;
	}

	public void setComisionExtra(Float comisionExtra) {
		this.comisionExtra = comisionExtra;
	}

}
