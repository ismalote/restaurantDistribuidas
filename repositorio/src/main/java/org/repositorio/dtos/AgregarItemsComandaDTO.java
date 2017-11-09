package org.repositorio.dtos;

import java.io.Serializable;
import java.util.List;

/**
 * @author Juan
 */
public class AgregarItemsComandaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3811835303690349686L;

	private int idComanda;

	private List<ItemComandaDTO> items;

	public AgregarItemsComandaDTO(int idPlato, boolean entregado, boolean reclamo, int idComanda) {
		this.idComanda = idComanda;
	}

	public int getIdComanda() {
		return idComanda;
	}

	public void setIdComanda(int idComanda) {
		this.idComanda = idComanda;
	}

	public List<ItemComandaDTO> getItems() {
		return items;
	}

	public void setItems(List<ItemComandaDTO> items) {
		this.items = items;
	}

}