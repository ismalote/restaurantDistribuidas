package org.repositorio.dtos;

import java.io.Serializable;

public class CrearComandaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -455920126777668592L;
	
	private int numeroMesa;
	private int idLocal;
	private int idMozo;
	private int cantidadComensales;

	public CrearComandaDTO(int idMozo, int numeroMesa, int cantidadComensales, int idLocal) {
		super();
		this.numeroMesa = numeroMesa;
		this.idLocal = idLocal;
		this.idMozo = idMozo;
		this.cantidadComensales = cantidadComensales;
	}

	public CrearComandaDTO() {
	}

	public int getNumeroMesa() {
		return numeroMesa;
	}

	public void setNumeroMesa(int numeroMesa) {
		this.numeroMesa = numeroMesa;
	}

	public int getIdLocal() {
		return idLocal;
	}

	public void setIdLocal(int idLocal) {
		this.idLocal = idLocal;
	}

	public int getIdMozo() {
		return idMozo;
	}

	public void setIdMozo(int idMozo) {
		this.idMozo = idMozo;
	}

	public int getCantidadComensales() {
		return cantidadComensales;
	}

	public void setCantidadComensales(int cantidadComensales) {
		this.cantidadComensales = cantidadComensales;
	}

}
