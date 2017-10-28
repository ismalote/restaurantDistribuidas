package org.repositorio.dtos;

import java.io.Serializable;
import java.util.List;

public class PlatoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -156561835293452117L;
	private Integer idPlato;
	private List<ProductoComestibleDTO> plato;
	private Float precio;

	private ComandaDTO comandas;
	private CartaDTO carta;
	private Float comisionExtra;

	public PlatoDTO(Integer idPlato, List<ProductoComestibleDTO> plato, Float precio, ComandaDTO comandas,
			CartaDTO carta, Float comisionExtra) {
		super();
		this.idPlato = idPlato;
		this.plato = plato;
		this.precio = precio;
		this.comandas = comandas;
		this.carta = carta;
		this.comisionExtra = comisionExtra;
	}

	public Integer getIdPlato() {
		return idPlato;
	}

	public void setIdPlato(Integer idPlato) {
		this.idPlato = idPlato;
	}

	public List<ProductoComestibleDTO> getPlato() {
		return plato;
	}

	public void setPlato(List<ProductoComestibleDTO> plato) {
		this.plato = plato;
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

}