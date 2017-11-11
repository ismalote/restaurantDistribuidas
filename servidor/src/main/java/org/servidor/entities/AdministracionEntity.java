package org.servidor.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="administracion")
public class AdministracionEntity {
	// TODO falta atributos en administracion, cuales serian??

	// definir si estos atributos estan bien ?

	@Id
	private Integer idAdmin;
	@OneToMany(mappedBy = "administracion")
	private List<PlandeProduccionEntity> planesProd;

	public AdministracionEntity(Integer idAdmin, List<PlandeProduccionEntity> planesProd) {
		super();
		this.idAdmin = idAdmin;
		this.planesProd = planesProd;
	}

	public AdministracionEntity() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(Integer idAdmin) {
		this.idAdmin = idAdmin;
	}

	public List<PlandeProduccionEntity> getPlanesProd() {
		return planesProd;
	}

	public void setPlanesProd(List<PlandeProduccionEntity> planesProd) {
		this.planesProd = planesProd;
	}

	public void eliminarPlanProd(PlandeProduccionEntity aux) {
		for (PlandeProduccionEntity pp : planesProd) {
			if (pp.getIdPP() == aux.getIdPP()) {
				planesProd.remove(pp);
			}
		}
	}
}
