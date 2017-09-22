package org.servidor.Entities;

import java.util.List;

public class ListadoComprasEntity {
	
	private Integer idListadoCompras;
	private String AreaSolicitante;
	private List<ItemListadoEntity> insumos;
	
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
	public List<ItemListadoEntity> getInsumos() {
		return insumos;
	}
	public void setInsumos(List<ItemListadoEntity> insumos) {
		this.insumos = insumos;
	}
	
	
	
	
	
	

}
