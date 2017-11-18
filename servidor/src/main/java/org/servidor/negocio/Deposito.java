package org.servidor.negocio;

public class Deposito {

	private Integer idDeposito;
	private Encargado encargadoDeposito;

	public Deposito(Encargado encargadoDeposito) {
		this.encargadoDeposito = encargadoDeposito;
	}

	public Encargado getEncargadoDeposito() {
		return encargadoDeposito;
	}

	public void setEncargadoDeposito(Encargado encargadoDeposito) {
		this.encargadoDeposito = encargadoDeposito;
	}

	public Integer getIdDeposito() {
		return idDeposito;
	}

	public void setIdDeposito(Integer idDeposito) {
		this.idDeposito = idDeposito;
	}

}