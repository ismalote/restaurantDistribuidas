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
	private String nombrePlato;

	private boolean entregado;

	private boolean reclamo;

	public ItemComandaDTO(int idPlato, String nombrePlato, boolean entregado, boolean reclamo) {
		super();
		this.idPlato = idPlato;
		this.nombrePlato = nombrePlato;
		this.entregado = entregado;
		this.reclamo = reclamo;
	}

	public ItemComandaDTO() {
		
	}

	public int getIdPlato() {
		return idPlato;
	}

	public void setIdPlato(int idPlato) {
		this.idPlato = idPlato;
	}

	public String getNombrePlato() {
		return nombrePlato;
	}

	public void setNombrePlato(String nombrePlato) {
		this.nombrePlato = nombrePlato;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	

}