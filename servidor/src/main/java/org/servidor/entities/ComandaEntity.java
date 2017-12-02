package org.servidor.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "comanda")
public class ComandaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idComanda;

	@OneToMany(mappedBy = "comanda")
	@Cascade(value = CascadeType.ALL)
	private List<ItemComandaEntity> platos;

	@ManyToOne
	@JoinColumn(name = "idMozo")
	private MozoEntity mozo;

	private Boolean cerrada;

	@ManyToOne
	@JoinColumn(name = "idMesa")
	private MesaEntity mesa;

	private Integer cantidadComensales;

	@ManyToOne
	private LocalEntity localRestaurante;

	@OneToOne(mappedBy = "comanda")
	private FacturaEntity fact;

	private Date fecha;

	public ComandaEntity(Integer idComanda, List<ItemComandaEntity> platos, MozoEntity mozo, Boolean cerrada,
			MesaEntity mesa, Integer cantidadComensales, Date fecha, FacturaEntity fact) {
		super();
		this.idComanda = idComanda;
		this.platos = platos;
		this.mozo = mozo;
		this.cerrada = cerrada;
		this.mesa = mesa;
		this.cantidadComensales = cantidadComensales;
		this.fact = fact;
		this.fecha = fecha;
	}

	public ComandaEntity() {
	}

	public Integer getIdComanda() {
		return idComanda;
	}

	public void setIdComanda(Integer idComanda) {
		this.idComanda = idComanda;
	}

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

	public Integer getCantidadComensales() {
		return cantidadComensales;
	}

	public void setCantidadComensales(Integer cantidadComensales) {
		this.cantidadComensales = cantidadComensales;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
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

	public LocalEntity getLocalRestaurante() {
		return localRestaurante;
	}

	public void setLocalRestaurante(LocalEntity localRestaurante) {
		this.localRestaurante = localRestaurante;
	}

	public FacturaEntity getFact() {
		return fact;
	}

	public void setFact(FacturaEntity fact) {
		this.fact = fact;
	}

}
