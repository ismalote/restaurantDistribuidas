package org.servidor.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="caja")
public class CajaEntity extends AreaEntity {

	// la herencia debe ser de la clase AreaProduccion o Area ?

	@OneToOne
	@JoinColumn(name = "idEncargadoArea")
	private EncargadoAreaEntity encargadoCaja;

	@OneToMany(mappedBy = "comanda")
	private List<ComandaEntity> comandas;

	public CajaEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CajaEntity(Integer id, EncargadoAreaEntity encargado, List<ComandaEntity> comandas) {
		super(id);
		this.encargadoCaja = encargado;
		this.comandas = comandas;

		// TODO Auto-generated constructor stub
	}

}
