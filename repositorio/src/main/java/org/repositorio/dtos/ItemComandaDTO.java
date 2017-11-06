package org.repositorio.dtos;

import java.io.Serializable;

/**
 * TODO Agregar en negocio
 * 
 * @author Juan
 *
 */
public abstract class ItemComandaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -861569479002977627L;

	private int idPlato;

	private int cantidad;

	public ItemComandaDTO(int idPlato, int cantidad) {
		super();
		this.idPlato = idPlato;
		this.cantidad = cantidad;
	}

	public int getIdPlato() {
		return idPlato;
	}

	public void setIdPlato(int idPlato) {
		this.idPlato = idPlato;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}