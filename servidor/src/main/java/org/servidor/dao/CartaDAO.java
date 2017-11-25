package org.servidor.dao;

import java.util.ArrayList;
import java.util.List;

import org.servidor.entities.CartaEntity;
import org.servidor.entities.PlatoEntity;
import org.servidor.negocio.Carta;
import org.servidor.negocio.Plato;

public class CartaDAO {

	private static CartaDAO instancia;

	private CartaDAO() {
	}

	public static CartaDAO getInstancia() {
		if (instancia == null) {
			instancia = new CartaDAO();
		}
		return instancia;
	}

	public Carta toNegocio(CartaEntity e) {
		List<PlatoEntity> platos = e.getPlatos();
		List<Plato> p = new ArrayList<Plato>();
		for (PlatoEntity platoEntity : platos) {
			p.add(PlatoDAO.getInstancia().toNegocio(platoEntity));
		}
		return new Carta(e.getIdCarta(), p);
	}

	public CartaEntity toEntity(Carta carta) {
		List<PlatoEntity> p = new ArrayList<PlatoEntity>();
		for (Plato plato : carta.getPlatos()) {
			p.add(PlatoDAO.getInstancia().toEntity(plato));
		}
		return new CartaEntity(carta.getIdCarta(), p);
	}
}
