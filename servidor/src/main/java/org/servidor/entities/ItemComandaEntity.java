package org.servidor.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.servidor.Enum.EstadoItemComanda;

@Entity
@Table(name = "items")
public class ItemComandaEntity {

	@Id
	private Integer idItemComanda;
	private Integer cantidad;

	@OneToOne
	@JoinColumn(name = "idPlato")
	private PlatoEntity plato;
	
	@Column(name="estado")
	private EstadoItemComanda estado;

	
	@ManyToOne
	private ComandaEntity comanda;

	

	

	public ItemComandaEntity(Integer idItemComanda, Integer cantidad, PlatoEntity plato, EstadoItemComanda estado,
			ComandaEntity comanda) {
		super();
		this.idItemComanda = idItemComanda;
		this.cantidad = cantidad;
<<<<<<< HEAD
		this.plato = plato;
		this.estado = estado;
		this.comanda = comanda;
=======
		this.plato = idPlato;
>>>>>>> branch 'master' of https://github.com/ismalote/restaurantDistribuidas.git
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

<<<<<<< HEAD
	public PlatoEntity getPlato() {
=======
	public PlatoEntity getIdPlato() {
>>>>>>> branch 'master' of https://github.com/ismalote/restaurantDistribuidas.git
		return plato;
	}

<<<<<<< HEAD
	public void setPlato(PlatoEntity plato) {
		this.plato = plato;
=======
	public void setIdPlato(PlatoEntity idPlato) {
		this.plato = idPlato;
>>>>>>> branch 'master' of https://github.com/ismalote/restaurantDistribuidas.git
	}

	public ComandaEntity getComanda() {
		return comanda;
	}

	public void setComanda(ComandaEntity comanda) {
		this.comanda = comanda;
	}

	public EstadoItemComanda getEstado() {
		return estado;
	}

	public void setEstado(EstadoItemComanda estado) {
		this.estado = estado;
	}



}
