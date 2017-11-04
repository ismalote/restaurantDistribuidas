package org.servidor.negocio;

import java.util.ArrayList;
import java.util.List;

import org.repositorio.dtos.ComandaDTO;
import org.repositorio.dtos.ItemComandaDTO;
import org.repositorio.exceptions.MesaNotFoundException;
import org.repositorio.exceptions.MozoNotFoundException;
import org.servidor.entities.ComandaEntity;

public class Comanda {

	private Integer idComanda;
	private List<ItemComanda> platos;
	private Mozo mozo;
	private Boolean comandaLista;
	private Mesa mesa;
	private EstadoComanda estadoComanda;
	private Factura fact;
	private Local Local;

	public Comanda(Integer idComanda, List<ItemComanda> platos, Mozo mozo, Boolean comandaLista, Mesa mesa,
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

	public Comanda(ComandaEntity entity) {
		this.platos = new ArrayList<ItemComanda>();
		// for (PlatoEntity plato : entity.getPlatos()) {
		// this.platos.add(new Plato(plato));
		// }
		this.estadoComanda = new EstadoComanda(entity.getEstadoComanda());
		this.mozo = new Mozo(entity.getMozo());
		this.mesa = new Mesa(entity.getMesa());
		this.fact = new Factura(entity.getFact());
	}

	public Comanda(ComandaDTO dto) {
		if (dto.getMozo() == null) {
			throw new MozoNotFoundException("new Comanda(ComandaEntity entity)");
		}
		this.mozo = new Mozo(dto.getMozo());

		if (dto.getMesa() == null) {
			throw new MesaNotFoundException("new Comanda(ComandaEntity entity)");
		}
		this.mesa = new Mesa(dto.getMesa());

		this.platos = new ArrayList<ItemComanda>();
		for (ItemComandaDTO item : dto.getPlatos()) {
			this.platos.add(new ItemComanda(item));
		}

		if (dto.getEstadoComanda() == null) {
			this.estadoComanda = new EstadoComanda(true, true, true); // TODO
		} else {
			this.estadoComanda = new EstadoComanda(dto.getEstadoComanda());
		}

		if (dto.getFactura() == null) {
			this.fact = null;
		} else {
			this.fact = new Factura(dto.getFactura());
		}
	}

	/*
	 * Public Business Methods
	 * 
	 */

	public boolean agregarItem(ItemComandaDTO item) {
		ItemComanda itemNuevo = new ItemComanda(item);
		return false;
	}

	/*
	 * Getters & Setters
	 */

	public List<ItemComanda> getPlatos() {
		return platos;
	}

	public void setPlatos(List<ItemComanda> platos) {
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
