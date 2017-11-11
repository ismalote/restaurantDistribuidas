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

	public LocalEntity(Integer idLocal, List<EncargadoEntity> encargadosAreas, List<MozoEntity> mozos,
			List<ComandaEntity> comandas, SalonEntity salon, DepositoEntity deposito, List<AreaEntity> areas,
			CartaEntity carta, List<ListadoComprasEntity> listadosCompras, RestaurantEntity restaurante) {
		super();
		this.idLocal = idLocal;
		this.encargadosAreas = encargadosAreas;
		this.mozos = mozos;
		this.comandas = comandas;
		this.salon = salon;
		this.deposito = deposito;
		this.areas = areas;
		this.carta = carta;
		this.listadosCompras = listadosCompras;
		this.restaurante = restaurante;
	}

	public LocalEntity() {
		// TODO Auto-generated constructor stub
	}

	@Id
	private Integer idLocal;

	@OneToMany(mappedBy = "localRestaurante")
	private List<EncargadoEntity> encargadosAreas;

	@OneToMany(mappedBy = "localRestaurante")
	private List<MozoEntity> mozos;

	@OneToMany(mappedBy = "localRestaurante")
	private List<ComandaEntity> comandas;

	@OneToOne
	@JoinColumn(name = "idSalon")
	private SalonEntity salon;

	@OneToOne
	@JoinColumn(name = "idArea")
	private DepositoEntity deposito;

	@OneToMany(mappedBy = "localRestaurante")
	private List<AreaEntity> areas;

	@OneToOne
	@JoinColumn(name = "idCarta")
	private CartaEntity carta;

	@OneToMany(mappedBy = "listasCompras")
	private List<ListadoComprasEntity> listadosCompras;

	@ManyToOne
	private RestaurantEntity restaurante;

	public LocalEntity(Integer idLocal, List<EncargadoEntity> encargadosAreas, List<MozoEntity> mozos,
			SalonEntity salon, DepositoEntity deposito, List<AreaEntity> areas, CartaEntity carta,
			List<ListadoComprasEntity> listadosCompras) {
		super();
		this.idLocal = idLocal;
		this.encargadosAreas = encargadosAreas;
		this.mozos = mozos;
		this.salon = salon;
		this.deposito = deposito;
		this.areas = areas;
		this.carta = carta;
		this.listadosCompras = listadosCompras;
	}

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

	public SalonEntity getSalon() {
		return salon;
	}

	public void setSalon(SalonEntity salon) {
		this.salon = salon;
	}

	public DepositoEntity getDeposito() {
		return deposito;
	}

	public void setDeposito(DepositoEntity deposito) {
		this.deposito = deposito;
	}

	public List<AreaEntity> getAreas() {
		return areas;
	}

	public void setAreas(List<AreaEntity> areas) {
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

}
