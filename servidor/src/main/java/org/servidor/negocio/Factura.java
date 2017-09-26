package org.servidor.negocio;

import java.util.List;

public class Factura {
	
	private String cliente;
	private double montoTotal;
	private List<ItemPlato> itemsPlato;
	private List<ItemBebida> itemsBebida;
	
	
	public Factura(String cliente, double montoTotal, List<ItemPlato> itemsPlato, List<ItemBebida> itemsBebida) {
		this.cliente = cliente;
		this.montoTotal = montoTotal;
		this.itemsPlato = itemsPlato;
		this.itemsBebida = itemsBebida;
	}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public double getMontoTotal() {
		return montoTotal;
	}


	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}


	public List<ItemPlato> getItemsPlato() {
		return itemsPlato;
	}


	public void setItemsPlato(List<ItemPlato> itemsPlato) {
		this.itemsPlato = itemsPlato;
	}


	public List<ItemBebida> getItemsBebida() {
		return itemsBebida;
	}


	public void setItemsBebida(List<ItemBebida> itemsBebida) {
		this.itemsBebida = itemsBebida;
	}


	@Override
	public String toString() {
		return "Factura [cliente=" + cliente + ", montoTotal=" + montoTotal + "]";
	}
	
	
	

}
