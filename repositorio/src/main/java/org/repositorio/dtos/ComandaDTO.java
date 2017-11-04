package org.repositorio.dtos;

import java.io.Serializable;
import java.util.List;

public class ComandaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2220270292730634477L;
	
	private Integer idComanda;
	private List<ItemPlatoDTO> platos;
	private MozoDTO mozo;
	private Boolean comandaLista;
	private MesaDTO mesa;
	private EstadoComandaDTO estadoComanda;
	private FacturaDTO factura;
	private LocalDTO local;
	
	public ComandaDTO(Integer id,List<ItemPlatoDTO> platos, MozoDTO mozo, Boolean comandaLista, MesaDTO mesa,
			EstadoComandaDTO estadoComanda, FacturaDTO factura) {
		super();
		this.idComanda=id;
		this.platos = platos;
		this.mozo = mozo;
		this.comandaLista = comandaLista;
		this.mesa = mesa;
		this.estadoComanda = estadoComanda;
		this.factura = factura;
	}

	public List<ItemPlatoDTO> getPlatos() {
		return platos;
	}

	public void setPlatos(List<ItemPlatoDTO> platos) {
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

	public Integer getIdComanda() {
		return idComanda;
	}

	public void setIdComanda(Integer idComanda) {
		this.idComanda = idComanda;
	}

	public LocalDTO getLocal() {
		return local;
	}

	public void setLocal(LocalDTO local) {
		this.local = local;
	}

}
