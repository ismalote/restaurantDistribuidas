package org.servidor.entities;

import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.repositorio.dtos.EncargadoAreaDTO;

public class CajaEntity extends AreaEntity {
	
	// la herencia debe ser de la clase AreaProduccion o Area ?
	
	@OneToOne
	@JoinColumn(name="idEncargadoArea")
	private EncargadoAreaEntity encargadoCaja;
	
	@OneToMany(mappedBy ="comanda")
	private List<ComandaEntity> comandas;

	
	
	public CajaEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CajaEntity(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public EncargadoAreaEntity getEncargadoCaja() {
		return encargadoCaja;
	}

	public void setEncargadoCaja(EncargadoAreaEntity encargadoCaja) {
		this.encargadoCaja = encargadoCaja;
	}

	public List<ComandaEntity> getComandas() {
		return comandas;
	}

	public void setComandas(List<ComandaEntity> comandas) {
		this.comandas = comandas;
	}

	// TODO faltan metodos, OJO esto es HERENCIA NO POLIMORFISMO...creo...

}
