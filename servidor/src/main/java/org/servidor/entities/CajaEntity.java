package org.servidor.entities;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("caja")
@Table(name = "caja")
public class CajaEntity {

	// la herencia debe ser de la clase AreaProduccion o Area ?

	@Id
	private Integer idCaja;

	@OneToOne
	@JoinColumn(name = "idEncargadoArea")
	private EncargadoAreaEntity encargadoCaja;

	@OneToMany(mappedBy = "caja")
	private List<CierredeCajaEntity> cierre;

	public CajaEntity() {
		// TODO Auto-generated constructor stub
	}
	// @OneToMany(mappedBy = "caja")
	// private List<ComandaEntity> comandas;

	public CajaEntity(Integer idCaja, EncargadoAreaEntity encargadoCaja, List<CierredeCajaEntity> cierre) {
		super();
		this.idCaja = idCaja;
		this.encargadoCaja = encargadoCaja;
		this.cierre = cierre;
	}

	public Integer getIdCaja() {
		return idCaja;
	}

	public void setIdCaja(Integer idCaja) {
		this.idCaja = idCaja;
	}

	public EncargadoAreaEntity getEncargadoCaja() {
		return encargadoCaja;
	}

	public void setEncargadoCaja(EncargadoAreaEntity encargadoCaja) {
		this.encargadoCaja = encargadoCaja;
	}

	public List<CierredeCajaEntity> getCierre() {
		return cierre;
	}

	public void setCierre(List<CierredeCajaEntity> cierre) {
		this.cierre = cierre;
	}

}
