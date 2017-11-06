package org.repositorio.dtos;

import java.io.Serializable;
import java.util.List;

public abstract class AreaProduccionDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1959001633436079009L;
	private Integer id;
	private String TipoArea;
	private EncargadoDTO encargado;
	private List<ProductoComestibleDTO> productos;
	private List<ComandaDTO> comandas;

	public AreaProduccionDTO(Integer id, String tipoArea, EncargadoDTO encargado, List<ProductoComestibleDTO> productos,
			List<ComandaDTO> comandas) {
		super();
		this.id = id;
		TipoArea = tipoArea;
		this.encargado = encargado;
		this.productos = productos;
		this.comandas = comandas;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipoArea() {
		return TipoArea;
	}

	public void setTipoArea(String tipoArea) {
		TipoArea = tipoArea;
	}

	public EncargadoDTO getEncargado() {
		return encargado;
	}

	public void setEncargado(EncargadoDTO encargado) {
		this.encargado = encargado;
	}

	public List<ProductoComestibleDTO> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoComestibleDTO> productos) {
		this.productos = productos;
	}

	public List<ComandaDTO> getComandas() {
		return comandas;
	}

	public void setComandas(List<ComandaDTO> comandas) {
		this.comandas = comandas;
	}

	public boolean prepararComanda(ComandaDTO comanda) {
		// TODO Auto-generated method stub
		return false;
	}
}
