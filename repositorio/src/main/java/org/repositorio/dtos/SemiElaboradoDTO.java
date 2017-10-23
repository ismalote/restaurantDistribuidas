package org.repositorio.dtos;

import java.io.Serializable;
import java.util.List;

public class SemiElaboradoDTO extends ProductoComestibleDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2340867769513938568L;
	private List<MateriaPrimaDTO> materiales;

	public SemiElaboradoDTO(AreaDTO area, Integer estimadoStock) {
		super(area, estimadoStock);
	}

	public SemiElaboradoDTO(AreaDTO area, Integer estimadoStock, List<MateriaPrimaDTO> materiales) {
		super(area, estimadoStock);
		this.materiales = materiales;
	}

	public List<MateriaPrimaDTO> getMateriales() {
		return materiales;
	}

	public void setMateriales(List<MateriaPrimaDTO> materiales) {
		this.materiales = materiales;
	}

}
