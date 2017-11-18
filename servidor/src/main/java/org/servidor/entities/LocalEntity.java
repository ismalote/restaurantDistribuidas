package org.servidor.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "localRestaurante")
public class LocalEntity {

	public LocalEntity() {
	}

	@Id
	private Integer idLocal;

	@OneToMany(mappedBy = "localRestaurante")
	private List<EncargadoEntity> encargadosAreas;

	@OneToMany(mappedBy = "localRestaurante")
	private List<MozoEntity> mozos;

	@OneToMany(mappedBy = "localRestaurante")
	private List<MesaEntity> mesas;

	@OneToMany(mappedBy = "localRestaurante")
	private List<ComandaEntity> comandas;

	@OneToOne
	@JoinColumn(name = "idDeposito")
	private DepositoEntity deposito;

	@OneToOne
	@JoinColumn(name = "idCaja")
	private CajaEntity caja;

	@OneToMany(mappedBy = "localRestaurante")
	private List<AreaProduccionEntity> areas;

	@OneToOne
	@JoinColumn(name = "idCarta")
	private CartaEntity carta;

	@OneToMany(mappedBy = "listasCompras")
	private List<ListadoComprasEntity> listadosCompras;

	@ManyToOne
	private RestaurantEntity restaurante;

	public Integer getIdLocal() {
		return idLocal;
	}

	public void setIdLocal(Integer idLocal) {
		this.idLocal = idLocal;
	}

	public List<EncargadoEntity> getEncargadosAreas() {
		return encargadosAreas;
	}

	public void setEncargadosAreas(List<EncargadoEntity> encargadosAreas) {
		this.encargadosAreas = encargadosAreas;
	}

	public List<MozoEntity> getMozos() {
		return mozos;
	}

	public void setMozos(List<MozoEntity> mozos) {
		this.mozos = mozos;
	}

	public List<MesaEntity> getMesas() {
		return mesas;
	}

	public void setMesas(List<MesaEntity> mesas) {
		this.mesas = mesas;
	}

	public List<ComandaEntity> getComandas() {
		return comandas;
	}

	public void setComandas(List<ComandaEntity> comandas) {
		this.comandas = comandas;
	}

	public DepositoEntity getDeposito() {
		return deposito;
	}

	public void setDeposito(DepositoEntity deposito) {
		this.deposito = deposito;
	}

	public CajaEntity getCaja() {
		return caja;
	}

	public void setCaja(CajaEntity caja) {
		this.caja = caja;
	}

	public List<AreaProduccionEntity> getAreas() {
		return areas;
	}

	public void setAreas(List<AreaProduccionEntity> areas) {
		this.areas = areas;
	}

	public CartaEntity getCarta() {
		return carta;
	}

	public void setCarta(CartaEntity carta) {
		this.carta = carta;
	}

	public List<ListadoComprasEntity> getListadosCompras() {
		return listadosCompras;
	}

	public void setListadosCompras(List<ListadoComprasEntity> listadosCompras) {
		this.listadosCompras = listadosCompras;
	}

	public RestaurantEntity getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(RestaurantEntity restaurante) {
		this.restaurante = restaurante;
	}
}
