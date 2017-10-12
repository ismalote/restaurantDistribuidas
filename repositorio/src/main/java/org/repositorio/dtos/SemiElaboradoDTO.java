package org.repositorio.dtos;

import java.util.List;

public class SemiElaboradoDTO extends ProductoComestibleDTO {

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
