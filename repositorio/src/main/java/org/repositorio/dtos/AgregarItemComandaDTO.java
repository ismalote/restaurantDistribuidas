package org.repositorio.dtos;

import java.io.Serializable;

/**
 * @author Juan
 */
public class AgregarItemComandaDTO extends ItemComandaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3811835303690349686L;
	private int idComanda;

	public AgregarItemComandaDTO(int idPlato , boolean entregado, boolean reclamo, int idComanda) {
		super(idPlato, null, entregado, reclamo);
		this.idComanda = idComanda;
	}

	public int getIdComanda() {
		return idComanda;
	}

	public void setIdComanda(int idComanda) {
		this.idComanda = idComanda;
	}

}