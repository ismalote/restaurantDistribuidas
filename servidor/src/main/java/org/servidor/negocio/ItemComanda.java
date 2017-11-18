package org.servidor.negocio;

import org.repositorio.dtos.AgregarItemComandaDTO;
import org.repositorio.dtos.ItemComandaDTO;
import org.servidor.dao.PlatoDAO;

public class ItemComanda {

	private Plato plato;

	private boolean entregado;

	private boolean reclamo;

	public ItemComanda(Plato plato, boolean entregado, boolean reclamo) {
		super();
		this.plato = plato;
		this.entregado = entregado;
		this.reclamo = reclamo;
	}

	public ItemComanda(Plato plato) {
		super();
		this.plato = plato;
		this.entregado = false;
		this.reclamo = false;
	}

	public ItemComanda(ItemComandaDTO dto) {
		super();
		this.plato = PlatoDAO.getInstancia().obtenerProducto(dto.getIdPlato());
		this.entregado = false;
		this.reclamo = false;
	}

	public ItemComanda(AgregarItemComandaDTO dto) {
		this((ItemComandaDTO)dto);
	}

	public ItemComanda(int idPlato) {
		super();
		this.plato = PlatoDAO.getInstancia().obtenerProducto(idPlato);
	}

	public ItemComanda() {
		// TODO Auto-generated constructor stub
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public boolean isReclamo() {
		return reclamo;
	}

	public void setReclamo(boolean reclamo) {
		this.reclamo = reclamo;
	}

	public Plato getPlato() {
		return plato;
	}

	public void setPlato(Plato plato) {
		this.plato = plato;
	}

}
