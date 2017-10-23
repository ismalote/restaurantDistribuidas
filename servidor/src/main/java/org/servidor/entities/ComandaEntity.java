package org.servidor.entities;

import java.util.List;

public class ComandaEntity {

	//preguntar a los chicos sobbre redefinir la comanda como item camandas 
	@Id
	private idComanda;
	
	@OneToMany(mappedBy="plato")
	private List<PlatoEntity> platos;
	
	@OneToOne(name="idMozo")
	private MozoEntity mozo;
	
	private Boolean comandaLista;
	
	@OneToOne(name="idMesa")
	private MesaEntity mesa;
	
	@OneToMany(mappedBy="plato")
	private List<BebidaEntity> bebidas;
	
	private EstadoComandaEntity estadoComanda;
	
	
	//ver si esta bien esto este one to one 
	@OneToOne(mappedBy="FacturaEntity")
	private 
	//private FacturaEntity factura;

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
