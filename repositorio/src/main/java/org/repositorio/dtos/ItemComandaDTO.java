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
	private Integer idPlato;
	private Integer idItemComanda;
	private String nombrePlato;

	private String estado;

	public ItemComandaDTO(Integer idPlato, Integer idItemComanda, String estado) {
		super();
		this.idPlato = idPlato;
		this.idItemComanda = idItemComanda;
		this.estado = estado;

	}

	public ItemComandaDTO(Integer idPlato) {
		super();
		this.idPlato = idPlato;
	}

	public ItemComandaDTO() {

	}

	public Integer getIdPlato() {
		return idPlato;
	}

	public void setIdPlato(Integer idPlato) {
		this.idPlato = idPlato;
	}

	public Integer getIdItemComanda() {
		return idItemComanda;
	}

	public void setIdItemComanda(Integer idItemComanda) {
		this.idItemComanda = idItemComanda;
	}

	public String getNombrePlato() {
		return nombrePlato;
	}

	public void setNombrePlato(String nombrePlato) {
		this.nombrePlato = nombrePlato;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}