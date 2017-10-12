package org.servidor.entities;

import java.util.List;

public class AreaProduccionEntity {
	private String TipoArea;
	private EncargadoAreaEntity encargadoArea;
	private StockEntity stock;
	private List<ComandaEntity> comandas;

	public String getTipoArea() {
		return TipoArea;
	}

	public void setTipoArea(String tipoArea) {
		TipoArea = tipoArea;
	}

	public EncargadoAreaEntity getEncargadoArea() {
		return encargadoArea;
	}

	public void setEncargadoArea(EncargadoAreaEntity encargadoArea) {
		this.encargadoArea = encargadoArea;
	}

	public StockEntity getStock() {
		return stock;
	}

	public void setStock(StockEntity stock) {
		this.stock = stock;
	}

	public List<ComandaEntity> getComandas() {
		return comandas;
	}

	public void setComandas(List<ComandaEntity> comandas) {
		this.comandas = comandas;
	}

	// TODO faltan metodos, no puedo justificar la herencia, asi que le meti un
	// parametro tipoArea, en la cual dice que area es ya que por el momento no
	// tienen comportamiento diferente.

}
