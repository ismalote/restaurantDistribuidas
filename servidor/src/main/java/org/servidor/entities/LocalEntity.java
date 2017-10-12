package org.servidor.entities;

import java.util.List;

public class LocalEntity {

	private List<EncargadoEntity> encargadosAreas;
	private List<MozoEntity> mozos;
	private SalonEntity salon;
	private DepositoEntity deposito;
	private List<AreaEntity> areas;
	private CartaEntity carta;
	private List<ListadoComprasEntity> listadosCompras;

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

	// TODO faltan metodos

}
