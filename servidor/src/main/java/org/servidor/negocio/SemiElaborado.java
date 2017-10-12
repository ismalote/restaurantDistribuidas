package org.servidor.negocio;

import java.util.List;

import org.repositorio.dtos.AreaDTO;
import org.repositorio.dtos.MateriaPrimaDTO;
import org.repositorio.dtos.ProductoComestibleDTO;

public class SemiElaborado extends ProductoComestibleDTO {

	private List<MateriaPrimaDTO> materiales;

	public SemiElaborado(AreaDTO area, Integer estimadoStock) {
		super(area, estimadoStock);
	}

	public SemiElaborado(AreaDTO area, Integer estimadoStock, List<MateriaPrimaDTO> materiales) {
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
