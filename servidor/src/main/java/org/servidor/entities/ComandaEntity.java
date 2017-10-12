package org.servidor.entities;

import java.util.List;

public class ComandaEntity {

	private List<PlatoEntity> platos;
	private MozoEntity mozo;
	private Boolean comandaLista;
	private MesaEntity mesa;
	private List<BebidaEntity> bebidas;
	private EstadoComandaEntity estadoComanda;
	private FacturaEntity factura;

	public List<PlatoEntity> getPlatos() {
		return platos;
	}

	public void setPlatos(List<PlatoEntity> platos) {
		this.platos = platos;
	}

	public MozoEntity getMozo() {
		return mozo;
	}

	public void setMozo(MozoEntity mozo) {
		this.mozo = mozo;
	}

	public Boolean getComandaLista() {
		return comandaLista;
	}

	public void setComandaLista(Boolean comandaLista) {
		this.comandaLista = comandaLista;
	}

	public MesaEntity getMesa() {
		return mesa;
	}

	public void setMesa(MesaEntity mesa) {
		this.mesa = mesa;
	}

	public List<BebidaEntity> getBebidas() {
		return bebidas;
	}

	public void setBebidas(List<BebidaEntity> bebidas) {
		this.bebidas = bebidas;
	}

	public EstadoComandaEntity getEstadoComanda() {
		return estadoComanda;
	}

	public void setEstadoComanda(EstadoComandaEntity estadoComanda) {
		this.estadoComanda = estadoComanda;
	}

	public FacturaEntity getFactura() {
		return factura;
	}

	public void setFactura(FacturaEntity factura) {
		this.factura = factura;
	}

}
