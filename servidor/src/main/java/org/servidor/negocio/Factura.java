package org.servidor.negocio;

import java.util.ArrayList;
import java.util.List;

import org.repositorio.dtos.FacturaDTO;
import org.repositorio.dtos.ItemPlatoDTO;
import org.servidor.entities.FacturaEntity;
import org.servidor.entities.ItemPlatoEntity;

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

	public Factura(FacturaEntity entity) {
		this.cliente = entity.getCliente();
		this.montoTotal=entity.getMontoTotal();
		this.itemsPlato = new ArrayList<ItemPlato>();
		for (ItemPlatoEntity item : entity.getItemsPlato()) {
			this.itemsPlato.add(new ItemPlato(item));
		}
		
		
	}

	public Factura(FacturaDTO dto) {
		this.cliente = dto.getCliente();
		this.montoTotal=dto.getMontoTotal();
		this.itemsPlato = new ArrayList<ItemPlato>();
		for (ItemPlatoDTO item : dto.getItemsPlato()) {
			this.itemsPlato.add(new ItemPlato(item));
		}
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
