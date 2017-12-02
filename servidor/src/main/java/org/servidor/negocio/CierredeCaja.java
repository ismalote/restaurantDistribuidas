package org.servidor.negocio;

import java.util.Date;

import org.repositorio.exceptions.CierreNotFoundException;
import org.servidor.dao.CierreCajaDAO;

public class CierredeCaja {

	private Integer idCierre;
	private boolean estado;
	private Date fechaCierre;
	private Caja caja;
	private float montoNeto;
	private float montoComisiones;

	public CierredeCaja(boolean estado, Date fechaCierre, Caja caja, Float monto) {
		super();

		this.estado = estado;
		this.fechaCierre = fechaCierre;
		this.caja = caja;
		this.montoNeto = monto;

	}

	public CierredeCaja() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdCierre() {
		return idCierre;
	}

	public void setIdCierre(Integer idCierre) {
		this.idCierre = idCierre;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Date getFechaCierre() {
		return fechaCierre;
	}

	public void setFechaCierre(Date fechaCierre) {
		this.fechaCierre = fechaCierre;
	}

	public Caja getCaja() {
		return caja;
	}

	public void setCaja(Caja caja) {
		this.caja = caja;
	}

	public boolean cerrar() {
		// TODO Auto-generated method stub
		if (this.estado) {
			throw new CierreNotFoundException(" cerrarCaja() fail, because status's caja close today ");
		}

		this.estado = true;
		return save();

	}

	public boolean save() {
		return CierreCajaDAO.getInstancia().save(this);
	}

	public float getMontoNeto() {
		return montoNeto;
	}

	public void setMontoNeto(float montoNeto) {
		this.montoNeto = montoNeto;
	}

	public float getMontoComisiones() {
		return montoComisiones;
	}

	public void setMontoComisiones(float montoComisiones) {
		this.montoComisiones = montoComisiones;
	}

}
