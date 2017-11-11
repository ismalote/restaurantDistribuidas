package org.servidor.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "itemPlandeProduccion")
public class ItemPlandeProduccionEntity {

	@Id
	private Integer idIPP;
	@OneToOne
	@JoinColumn(name = "idPlato")
	private PlatoEntity plato;
	private Integer cantidadEstimada;
	@ManyToOne
	private PlandeProduccionEntity pp;

	public ItemPlandeProduccionEntity(Integer idIPP, PlatoEntity plato, Integer cantidadEstimada) {
		super();
		this.idIPP = idIPP;
		this.plato = plato;
		this.cantidadEstimada = cantidadEstimada;
	}

	public ItemPlandeProduccionEntity() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdIPP() {
		return idIPP;
	}

	public void setIdIPP(Integer idIPP) {
		this.idIPP = idIPP;
	}

	public PlatoEntity getPlato() {
		return plato;
	}

	public void setPlato(PlatoEntity plato) {
		this.plato = plato;
	}

	public Integer getCantidadEstimada() {
		return cantidadEstimada;
	}

	public void setCantidadEstimada(Integer cantidadEstimada) {
		this.cantidadEstimada = cantidadEstimada;
	}

}
