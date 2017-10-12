package org.repositorio.dtos;

import java.util.List;

public class FacturaDTO {

	private String cliente;
	private double montoTotal;
	private List<ItemPlatoDTO> itemsPlato;
	private List<ItemBebidaDTO> itemsBebida;

	public FacturaDTO(String cliente, double montoTotal, List<ItemPlatoDTO> itemsPlato,
			List<ItemBebidaDTO> itemsBebida) {
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

	public List<ItemPlatoDTO> getItemsPlato() {
		return itemsPlato;
	}

	public void setItemsPlato(List<ItemPlatoDTO> itemsPlato) {
		this.itemsPlato = itemsPlato;
	}

	public List<ItemBebidaDTO> getItemsBebida() {
		return itemsBebida;
	}

	public void setItemsBebida(List<ItemBebidaDTO> itemsBebida) {
		this.itemsBebida = itemsBebida;
	}

	@Override
	public String toString() {
		return "Factura [cliente=" + cliente + ", montoTotal=" + montoTotal + "]";
	}

}
