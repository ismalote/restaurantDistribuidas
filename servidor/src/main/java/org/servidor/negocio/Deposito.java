package org.servidor.negocio;

import java.util.List;

public class Deposito {

	private Integer idDeposito;

	private Operador encargadoDeposito;

	private List<ItemStock> itemsStock;

	public Deposito(Operador encargadoDeposito) {
		this.encargadoDeposito = encargadoDeposito;
	}

	public Operador getEncargadoDeposito() {
		return encargadoDeposito;
	}

	public void setEncargadoDeposito(Operador encargadoDeposito) {
		this.encargadoDeposito = encargadoDeposito;
	}

	public Integer getIdDeposito() {
		return idDeposito;
	}

	public void setIdDeposito(Integer idDeposito) {
		this.idDeposito = idDeposito;
	}

	public List<ItemStock> getItemsStock() {
		return itemsStock;
	}

	public void setItemsStock(List<ItemStock> itemsStock) {
		this.itemsStock = itemsStock;
	}

}