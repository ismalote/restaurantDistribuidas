package org.servidor.negocio;

import java.util.List;

import org.servidor.Enum.TipoArea;

public class AreaProduccion {
	private Integer idAreaProducion;
	private TipoArea tipoArea;
	private Operador encargado;
	private List<ProductoComestible> productos;

	public AreaProduccion(Integer id, Operador encargado, List<ProductoComestible> productos, TipoArea tipoArea) {
		this.idAreaProducion = id;
		this.encargado = encargado;
		this.productos = productos;
		this.tipoArea = tipoArea;
	}

	public Integer getId() {
		return idAreaProducion;
	}

	public void setId(Integer id) {
		this.idAreaProducion = id;
	}

	public Operador getEncargado() {
		return encargado;
	}

	public void setEncargado(Operador encargado) {
		this.encargado = encargado;
	}

	public List<ProductoComestible> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoComestible> productos) {
		this.productos = productos;
	}

	public Integer getIdAreaProducion() {
		return idAreaProducion;
	}

	public void setIdAreaProducion(Integer idAreaProducion) {
		this.idAreaProducion = idAreaProducion;
	}

	public TipoArea getTipoArea() {
		return tipoArea;
	}

	public void setTipoArea(TipoArea tipoArea) {
		this.tipoArea = tipoArea;
	}

}
