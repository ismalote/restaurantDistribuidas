package org.repositorio.dtos;

import java.io.Serializable;


public class PlatoAConfirmarDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	private int idPlato;
	private String nombrePlato;
	
	public PlatoAConfirmarDTO(int idPlato, String nombrePlato) {
		super();
		this.idPlato = idPlato;
		this.nombrePlato = nombrePlato;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
