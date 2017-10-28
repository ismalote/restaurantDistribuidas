package org.servidor.negocio;

import java.util.List;

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
		 float resultado =0;
				
		List<Plato> aux = comanda.getPlatos();
		for (Plato p: aux){
			p.calcularPrecio();
			resultado=resultado + p.getPrecio();
			
		}
	}
	@Override
	public String toString() {
		return "Factura [cliente=" + cliente + ", montoTotal=" + montoTotal + "]";
	}

}
