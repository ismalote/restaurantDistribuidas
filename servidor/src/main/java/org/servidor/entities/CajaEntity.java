package org.servidor.entities;

import java.util.List;

public class CajaEntity extends AreaEntity {
	
	// la herencia debe ser de la clase AreaProduccion o Area ?
	
	@OneToOne
	@JoinColumn(name="idEncargadoArea")
	private EncargadoAreaEntity encargadoCaja;
	
	@OneToMany
	@JoinColumn(mappedBy="comanda")
	private List<ComandaEntity> comandas;

	public CajaEntity(){}
	
	public CajaEntity(Integer nroArea, EncargadoAreaDTO encargado, List<ComandaEntity> comandas){
		super(nroArea);
		this.encargadoCaja= encargado;
		this.comandas= comandas
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
