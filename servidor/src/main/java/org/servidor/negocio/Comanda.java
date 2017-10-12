package org.servidor.negocio;

import java.util.List;

import org.repositorio.dtos.BebidaDTO;
import org.repositorio.dtos.EstadoComandaDTO;
import org.repositorio.dtos.FacturaDTO;
import org.repositorio.dtos.MesaDTO;
import org.repositorio.dtos.MozoDTO;
import org.repositorio.dtos.PlatoDTO;

public class Comanda {

	private List<PlatoDTO> platos;
	private MozoDTO mozo;
	private Boolean comandaLista;
	private MesaDTO mesa;
	private List<BebidaDTO> bebidas;
	private EstadoComandaDTO estadoComanda;
	private FacturaDTO factura;

	public Comanda(List<PlatoDTO> platos, MozoDTO mozo, Boolean comandaLista, MesaDTO mesa, List<BebidaDTO> bebidas,
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
