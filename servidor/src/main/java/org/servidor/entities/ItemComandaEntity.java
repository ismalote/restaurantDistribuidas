package org.servidor.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class ItemComandaEntity {

	@Id
	private Integer idItemComanda;
	private Integer cantidad;

	@OneToOne
	@JoinColumn(name = "idPlato")
	private PlatoEntity plato;

	@ManyToOne
	private ComandaEntity comanda;

	public ItemComandaEntity(Integer idItemComanda, Integer cantidad, PlatoEntity idPlato) {
		super();
		this.idItemComanda = idItemComanda;
		this.cantidad = cantidad;
		this.idPlato = idPlato;
	}

	public ItemComandaEntity() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdItemComanda() {
		return idItemComanda;
	}

	public void setIdItemComanda(Integer idItemComanda) {
		this.idItemComanda = idItemComanda;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public PlatoEntity getIdPlato() {
		return idPlato;
	}

	public void setIdPlato(PlatoEntity idPlato) {
		this.idPlato = idPlato;
	}

}
