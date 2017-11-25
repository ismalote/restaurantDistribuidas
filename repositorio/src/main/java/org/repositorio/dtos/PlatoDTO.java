package org.repositorio.dtos;

import java.io.Serializable;
import java.util.List;

public class PlatoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -156561835293452117L;
	private Integer idPlato;
	private List<ProductoComestibleDTO> productos;
	private Float precio;
	private ComandaDTO comandas;
	private CartaDTO carta;
	private Float comisionExtra;
	private AreaProduccionDTO area;



	public PlatoDTO(Integer idPlato, List<ProductoComestibleDTO> productos, Float precio, ComandaDTO comandas,
			CartaDTO carta, Float comisionExtra, AreaProduccionDTO area) {
		super();
		this.idPlato = idPlato;
		this.productos = productos;
		this.precio = precio;
		this.comandas = comandas;
		this.carta = carta;
		this.comisionExtra = comisionExtra;
		this.area = area;
	}

	public Integer getIdPlato() {
		return idPlato;
	}

	public void setIdPlato(Integer idPlato) {
		this.idPlato = idPlato;
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

	public ComandaDTO getComandas() {
		return comandas;
	}

	public void setComandas(ComandaDTO comandas) {
		this.comandas = comandas;
	}

	public CartaDTO getCarta() {
		return carta;
	}

	public void setCarta(CartaDTO carta) {
		this.carta = carta;
	}

	public Float getComisionExtra() {
		return comisionExtra;
	}

	public void setComisionExtra(Float comisionExtra) {
		this.comisionExtra = comisionExtra;
	}

	public AreaProduccionDTO getArea() {
		return area;
	}

	public void setArea(AreaProduccionDTO area) {
		this.area = area;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}