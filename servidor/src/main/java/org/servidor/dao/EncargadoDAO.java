package org.servidor.dao;

import org.servidor.entities.EncargadoAreaEntity;
import org.servidor.entities.OperadorEntity;
import org.servidor.negocio.Operador;

public class EncargadoDAO {

	private static EncargadoDAO instancia;

	private EncargadoDAO() {
	}

	public static EncargadoDAO getInstancia() {
		if (instancia == null) {
			instancia = new EncargadoDAO();
		}
		return instancia;
	}

	public Operador toNegocio(OperadorEntity e) {
		return new Operador(e.getIdOperador(), e.getNombre(), e.getApellido(), null);
	}

	public OperadorEntity toEntity(Operador encargado) {
		return new EncargadoAreaEntity(); // TODO
	}
}
