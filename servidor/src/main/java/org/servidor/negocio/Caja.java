package org.servidor.negocio;

import java.util.List;

import org.servidor.dao.CajaDAO;

public class Caja {

	private Integer idCaja;
	private List<Comanda> comandas;
	private float montoIncial;

	public Caja(Integer idArea, float monto) {
		this.idCaja = idArea;
		this.montoIncial = monto;
		// TODO Auto-generated constructor stub
	}

	public Caja() {
		// TODO Auto-generated constructor stub
	}

	public List<Comanda> getComandas() {
		return comandas;
	}

	public void setComandas(List<Comanda> comandas) {
		this.comandas = comandas;
	}

	public Integer getIdCaja() {
		return idCaja;
	}

	public void setIdCaja(Integer idCaja) {
		this.idCaja = idCaja;
	}

	public float getMontoIncial() {
		return montoIncial;
	}

	public void setMontoIncial(float montoIncial) {
		this.montoIncial = montoIncial;
	}

	public boolean save() {
		return CajaDAO.getInstancia().save(this);
	}
	// TODO faltan metodos, OJO esto es HERENCIA NO POLIMORFISMO...creo...

}
