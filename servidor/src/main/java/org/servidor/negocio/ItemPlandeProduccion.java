package org.servidor.negocio;

public class ItemPlandeProduccion {

	private Integer idIPP;
	private Plato plato;
	private Integer cantidadEstimada;

	public ItemPlandeProduccion(Integer idIPP, Plato plato, Integer cantidadEstimada) {
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

	public Plato getPlato() {
		return plato;
	}

	public void setPlato(Plato plato) {
		this.plato = plato;
	}

	public Integer getCantidadEstimada() {
		return cantidadEstimada;
	}

	public void setCantidadEstimada(Integer cantidadEstimada) {
		this.cantidadEstimada = cantidadEstimada;
	}

}
