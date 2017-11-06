package org.servidor.negocio;

import java.util.List;

public abstract class AreaProduccion extends Area {
	private String TipoArea;
	private Encargado encargado;
	private List<ProductoComestible> productos;
	private List<Comanda> comandas;

	public AreaProduccion(Integer id, String tipoArea, Encargado encargado, List<ProductoComestible> productos,
			List<Comanda> comandas) {
		super(id);
		TipoArea = tipoArea;
		this.encargado = encargado;
		this.productos = productos;
		this.comandas = comandas;
	}

	public String getTipoArea() {
		return TipoArea;
	}

	public void setTipoArea(String tipoArea) {
		TipoArea = tipoArea;
	}

	public Encargado getEncargado() {
		return encargado;
	}

	public void setEncargado(Encargado encargado) {
		this.encargado = encargado;
	}

	public List<ProductoComestible> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoComestible> productos) {
		this.productos = productos;
	}

	public List<Comanda> getComandas() {
		return comandas;
	}

	public void setComandas(List<Comanda> comandas) {
		this.comandas = comandas;
	}

	public boolean prepararComanda(Comanda comanda) {
		// TODO Auto-generated method stub
		return false;
	}

}
