package org.servidor.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "itemListado")
public class ItemListadoEntity {

	@Id
	private Integer idItemlistado;

	@OneToOne
	@JoinColumn(name = "idInsumo")
	private InsumoEntity insumo;
	private Integer cantidad;
	@ManyToOne
	private ListadoComprasEntity lc;

	public ItemListadoEntity(Integer idItemlistado, InsumoEntity insumo, Integer cantidad) {
		super();
		this.idItemlistado = idItemlistado;
		this.insumo = insumo;
		this.cantidad = cantidad;
	}

	public ItemListadoEntity() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdItemlistado() {
		return idItemlistado;
	}

	public void setIdItemlistado(Integer idItemlistado) {
		this.idItemlistado = idItemlistado;
	}

	public InsumoEntity getInsumo() {
		return insumo;
	}

	public void setInsumo(InsumoEntity insumo) {
		this.insumo = insumo;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	// todo metodo?

}
