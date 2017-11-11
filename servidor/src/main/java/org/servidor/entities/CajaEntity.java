package org.servidor.entities;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("caja")
public class CajaEntity extends AreaEntity {

	// la herencia debe ser de la clase AreaProduccion o Area ?

	@OneToOne
	@JoinColumn(name = "idEncargadoArea")
	private EncargadoAreaEntity encargadoCaja;

	public CajaEntity(Integer idArea, LocalEntity localRestaurante) {
		super(idArea, localRestaurante);
		// TODO Auto-generated constructor stub
	}

	public CajaEntity() {
		// TODO Auto-generated constructor stub
	}
	// @OneToMany(mappedBy = "caja")
	// private List<ComandaEntity> comandas;

}
