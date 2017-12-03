package org.servidor.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cierreCaja")
public class CierredeCajaEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idCierre;

	private Date fechaCierre;
	private boolean estado;

	@ManyToOne
	private CajaEntity caja;

	private Float montoDelDia;
	private Float montoComisiones;

	public CierredeCajaEntity(Integer idCierre, boolean estado, Date fechaCierre, CajaEntity caja, Float monto) {
		super();
		this.idCierre = idCierre;
		this.fechaCierre = fechaCierre;
		this.estado = estado;
		this.caja = caja;
		this.montoDelDia = monto;
	}

	public CierredeCajaEntity() {
		// TODO Auto-generated constructor stub
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Integer getIdCierre() {
		return idCierre;
	}

	public void setIdCierre(Integer idCierre) {
		this.idCierre = idCierre;
	}

	public Date getFechaCierre() {
		return fechaCierre;
	}

	public void setFechaCierre(Date fechaCierre) {
		this.fechaCierre = fechaCierre;
	}

	public CajaEntity getCaja() {
		return caja;
	}

	public void setCaja(CajaEntity caja) {
		this.caja = caja;
	}

	public Float getMontoDelDia() {
		return montoDelDia;
	}

	public void setMontoDelDia(Float montoDelDia) {
		this.montoDelDia = montoDelDia;
	}

	public Float getMontoComisiones() {
		return montoComisiones;
	}

	public void setMontoComisiones(Float montoComisiones) {
		this.montoComisiones = montoComisiones;
	}

}
