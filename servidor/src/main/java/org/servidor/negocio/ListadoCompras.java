package org.servidor.negocio;

import java.util.List;

import org.repositorio.dtos.ItemListadoDTO;

public class ListadoCompras {

	private Integer idListadoCompras;
	private String AreaSolicitante;
	private List<ItemListadoDTO> insumos;

	public ListadoCompras(Integer idListadoCompras, String areaSolicitante, List<ItemListadoDTO> insumos) {
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

	public List<ItemListadoDTO> getInsumos() {
		return insumos;
	}

	public void setInsumos(List<ItemListadoDTO> insumos) {
		this.insumos = insumos;
	}

}
