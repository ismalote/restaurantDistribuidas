package org.servidor.negocio;

import java.util.ArrayList;
import java.util.List;

import org.repositorio.dtos.ComandaDTO;
import org.repositorio.dtos.PlatoDTO;
import org.servidor.entities.ComandaEntity;
import org.servidor.entities.PlatoEntity;

public class Comanda {

	private List<Plato> platos;
	private Mozo mozo;
	private Boolean comandaLista;
	private Mesa mesa;
	private List<Bebida> bebidas;
	private EstadoComanda estadoComanda;
	private Factura factura;

	public Comanda(List<Plato> platos, Mozo mozo, Boolean comandaLista, Mesa mesa, List<Bebida> bebidas,
			EstadoComanda estadoComanda, Factura factura) {
		super();
		this.platos = platos;
		this.mozo = mozo;
		this.comandaLista = comandaLista;
		this.mesa = mesa;
		this.bebidas = bebidas;
		this.estadoComanda = estadoComanda;
		this.factura = factura;
	}

	public Comanda(ComandaEntity entity) {
		this.platos = new ArrayList<Plato>();
		for (PlatoEntity plato : entity.getPlatos()) {
			this.platos.add(new Plato(plato));
		}
		this.estadoComanda = new EstadoComanda(entity.getEstadoComanda());
		this.mozo = new Mozo(entity.getMozo());
		this.mesa = new Mesa (entity.getMesa());
		this.factura = new Factura ( entity.getFactura());
		
	}
	
	public Comanda(ComandaDTO dto) {
		this.platos = new ArrayList<Plato>();
		for (PlatoDTO plato : dto.getPlatos()) {
			this.platos.add(new Plato(plato));
		}
		this.estadoComanda = new EstadoComanda(dto.getEstadoComanda());
		this.mozo = new Mozo(dto.getMozo());
		this.mesa = new Mesa (dto.getMesa());
		this.factura = new Factura ( dto.getFactura());
		
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

	public List<Bebida> getBebidas() {
		return bebidas;
	}

	public void setBebidas(List<Bebida> bebidas) {
		this.bebidas = bebidas;
	}

	public EstadoComanda getEstadoComanda() {
		return estadoComanda;
	}

	public void setEstadoComanda(EstadoComanda estadoComanda) {
		this.estadoComanda = estadoComanda;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

}
