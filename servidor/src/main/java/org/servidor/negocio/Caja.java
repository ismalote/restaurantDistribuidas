package org.servidor.negocio;

import java.util.List;

import org.repositorio.dtos.AreaDTO;
import org.repositorio.dtos.ComandaDTO;
import org.repositorio.dtos.EncargadoAreaDTO;

public class Caja extends AreaDTO {

	private EncargadoAreaDTO encargadoCaja;
	private List<ComandaDTO> comandas;

	public Caja(Integer idArea) {
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
