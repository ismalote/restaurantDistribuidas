package org.servidor.Negocio;

import java.util.List;

public class AreaProduccion {
	private String TipoArea;
	private EncargadoArea encargadoArea;
	private Stock stock;
	private List<Comanda> comandas;
	
	public AreaProduccion(String tipoArea, EncargadoArea encargadoArea, Stock stock, List<Comanda> comandas) {
		super();
		TipoArea = tipoArea;
		this.encargadoArea = encargadoArea;
		this.stock = stock;
		this.comandas = comandas;
	}

	public String getTipoArea() {
		return TipoArea;
	}

	public void setTipoArea(String tipoArea) {
		TipoArea = tipoArea;
	}

	public EncargadoArea getEncargadoArea() {
		return encargadoArea;
	}

	public void setEncargadoArea(EncargadoArea encargadoArea) {
		this.encargadoArea = encargadoArea;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public List<Comanda> getComandas() {
		return comandas;
	}

	public void setComandas(List<Comanda> comandas) {
		this.comandas = comandas;
	}
	
	
	// TODO faltan metodos, no puedo justificar la herencia, asi que le meti un parametro tipoArea, en la cual dice que area es ya que por el momento no tienen comportamiento diferente.
	
}
