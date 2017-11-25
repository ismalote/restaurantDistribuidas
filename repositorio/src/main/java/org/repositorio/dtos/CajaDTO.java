package org.repositorio.dtos;

import java.io.Serializable;
import java.util.List;

public class CajaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7108738382536831595L;
	private EncargadoAreaDTO encargadoCaja;
	private List<ComandaDTO> comandas;

	public CajaDTO(Integer idArea) {
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
}
