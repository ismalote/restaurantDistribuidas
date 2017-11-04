package org.repositorio.dtos;

import java.io.Serializable;

public class ItemPlandeProduccionDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1038983125942479592L;
	private Integer idIPP;
	private PlatoDTO plato;
	private Integer cantidadEstimada;

	public ItemPlandeProduccionDTO(Integer idIPP, PlatoDTO plato, Integer cantidadEstimada) {
		super();
		this.idIPP = idIPP;
		this.plato = plato;
		this.cantidadEstimada = cantidadEstimada;
	}

	public Integer getIdIPP() {
		return idIPP;
	}

	public void setIdIPP(Integer idIPP) {
		this.idIPP = idIPP;
	}

	public PlatoDTO getPlato() {
		return plato;
	}

	public void setPlato(PlatoDTO plato) {
		this.plato = plato;
	}

	public Integer getCantidadEstimada() {
		return cantidadEstimada;
	}

	public void setCantidadEstimada(Integer cantidadEstimada) {
		this.cantidadEstimada = cantidadEstimada;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
