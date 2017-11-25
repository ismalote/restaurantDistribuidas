package org.servidor.negocio;

import org.repositorio.dtos.ItemComandaDTO;
import org.servidor.Enum.EstadoItemComanda;
import org.servidor.dao.ItemComandaDAO;
import org.servidor.dao.PlatoDAO;

public class ItemComanda {

	private Integer idItemComanda;
	private Plato plato;
	private EstadoItemComanda estado;
	private int cantidad;

	public ItemComanda(Integer idItemComanda, Plato plato, EstadoItemComanda estado, int cantidad) {
		super();
		this.idItemComanda = idItemComanda;
		this.plato = plato;
		this.estado = estado;
		this.cantidad = cantidad;
	}

	public ItemComanda(ItemComandaDTO item) {
		this.idItemComanda = item.getIdItemComanda();
		this.plato = PlatoDAO.getInstancia().obtenerProducto(item.getIdPlato());
		this.estado = EstadoItemComanda.valueOf(item.getEstado());
	}

	public ItemComanda() {
		// TODO Auto-generated constructor stub
	}

	public Plato getPlato() {
		return plato;
	}

	public void setPlato(Plato plato) {
		this.plato = plato;
	}

	public Integer getIdItemComanda() {
		return idItemComanda;
	}

	public void setIdItemComanda(Integer idItemComanda) {
		this.idItemComanda = idItemComanda;
	}

	public EstadoItemComanda getEstado() {
		return estado;
	}

	public void setEstado(EstadoItemComanda estado) {
		this.estado = estado;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public ItemComandaDTO toDTO(ItemComanda item) {
		ItemComandaDTO resultado = new ItemComandaDTO();
		resultado.setIdItemComanda(item.getIdItemComanda());
		resultado.setNombrePlato(item.getPlato().getNombrePlato());
		resultado.setEstado(item.getEstado().name()); // TODO
		return resultado;
	}

	public void save() {
		ItemComandaDAO.getInstancia().save();

	}

}
