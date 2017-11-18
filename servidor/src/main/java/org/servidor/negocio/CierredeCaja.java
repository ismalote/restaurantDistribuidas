package org.servidor.negocio;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.servidor.entities.CajaEntity;

public class CierredeCaja {

	private Integer idCierre;
	private boolean estado;
	private Date fechaCierre;
	private Caja caja;

	public CierredeCaja(Integer idCierre, boolean estado, Date fechaCierre, Caja caja) {
		super();
		this.idCierre = idCierre;
		this.estado = estado;
		this.fechaCierre = fechaCierre;
		this.caja = caja;
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

}
