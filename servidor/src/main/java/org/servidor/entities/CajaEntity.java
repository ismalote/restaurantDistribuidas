package org.servidor.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("caja")
public class CajaEntity {

	// la herencia debe ser de la clase AreaProduccion o Area ?

	@Id
	private Integer idCaja;

	@OneToOne
	@JoinColumn(name = "idEncargadoArea")
	private EncargadoAreaEntity encargadoCaja;

	@OneToMany(mappedBy= "caja")
	private CierredeCajaEntity cierre;
	
	public CajaEntity() {
		// TODO Auto-generated constructor stub
	}
	// @OneToMany(mappedBy = "caja")
	// private List<ComandaEntity> comandas;

	public CajaEntity(Integer idCaja, EncargadoAreaEntity encargadoCaja) {
		super();
		this.idCaja = idCaja;
		this.encargadoCaja = encargadoCaja;
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

}
