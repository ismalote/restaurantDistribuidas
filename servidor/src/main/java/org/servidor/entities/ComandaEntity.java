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

	@OneToOne(mappedBy = "comanda")
	private MozoEntity mozo;

	private Boolean comandaLista;

	@OneToOne(mappedBy = "comanda")
	private MesaEntity mesa;

	// @OneToOne
	// @JoinColumn(name="idMesaEstado")
	// private EstadoComandaEntity estadoComanda;
	private Integer estadoComanda;

	@ManyToOne
	@JoinColumn(name = "idLocal")
	private LocalEntity local;

	@OneToOne(mappedBy = "comanda")
	private FacturaEntity fact;

	public ComandaEntity(Integer idComanda, List<ItemComandaEntity> platos, MozoEntity mozo, Boolean comandaLista,
			MesaEntity mesa, Integer estadoComanda, FacturaEntity fact) {
		super();
		this.idComanda = idComanda;
		this.platos = platos;
		this.mozo = mozo;
		this.comandaLista = comandaLista;
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

	public Boolean getComandaLista() {
		return comandaLista;
	}

	public void setComandaLista(Boolean comandaLista) {
		this.comandaLista = comandaLista;
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

	public FacturaEntity getFact() {
		return fact;
	}

	public void setFact(FacturaEntity fact) {
		this.fact = fact;
	}

}
