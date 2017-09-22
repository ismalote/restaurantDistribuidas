package org.servidor.Entities;

import java.util.List;

public class CajaEntity extends AreaEntity {
	
	private EncargadoAreaEntity encargadoCaja;
	private List<ComandaEntity> comandas;
	
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
	

	
	
	
	//TODO faltan metodos, OJO esto es HERENCIA NO POLIMORFISMO...creo...

}
