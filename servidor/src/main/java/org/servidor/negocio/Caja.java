package org.servidor.negocio;

import java.util.List;

public class Caja {

	private Integer idCaja;	
	private EncargadoArea encargadoCaja;
	private List<Comanda> comandas;

	public Caja(Integer idArea) {
		this.idCaja=idArea;
		// TODO Auto-generated constructor stub
	}

	public EncargadoArea getEncargadoCaja() {
		return encargadoCaja;
	}

	public void setEncargadoCaja(EncargadoArea encargadoCaja) {
		this.encargadoCaja = encargadoCaja;
	}

	public List<Comanda> getComandas() {
		return comandas;
	}

	public void setComandas(List<Comanda> comandas) {
		this.comandas = comandas;
	}

	// TODO faltan metodos, OJO esto es HERENCIA NO POLIMORFISMO...creo...

}
