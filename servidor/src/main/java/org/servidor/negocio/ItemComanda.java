package org.servidor.negocio;

import org.repositorio.dtos.ItemComandaDTO;
import org.servidor.dao.ItemComandaDAO;
import org.servidor.dao.PlatoDAO;

public class ItemComanda {

	private int idPlato;
	private Plato plato;

	private boolean entregado;

	private boolean reclamo;

	public ItemComanda(int idPlato, Plato plato, boolean entregado, boolean reclamo) {
		super();
		this.idPlato = idPlato;
		this.plato = plato;
		this.entregado = entregado;
		this.reclamo = reclamo;
	}

	public ItemComanda(ItemComandaDTO item) {
		this.setIdPlato(item.getIdPlato());
		this.plato= PlatoDAO.getInstancia().obtenerProducto(item.getIdPlato());
		this.setEntregado(item.isEntregado());
		this.setReclamo(item.isReclamo());
	}

	public ItemComanda() {
		// TODO Auto-generated constructor stub
	}

	public int getIdPlato() {
		return idPlato;
	}

	public void setIdPlato(int idPlato) {
		this.idPlato = idPlato;
	}

	public Plato getPlato() {
		return plato;
	}

	public void setPlato(Plato plato) {
		this.plato = plato;
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

	public ItemComandaDTO toDTO(ItemComanda item) {
		ItemComandaDTO resultado = new ItemComandaDTO();
		resultado.setIdPlato(item.getIdPlato());
		resultado.setNombrePlato(item.getPlato().getNombrePlato());
		resultado.setEntregado(item.isEntregado());
		resultado.setReclamo(item.isReclamo());
		return resultado;
		
	}


	

}
