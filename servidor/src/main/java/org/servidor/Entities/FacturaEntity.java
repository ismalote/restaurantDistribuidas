package org.servidor.Entities;

public class FacturaEntity {
	
	private String cliente;
	private double montoTotal;
	private List<ItemPlatoEntity> itemsPlato;
	private List<ItemBebidaEntity> itemsBebida;
	
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
	public List<ItemPlatoEntity> getItemsPlato() {
		return itemsPlato;
	}
	public void setItemsPlato(List<ItemPlatoEntity> itemsPlato) {
		this.itemsPlato = itemsPlato;
	}
	public List<ItemBebidaEntity> getItemsBebida() {
		return itemsBebida;
	}
	public void setItemsBebida(List<ItemBebidaEntity> itemsBebida) {
		this.itemsBebida = itemsBebida;
	}
	
	


	
	

}
