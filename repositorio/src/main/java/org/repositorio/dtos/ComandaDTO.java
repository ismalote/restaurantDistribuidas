package org.repositorio.dtos;

import java.util.List;

public class ComandaDTO {

	private List<PlatoDTO> platos;
	private MozoDTO mozo;
	private Boolean comandaLista;
	private MesaDTO mesa;
	private List<BebidaDTO> bebidas;
	private EstadoComandaDTO estadoComanda;
	private FacturaDTO factura;

	public ComandaDTO(List<PlatoDTO> platos, MozoDTO mozo, Boolean comandaLista, MesaDTO mesa, List<BebidaDTO> bebidas,
			EstadoComandaDTO estadoComanda, FacturaDTO factura) {
		super();
		this.platos = platos;
		this.mozo = mozo;
		this.comandaLista = comandaLista;
		this.mesa = mesa;
		this.bebidas = bebidas;
		this.estadoComanda = estadoComanda;
		this.factura = factura;
	}

	public List<PlatoDTO> getPlatos() {
		return platos;
	}

	public void setPlatos(List<PlatoDTO> platos) {
		this.platos = platos;
	}

	public MozoDTO getMozo() {
		return mozo;
	}

	public void setMozo(MozoDTO mozo) {
		this.mozo = mozo;
	}

	public Boolean getComandaLista() {
		return comandaLista;
	}

	public void setComandaLista(Boolean comandaLista) {
		this.comandaLista = comandaLista;
	}

	public MesaDTO getMesa() {
		return mesa;
	}

	public void setMesa(MesaDTO mesa) {
		this.mesa = mesa;
	}

	public List<BebidaDTO> getBebidas() {
		return bebidas;
	}

	public void setBebidas(List<BebidaDTO> bebidas) {
		this.bebidas = bebidas;
	}

	public EstadoComandaDTO getEstadoComanda() {
		return estadoComanda;
	}

	public void setEstadoComanda(EstadoComandaDTO estadoComanda) {
		this.estadoComanda = estadoComanda;
	}

	public FacturaDTO getFactura() {
		return factura;
	}

	public void setFactura(FacturaDTO factura) {
		this.factura = factura;
	}

}
