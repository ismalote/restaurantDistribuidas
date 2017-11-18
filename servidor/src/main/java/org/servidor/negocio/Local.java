package org.servidor.negocio;

import java.util.List;

public class Local {

	private List<Encargado> encargadosAreas;
	private List<Mozo> mozos;
	private List<Mesa> mesas;
	private Deposito deposito;
	private List<AreaProduccion> areas;
	private Caja caja;
	private Carta carta;
	private List<ListadoCompras> listadosCompras;

	public Local(List<Encargado> encargadosAreas, List<Mozo> mozos, List<Mesa> mesas, Deposito deposito,
			List<AreaProduccion> areas, Caja caja, Carta carta, List<ListadoCompras> listadosCompras) {
		super();
		this.encargadosAreas = encargadosAreas;
		this.mozos = mozos;
		this.mesas = mesas;
		this.deposito = deposito;
		this.areas = areas;
		this.caja = caja;
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


	public Deposito getDeposito() {
		return deposito;
	}

	public void setDeposito(Deposito deposito) {
		this.deposito = deposito;
	}

	public List<Mesa> getMesas() {
		return mesas;
	}

	public void setMesas(List<Mesa> mesas) {
		this.mesas = mesas;
	}

	public List<AreaProduccion> getAreas() {
		return areas;
	}

	public void setAreas(List<AreaProduccion> areas) {
		this.areas = areas;
	}

	public Caja getCaja() {
		return caja;
	}

	public void setCaja(Caja caja) {
		this.caja = caja;
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
