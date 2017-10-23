package org.servidor.negocio;

import java.util.List;

public class SemiElaborado extends ProductoComestible {

	private List<MateriaPrima> materiales;

	public SemiElaborado(Area area, Integer estimadoStock) {
		super(area, estimadoStock);
	}

	public SemiElaborado(Area area, Integer estimadoStock, List<MateriaPrima> materiales) {
		super(area, estimadoStock);
		this.materiales = materiales;
	}

	public List<MateriaPrima> getMateriales() {
		return materiales;
	}

	public void setMateriales(List<MateriaPrima> materiales) {
		this.materiales = materiales;
	}

}
