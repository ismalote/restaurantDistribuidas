package org.servidor.dao;

import org.servidor.entities.DepositoEntity;
import org.servidor.negocio.Deposito;
import org.servidor.negocio.Encargado;

public class DepositoDAO {

	private static DepositoDAO instancia;

	private DepositoDAO() {
	}

	public static DepositoDAO getInstancia() {
		if (instancia == null) {
			instancia = new DepositoDAO();
		}
		return instancia;
	}

	public Deposito toNegocio(DepositoEntity e) {
		Encargado encargado = EncargadoDAO.getInstancia().toNegocio(e.getEncargadoDeposito());
		return new Deposito(encargado);
	}
}
