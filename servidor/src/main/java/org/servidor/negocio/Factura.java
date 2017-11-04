package org.servidor.negocio;

import java.util.List;

import org.repositorio.dtos.FacturaDTO;
import org.servidor.entities.FacturaEntity;

public class Factura {

	private String cliente;
	private double montoTotal;
	private Comanda comanda;

	public Factura(String cliente, double montoTotal, Comanda comanda) {
		super();
		this.cliente = cliente;
		this.montoTotal = montoTotal;
		this.comanda = comanda;
	}

	public Factura(FacturaEntity entity) {
		this.cliente = entity.getCliente();
		this.montoTotal = entity.getMontoTotal();
		this.comanda = new Comanda(entity.getComanda());
	}

	public Factura(FacturaDTO dto) {
		this.cliente = dto.getCliente();
		this.montoTotal = dto.getMontoTotal();
		this.comanda = new Comanda(dto.getComanda());
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

	public Comanda getComanda() {
		return comanda;
	}

	public void setComanda(Comanda comanda) {
		this.comanda = comanda;
	}

	public void calcularPrecio() {

		// TODO Auto-generated method stub
		float resultado = 0;

		List<ItemComanda> aux = comanda.getPlatos();
		for (ItemComanda p : aux) {
			p.getPlato().calcularPrecio();
			resultado = resultado + p.getPlato().getPrecio();

		}
	}

	@Override
	public String toString() {
		return "Factura [cliente=" + cliente + ", montoTotal=" + montoTotal + "]";
	}

}
