package org.servidor.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="restaurante")
public class RestaurantEntity {

	@Id
	private Integer idRestaurante;

	private LocalEntity LocalLogueado;
	@OneToMany(mappedBy = "restaurante")
	private List<LocalEntity> locales;
	@OneToOne
	@JoinColumn(name = "idDeposito")
	private DepositoCentralEntity depositoCentral;
	@OneToOne
	@JoinColumn(name = "idAdmin")
	private AdministracionEntity administracion;
	@OneToMany(mappedBy = "restaurante")
	private List<ListadoComprasEntity> cosasAComprar;
	@OneToMany(mappedBy = "restaurante")
	private List<PlatoEntity> platos;
	@OneToMany(mappedBy = "restaurante")
	private List<ComandaEntity> comandas;
	@OneToMany(mappedBy = "restaurante")
	private List<PlandeProduccionEntity> planesDeProduccion;
	@OneToMany(mappedBy = "restaurante")
	private List<InsumoEntity> insumos;

	public RestaurantEntity(Integer idRestaurante, LocalEntity localLogueado, List<LocalEntity> locales,
			DepositoCentralEntity depositoCentral, AdministracionEntity administracion,
			List<ListadoComprasEntity> cosasAComprar, List<PlatoEntity> platos, List<ComandaEntity> comandas,
			List<PlandeProduccionEntity> planesDeProduccion, List<InsumoEntity> insumos) {
		super();
		this.idRestaurante = idRestaurante;
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

	public Integer getIdRestaurante() {
		return idRestaurante;
	}

	public void setIdRestaurante(Integer idRestaurante) {
		this.idRestaurante = idRestaurante;
	}

}
