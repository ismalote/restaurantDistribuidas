package org.servidor.entities;

public class AdministracionEntity {
	// TODO falta atributos en administracion, cuales serian??
	
	// definir si estos atributos estan bien ?
	
	@OneToMany
	@JoinColumn(name="idPP")
	private List<PlanDeProduccionEntity> planesProd;


	public AdministracionEntity(Integer codArea, AreaRest area,
			List<PlanDeProduccionEntity> planesProd) {
		super(codArea, area);
		this.planesProd = planesProd;
	}

	public AdministracionEntity(){
		
	}

	public List<PlanDeProduccionEntity> getPlanesProd() {
		return planesProd;
	}

	public void setPlanesProd(List<PlanDeProduccionEntity> planesProd) {
		this.planesProd = planesProd;
	}
	
}
