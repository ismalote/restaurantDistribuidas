package org.repositorio.dtos;

import java.io.Serializable;

import org.servidor.Enum.EstadoItemComanda;

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

	private EstadoItemComanda estado;



	

	public ItemComandaDTO(Integer idPlato, Integer idItemComanda, String nombrePlato, EstadoItemComanda estado
			) {
		super();
		this.idPlato = idPlato;
		this.idItemComanda = idItemComanda;
		this.nombrePlato = nombrePlato;
		this.estado = estado;
	
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



	public EstadoItemComanda getEstado() {
		return estado;
	}



	public void setEstado(EstadoItemComanda estado) {
		this.estado = estado;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}



}