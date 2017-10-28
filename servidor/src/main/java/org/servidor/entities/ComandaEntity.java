package org.servidor.entities;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


public class ComandaEntity {


	@Id
	private Integer idComanda;
	
	@OneToMany(mappedBy="plato")
	private List<PlatoEntity> platos;
	
	@OneToOne(mappedBy="idMozo")
	private MozoEntity mozo;
	
	private Boolean comandaLista;
	
	@OneToOne(mappedBy="idMesa")
	private MesaEntity mesa;
	
	@OneToOne
	@JoinColumn(name="idMesaEstado")
	private EstadoComandaEntity estadoComanda;
	
	@ManyToOne
	@JoinColumn (name="idLocal")
	private LocalEntity local;

	@OneToOne(mappedBy="FacturaEntity")
	private FacturaEntity fact;


	public ComandaEntity(Integer idComanda, List<PlatoEntity> platos, MozoEntity mozo, Boolean comandaLista,
			MesaEntity mesa, EstadoComandaEntity estadoComanda, FacturaEntity fact) {
		super();
		this.idComanda = idComanda;
		this.platos = platos;
		this.mozo = mozo;
		this.comandaLista = comandaLista;
		this.mesa = mesa;
		this.estadoComanda = estadoComanda;
		this.fact = fact;
	}


	public Integer getIdComanda() {
		return idComanda;
	}


	public void setIdComanda(Integer idComanda) {
		this.idComanda = idComanda;
	}


	public List<PlatoEntity> getPlatos() {
		return platos;
	}


	public void setPlatos(List<PlatoEntity> platos) {
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


	public EstadoComandaEntity getEstadoComanda() {
		return estadoComanda;
	}


	public void setEstadoComanda(EstadoComandaEntity estadoComanda) {
		this.estadoComanda = estadoComanda;
	}


	public FacturaEntity getFact() {
		return fact;
	}


	public void setFact(FacturaEntity fact) {
		this.fact = fact;
	}



}
