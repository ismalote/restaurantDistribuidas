package org.servidor.Negocio;

import java.util.List;

public class Restaurant {
	
	private  Local LocalLogueado;
	private List<Local> locales;
	private DepositoCentral depositoCentral;
	private Administracion administracion;
	private List<ListadoCompras> cosasAComprar;
	private List<Plato> platos;
	private List<Comanda> comandas;
	private List<PlandeProduccion> planesDeProduccion;
	private List<Insumo> insumos;
	
	public Restaurant(Local localLogueado, List<Local> locales, DepositoCentral depositoCentral,
			Administracion administracion, List<ListadoCompras> cosasAComprar, List<Plato> platos,
			List<Comanda> comandas, List<PlandeProduccion> planesDeProduccion, List<Insumo> insumos) {
		super();
		LocalLogueado = localLogueado;
		this.locales = locales;
		this.depositoCentral = depositoCentral;
		this.administracion = administracion;
		this.cosasAComprar = cosasAComprar;
		this.platos = platos;
		this.comandas = comandas;
		this.planesDeProduccion = planesDeProduccion;
		this.insumos = insumos;
	}

	public Local getLocalLogueado() {
		return LocalLogueado;
	}

	public void setLocalLogueado(Local localLogueado) {
		LocalLogueado = localLogueado;
	}

	public List<Local> getLocales() {
		return locales;
	}

	public void setLocales(List<Local> locales) {
		this.locales = locales;
	}

	public DepositoCentral getDepositoCentral() {
		return depositoCentral;
	}

	public void setDepositoCentral(DepositoCentral depositoCentral) {
		this.depositoCentral = depositoCentral;
	}

	public Administracion getAdministracion() {
		return administracion;
	}

	public void setAdministracion(Administracion administracion) {
		this.administracion = administracion;
	}

	public List<ListadoCompras> getCosasAComprar() {
		return cosasAComprar;
	}

	public void setCosasAComprar(List<ListadoCompras> cosasAComprar) {
		this.cosasAComprar = cosasAComprar;
	}

	public List<Plato> getPlatos() {
		return platos;
	}

	public void setPlatos(List<Plato> platos) {
		this.platos = platos;
	}

	public List<Comanda> getComandas() {
		return comandas;
	}

	public void setComandas(List<Comanda> comandas) {
		this.comandas = comandas;
	}

	public List<PlandeProduccion> getPlanesDeProduccion() {
		return planesDeProduccion;
	}

	public void setPlanesDeProduccion(List<PlandeProduccion> planesDeProduccion) {
		this.planesDeProduccion = planesDeProduccion;
	}

	public List<Insumo> getInsumos() {
		return insumos;
	}

	public void setInsumos(List<Insumo> insumos) {
		this.insumos = insumos;
	}
	
	
	

}
