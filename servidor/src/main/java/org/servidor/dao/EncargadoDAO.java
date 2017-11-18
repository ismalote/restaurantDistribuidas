package org.servidor.dao;

import org.servidor.entities.EncargadoAreaEntity;
import org.servidor.entities.EncargadoEntity;
import org.servidor.negocio.Encargado;

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

	public Encargado toNegocio(EncargadoEntity e) {
		return new Encargado(e.getIdEncargado(), e.getNombre(), e.getApellido(), null);
	}

	public EncargadoEntity toEntity(Encargado encargado) {
		return new EncargadoAreaEntity(); // TODO
	}
}
