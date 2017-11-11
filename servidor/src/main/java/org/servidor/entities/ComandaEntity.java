package org.servidor.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comanda")
public class ComandaEntity {

	@Id
	private Integer idComanda;

	@OneToMany(mappedBy = "comanda")
	private List<ItemComandaEntity> platos;

	@ManyToOne
	@JoinColumn(name = "idMozo")
	private MozoEntity mozo;

	public List<ItemComandaEntity> getPlatos() {
		return platos;
	}

	public void setPlatos(List<ItemComandaEntity> platos) {
		this.platos = platos;
	}

	public MozoEntity getMozo() {
		return mozo;
	}

	public void setMozo(MozoEntity mozo) {
		this.mozo = mozo;
	}

	public LocalEntity getLocalRestaurante() {
		return localRestaurante;
	}

	public void setLocalRestaurante(LocalEntity localRestaurante) {
		this.localRestaurante = localRestaurante;
	}

	public RestaurantEntity getRestauranteComandas() {
		return restauranteComandas;
	}

	public void setRestauranteComandas(RestaurantEntity restauranteComandas) {
		this.restauranteComandas = restauranteComandas;
	}

	public FacturaEntity getFact() {
		return fact;
	}

	public void setFact(FacturaEntity fact) {
		this.fact = fact;
	}

	private Boolean cerrada;

	@ManyToOne
	@JoinColumn(name = "idMesa")
	private MesaEntity mesa;

	// @OneToOne
	// @JoinColumn(name="idMesaEstado")
	// private EstadoComandaEntity estadoComanda;
	private Integer estadoComanda;

	@ManyToOne
	private LocalEntity localRestaurante;

	@ManyToOne
	private RestaurantEntity restauranteComandas;

	@OneToOne(mappedBy = "comanda")
	private FacturaEntity fact;

	public ComandaEntity(Integer idComanda, List<ItemComandaEntity> platos, MozoEntity mozo, Boolean cerrada,
			MesaEntity mesa, Integer estadoComanda, FacturaEntity fact) {
		super();
		this.idComanda = idComanda;
		this.platos = platos;
		this.mozo = mozo;
		this.cerrada = cerrada;
		this.mesa = mesa;
		this.estadoComanda = estadoComanda;
		this.fact = fact;
	}

	public ComandaEntity() {
	}

	public Integer getIdComanda() {
		return idComanda;
	}

	public void setIdComanda(Integer idComanda) {
		this.idComanda = idComanda;
	}

	// public List<ItemComandaEntity> getPlatos() {
	// return platos;
	// }

	// public void setPlatos(List<ItemComandaEntity> platos) {
	// this.platos = platos;
	// }

	// public MozoEntity getMozo() {
	// return mozo;
	// }

	// public void setMozo(MozoEntity mozo) {
	// this.mozo = mozo;
	// }

	public Boolean getCerrada() {
		return cerrada;
	}

	public void setCerrada(Boolean cerrada) {
		this.cerrada = cerrada;
	}

	public MesaEntity getMesa() {
		return mesa;
	}

	public void setMesa(MesaEntity mesa) {
		this.mesa = mesa;
	}

	public Integer getEstadoComanda() {
		return estadoComanda;
	}

	public void setEstadoComanda(Integer estadoComanda) {
		this.estadoComanda = estadoComanda;
	}

}
