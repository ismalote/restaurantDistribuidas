package org.repositorio.dtos;

import java.util.List;

public class ListadoComprasDTO {

	private Integer idListadoCompras;
	private String AreaSolicitante;
	private List<ItemListadoDTO> insumos;

	public ListadoComprasDTO(Integer idListadoCompras, String areaSolicitante, List<ItemListadoDTO> insumos) {
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
