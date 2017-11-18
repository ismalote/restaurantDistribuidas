package org.repositorio.dtos;

import java.io.Serializable;
import java.util.List;

public class MesaCompuestaDTO extends MesaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<MesaDTO> mesas;

	public MesaCompuestaDTO() {
	}

	public List<MesaDTO> getMesas() {
		return mesas;
	}

	public void setMesas(List<MesaDTO> mesas) {
		this.mesas = mesas;
	}

}
