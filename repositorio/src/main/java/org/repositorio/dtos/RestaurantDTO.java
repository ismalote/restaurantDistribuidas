package org.repositorio.dtos;

import java.util.List;

public class RestaurantDTO {

	private LocalDTO LocalLogueado;
	private List<LocalDTO> locales;
	private DepositoCentralDTO depositoCentral;
	private AdministracionDTO administracion;
	private List<ListadoComprasDTO> cosasAComprar;
	private List<PlatoDTO> platos;
	private List<ComandaDTO> comandas;
	private List<PlandeProduccionDTO> planesDeProduccion;
	private List<InsumoDTO> insumos;

	public RestaurantDTO(LocalDTO localLogueado, List<LocalDTO> locales, DepositoCentralDTO depositoCentral,
			AdministracionDTO administracion, List<ListadoComprasDTO> cosasAComprar, List<PlatoDTO> platos,
			List<ComandaDTO> comandas, List<PlandeProduccionDTO> planesDeProduccion, List<InsumoDTO> insumos) {
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

	public LocalDTO getLocalLogueado() {
		return LocalLogueado;
	}

	public void setLocalLogueado(LocalDTO localLogueado) {
		LocalLogueado = localLogueado;
	}

	public List<LocalDTO> getLocales() {
		return locales;
	}

	public void setLocales(List<LocalDTO> locales) {
		this.locales = locales;
	}

	public DepositoCentralDTO getDepositoCentral() {
		return depositoCentral;
	}

	public void setDepositoCentral(DepositoCentralDTO depositoCentral) {
		this.depositoCentral = depositoCentral;
	}

	public AdministracionDTO getAdministracion() {
		return administracion;
	}

	public void setAdministracion(AdministracionDTO administracion) {
		this.administracion = administracion;
	}

	public List<ListadoComprasDTO> getCosasAComprar() {
		return cosasAComprar;
	}

	public void setCosasAComprar(List<ListadoComprasDTO> cosasAComprar) {
		this.cosasAComprar = cosasAComprar;
	}

	public List<PlatoDTO> getPlatos() {
		return platos;
	}

	public void setPlatos(List<PlatoDTO> platos) {
		this.platos = platos;
	}

	public List<ComandaDTO> getComandas() {
		return comandas;
	}

	public void setComandas(List<ComandaDTO> comandas) {
		this.comandas = comandas;
	}

	public List<PlandeProduccionDTO> getPlanesDeProduccion() {
		return planesDeProduccion;
	}

	public void setPlanesDeProduccion(List<PlandeProduccionDTO> planesDeProduccion) {
		this.planesDeProduccion = planesDeProduccion;
	}

	public List<InsumoDTO> getInsumos() {
		return insumos;
	}

	public void setInsumos(List<InsumoDTO> insumos) {
		this.insumos = insumos;
	}

}
