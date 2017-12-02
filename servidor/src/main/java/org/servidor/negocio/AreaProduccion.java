package org.servidor.negocio;

import java.util.List;

public abstract class AreaProduccion {
	private Integer idAreaProducion;
	private Operador encargado;
	private List<ProductoComestible> productos;
	private List<Comanda> comandas;

	public AreaProduccion(Integer id, Operador encargado, List<ProductoComestible> productos, List<Comanda> comandas) {
		this.idAreaProducion = id;
		this.encargado = encargado;
		this.productos = productos;
		this.comandas = comandas;
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
