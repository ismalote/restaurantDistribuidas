package org.repositorio.dtos;

import java.io.Serializable;

/**
 * @author Juan
 */
public class ItemComandaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -861569479002977627L;

	private int idPlato;

	private boolean entregado;

	private boolean reclamo;

	public ItemComandaDTO(int idPlato, boolean entregado, boolean reclamo) {
		super();
		this.idPlato = idPlato;
		this.entregado = entregado;
		this.reclamo = reclamo;
	}

	public int getIdPlato() {
		return idPlato;
	}

	public void setIdPlato(int idPlato) {
		this.idPlato = idPlato;
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

}