package org.servidor.entities;

import java.util.List;

public class RestaurantEntity {
	
	private  LocalEntity LocalLogueado;
	private List<LocalEntity> locales;
	private DepositoCentralEntity depositoCentral;
	private AdministracionEntity administracion;
	private List<ListadoComprasEntity> cosasAComprar;
	private List<PlatoEntity> platos;
	private List<ComandaEntity> comandas;
	private List<PlandeProduccionEntity> planesDeProduccion;
	private List<InsumoEntity> insumos;
	public LocalEntity getLocalLogueado() {
		return LocalLogueado;
	}
	public void setLocalLogueado(LocalEntity localLogueado) {
		LocalLogueado = localLogueado;
	}
	public List<LocalEntity> getLocales() {
		return locales;
	}
	public void setLocales(List<LocalEntity> locales) {
		this.locales = locales;
	}
	public DepositoCentralEntity getDepositoCentral() {
		return depositoCentral;
	}
	public void setDepositoCentral(DepositoCentralEntity depositoCentral) {
		this.depositoCentral = depositoCentral;
	}
	public AdministracionEntity getAdministracion() {
		return administracion;
	}
	public void setAdministracion(AdministracionEntity administracion) {
		this.administracion = administracion;
	}
	public List<ListadoComprasEntity> getCosasAComprar() {
		return cosasAComprar;
	}
	public void setCosasAComprar(List<ListadoComprasEntity> cosasAComprar) {
		this.cosasAComprar = cosasAComprar;
	}
	public List<PlatoEntity> getPlatos() {
		return platos;
	}
	public void setPlatos(List<PlatoEntity> platos) {
		this.platos = platos;
	}
	public List<ComandaEntity> getComandas() {
		return comandas;
	}
	public void setComandas(List<ComandaEntity> comandas) {
		this.comandas = comandas;
	}
	public List<PlandeProduccionEntity> getPlanesDeProduccion() {
		return planesDeProduccion;
	}
	public void setPlanesDeProduccion(List<PlandeProduccionEntity> planesDeProduccion) {
		this.planesDeProduccion = planesDeProduccion;
	}
	public List<InsumoEntity> getInsumos() {
		return insumos;
	}
	public void setInsumos(List<InsumoEntity> insumos) {
		this.insumos = insumos;
	}

	
	

}
