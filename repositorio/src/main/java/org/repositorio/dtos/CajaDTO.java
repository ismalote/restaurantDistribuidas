package org.repositorio.dtos;

import java.util.List;

public class CajaDTO extends AreaDTO {

	private EncargadoAreaDTO encargadoCaja;
	private List<ComandaDTO> comandas;

	public CajaDTO(Integer idArea) {
		super(idArea);
		// TODO Auto-generated constructor stub
	}

	public EncargadoAreaDTO getEncargadoCaja() {
		return encargadoCaja;
	}

	public void setEncargadoCaja(EncargadoAreaDTO encargadoCaja) {
		this.encargadoCaja = encargadoCaja;
	}

	public List<ComandaDTO> getComandas() {
		return comandas;
	}

	public void setComandas(List<ComandaDTO> comandas) {
		this.comandas = comandas;
	}
	// TODO faltan metodos, OJO esto es HERENCIA NO POLIMORFISMO...creo...
}
