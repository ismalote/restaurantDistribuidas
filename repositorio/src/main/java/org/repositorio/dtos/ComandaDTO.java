package org.repositorio.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ComandaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2220270292730634477L;
	
	private Integer idComanda;
	private List<ItemComandaDTO> platos;
	private MozoDTO mozo;
	private Boolean cerrada;
	private MesaDTO mesa;
	private Integer cantidadComensales;
	private FacturaDTO factura;
	private LocalDTO local;
	
	public ComandaDTO(Integer id, MozoDTO mozo, Boolean cerrada, MesaDTO mesa,
			Integer cantidadComensales) {
		super();
		this.idComanda=id;
		this.mozo = mozo;
		this.cerrada = cerrada;
		this.mesa = mesa;
		this.cantidadComensales = cantidadComensales;
		this.platos = new ArrayList<ItemComandaDTO>();
	}
	
	public List<ItemComandaDTO> getPlatos() {
		return platos;
	}

	public void setPlatos(List<ItemComandaDTO> platos) {
		this.platos = platos;
	}

	public MozoDTO getMozo() {
		return mozo;
	}

	public void setMozo(MozoDTO mozo) {
		this.mozo = mozo;
	}

	public Boolean getCerrada() {
		return cerrada;
	}

	public void setCerrada(Boolean comandaLista) {
		this.cerrada = comandaLista;
	}

	public MesaDTO getMesa() {
		return mesa;
	}

	public void setMesa(MesaDTO mesa) {
		this.mesa = mesa;
	}

	public Integer getCantidadComensales() {
		return cantidadComensales;
	}

	public void setCantidadComensales(Integer cantidadComensales) {
		this.cantidadComensales = cantidadComensales;
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
	
	public void add(ItemComandaDTO item) {
		this.platos.add(item);
	}

}
