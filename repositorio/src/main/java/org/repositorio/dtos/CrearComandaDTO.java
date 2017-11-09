package org.repositorio.dtos;

import java.util.List;

public class CrearComandaDTO {

	private List<String> platos;
	private int numeroMesa;
	private int estadoComanda;
	private int idLocal;

	public CrearComandaDTO(List<String> platos, int numeroMesa, int estadoComanda, int idLocal) {
		super();
		this.platos = platos;
		this.numeroMesa = numeroMesa;
		this.estadoComanda = estadoComanda;
		this.idLocal = idLocal;
	}

	public CrearComandaDTO() {
		// TODO Auto-generated constructor stub
	}

	public List<String> getPlatos() {
		return platos;
	}

	public void setPlatos(List<String> platos) {
		this.platos = platos;
	}

	public int getNumeroMesa() {
		return numeroMesa;
	}

	public void setNumeroMesa(int numeroMesa) {
		this.numeroMesa = numeroMesa;
	}

	public int getEstadoComanda() {
		return estadoComanda;
	}

	public void setEstadoComanda(int estadoComanda) {
		this.estadoComanda = estadoComanda;
	}

	public int getIdLocal() {
		return idLocal;
	}

	public void setIdLocal(int idLocal) {
		this.idLocal = idLocal;
	}

}
