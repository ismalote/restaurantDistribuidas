package org.servidor.dao;

import org.servidor.entities.ListadoComprasEntity;
import org.servidor.negocio.ListadoCompras;

public class ListadoCompraDAO {

	private static ListadoCompraDAO instancia;

	private ListadoCompraDAO() {
	}

	public static ListadoCompraDAO getInstancia() {
		if (instancia == null) {
			instancia = new ListadoCompraDAO();
		}
		return instancia;
	}

	public ListadoCompras toNegocio(ListadoComprasEntity l) {
		return new ListadoCompras(l.getIdListadoCompras(), l.getAreaSolicitante(), null); // TODO
	}

	public ListadoComprasEntity toEntity(ListadoCompras compras) {
		return new ListadoComprasEntity(); // TODO
	}
}
