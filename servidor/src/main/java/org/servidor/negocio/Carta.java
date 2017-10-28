package org.servidor.negocio;

import java.util.List;

public class Carta {

	private Integer idCarta;
	private List<Plato> platos;

	public Carta(Integer idCarta, List<Plato> platos) {
		super();
		this.idCarta = idCarta;
		this.platos = platos;
	}

	public Integer getIdCarta() {
		return idCarta;
	}

	public void setIdCarta(Integer idCarta) {
		this.idCarta = idCarta;
	}

	public List<Plato> getPlatos() {
		return platos;
	}

	public void setPlatos(List<Plato> platos) {
		this.platos = platos;
	}

}
