package org.servidor.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="carta")
public class CartaEntity {

	@Id
	@Column(name = "idCarta")
	private Integer idCarta;

	@OneToMany(mappedBy = "plato")
	private List<PlatoEntity> platos;

	public CartaEntity(Integer idCarta, List<PlatoEntity> platos) {
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

	public List<PlatoEntity> getPlatos() {
		return platos;
	}

	public void setPlatos(List<PlatoEntity> platos) {
		this.platos = platos;
	}



}
