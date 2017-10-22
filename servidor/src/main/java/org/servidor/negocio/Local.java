package org.servidor.negocio;

import java.util.List;

public class Local {

	private List<Encargado> encargadosAreas;
	private List<Mozo> mozos;
	private Salon salon;
	private Deposito deposito;
	private List<Area> areas;
	private Carta carta;
	private List<ListadoCompras> listadosCompras;

	public Local(List<Encargado> encargadosAreas, List<Mozo> mozos, Salon salon, Deposito deposito,
			List<Area> areas, Carta carta, List<ListadoCompras> listadosCompras) {
		super();
		this.encargadosAreas = encargadosAreas;
		this.mozos = mozos;
		this.salon = salon;
		this.deposito = deposito;
		this.areas = areas;
		this.carta = carta;
		this.listadosCompras = listadosCompras;
	}

	public List<Encargado> getEncargadosAreas() {
		return encargadosAreas;
	}

	public void setEncargadosAreas(List<Encargado> encargadosAreas) {
		this.encargadosAreas = encargadosAreas;
	}

	public List<Mozo> getMozos() {
		return mozos;
	}

	public void setMozos(List<Mozo> mozos) {
		this.mozos = mozos;
	}

	public Salon getSalon() {
		return salon;
	}

	public void setSalon(Salon salon) {
		this.salon = salon;
	}

	public Deposito getDeposito() {
		return deposito;
	}

	public void setDeposito(Deposito deposito) {
		this.deposito = deposito;
	}

	public List<Area> getAreas() {
		return areas;
	}

	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}

	public Carta getCarta() {
		return carta;
	}

	public void setCarta(Carta carta) {
		this.carta = carta;
	}

	public List<ListadoCompras> getListadosCompras() {
		return listadosCompras;
	}

	public void setListadosCompras(List<ListadoCompras> listadosCompras) {
		this.listadosCompras = listadosCompras;
	}

	// TODO faltan metodos

}
