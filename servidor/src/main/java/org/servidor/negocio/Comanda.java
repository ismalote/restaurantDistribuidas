package org.servidor.negocio;

import java.util.List;

public class Comanda {
	
	private Integer idComanda;
	private List<Plato> platos;
	private Mozo mozo;
	private Boolean comandaLista;
	private Mesa mesa;
	private EstadoComanda estadoComanda;
	private Factura fact;
	private Local Local;
	
	public Comanda(Integer idComanda, List<Plato> platos, Mozo mozo, Boolean comandaLista, Mesa mesa,
			EstadoComanda estadoComanda, Factura fact) {
		super();
		this.idComanda = idComanda;
		this.platos = platos;
		this.mozo = mozo;
		this.comandaLista = comandaLista;
		this.mesa = mesa;
		this.estadoComanda = estadoComanda;
		this.fact = fact;
	}
	public Integer getIdComanda() {
		return idComanda;
	}
	public void setIdComanda(Integer idComanda) {
		this.idComanda = idComanda;
	}
	public List<Plato> getPlatos() {
		return platos;
	}
	public void setPlatos(List<Plato> platos) {
		this.platos = platos;
	}
	public Mozo getMozo() {
		return mozo;
	}
	public void setMozo(Mozo mozo) {
		this.mozo = mozo;
	}
	public Boolean getComandaLista() {
		return comandaLista;
	}
	public void setComandaLista(Boolean comandaLista) {
		this.comandaLista = comandaLista;
	}
	public Mesa getMesa() {
		return mesa;
	}
	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
	public EstadoComanda getEstadoComanda() {
		return estadoComanda;
	}
	public void setEstadoComanda(EstadoComanda estadoComanda) {
		this.estadoComanda = estadoComanda;
	}
	public Factura getFact() {
		return fact;
	}
	public void setFact(Factura fact) {
		this.fact = fact;
	}
	public Local getLocal() {
		return Local;
	}
	public void setLocal(Local local) {
		Local = local;
	}
	


}
