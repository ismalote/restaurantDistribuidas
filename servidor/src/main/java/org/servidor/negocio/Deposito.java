package org.servidor.negocio;

import java.util.List;

public class Deposito {

	private Integer idDeposito;

	private Encargado encargadoDeposito;

	private List<ItemStock> itemsStock;

	public Deposito(Encargado encargadoDeposito) {
		this.encargadoDeposito = encargadoDeposito;
	}

	public Encargado getEncargadoDeposito() {
		return encargadoDeposito;
	}

	public void setEncargadoDeposito(Encargado encargadoDeposito) {
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