package org.servidor.negocio;

import java.util.List;

public class ListadoCompras {
	
	private Integer idListadoCompras;
	private String AreaSolicitante;
	private List<ItemListado> insumos;
	
	public ListadoCompras(Integer idListadoCompras, String areaSolicitante, List<ItemListado> insumos) {
		super();
		this.idListadoCompras = idListadoCompras;
		AreaSolicitante = areaSolicitante;
		this.insumos = insumos;
	}

	public Integer getIdListadoCompras() {
		return idListadoCompras;
	}

	public void setIdListadoCompras(Integer idListadoCompras) {
		this.idListadoCompras = idListadoCompras;
	}

	public String getAreaSolicitante() {
		return AreaSolicitante;
	}

	public void setAreaSolicitante(String areaSolicitante) {
		AreaSolicitante = areaSolicitante;
	}

	public List<ItemListado> getInsumos() {
		return insumos;
	}

	public void setInsumos(List<ItemListado> insumos) {
		this.insumos = insumos;
	}
	
	

}
