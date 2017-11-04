package org.servidor.negocio;

import org.repositorio.dtos.ItemComandaDTO;
import org.servidor.dao.PlatoDAO;

public class ItemComanda {

	private Plato plato;

	private int cantidad;

	public ItemComanda(Plato plato, int cantidad) {
		super();
		this.plato = plato;
		this.cantidad = cantidad;
	}

	public ItemComanda(Plato plato) {
		super();
		this.plato = plato;
		this.cantidad = 1;
	}

	public ItemComanda(ItemComandaDTO dto) {
		super();
		this.plato = PlatoDAO.getInstancia().obtenerProducto(dto.getIdPlato());
		this.cantidad = dto.getCantidad();
	}

	public ItemComanda(int idPlato) {
		super();
		this.plato = PlatoDAO.getInstancia().obtenerProducto(idPlato);
		this.cantidad = 1;
	}

	public Plato getPlato() {
		return plato;
	}

	public void setPlato(Plato plato) {
		this.plato = plato;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
