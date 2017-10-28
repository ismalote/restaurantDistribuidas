package org.servidor.entities;

import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class AdministracionEntity {
	// TODO falta atributos en administracion, cuales serian??
	
	// definir si estos atributos estan bien ?
	
	@OneToMany
	@JoinColumn(name="idPP")
	private List<PlandeProduccionEntity> planesProd;



	public AdministracionEntity(List<PlandeProduccionEntity> planesProd) {
		super();
		this.planesProd = planesProd;
	}

	public List<PlandeProduccionEntity> getPlanesProd() {
		return planesProd;
	}

	public void setPlanesProd(List<PlandeProduccionEntity> planesProd) {
		this.planesProd = planesProd;
	}
	
}
