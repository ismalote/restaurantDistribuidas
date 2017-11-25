package org.servidor.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cierreCaja")
public class CierredeCajaEntity {

	@Id
	private Integer idCierre;

	private Date fechaCierre;

	@ManyToOne
	private CajaEntity caja;

	public CierredeCajaEntity(Integer idCierre, boolean estado, Date fechaCierre, CajaEntity caja) {
		super();
		this.idCierre = idCierre;
		this.fechaCierre = fechaCierre;
		this.caja = caja;
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

}
