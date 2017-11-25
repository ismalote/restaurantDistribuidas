package org.servidor.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.servidor.negocio.AreaProduccion;

@Entity
@Table(name = "plato")
public class PlatoEntity {

	@Id
	private Integer idPlato;

	@Column(name = "nombrePlato")
	private String nombrePlato;

	@ManyToMany
	private List<ProductoComestibleEntity> productos;

	private Float precio;

	@ManyToOne
	private CartaEntity carta;
	
	private Float comisionExtra;
	@ManyToOne
	private AreaProduccionEntity area;

	public PlatoEntity() {
		// TODO Auto-generated constructor stub
	}


	public PlatoEntity(Integer idPlato, String nombrePlato, List<ProductoComestibleEntity> productos, Float precio,
			CartaEntity carta, Float comisionExtra, AreaProduccionEntity area) {
		super();
		this.idPlato = idPlato;
		this.nombrePlato = nombrePlato;
		this.productos = productos;
		this.precio = precio;
		this.carta = carta;
		this.comisionExtra = comisionExtra;
		this.area = area;
	}


	public void setIdPlato(Integer idPlato) {
		this.idPlato = idPlato;
	}

	public List<ProductoComestibleEntity> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoComestibleEntity> productos) {
		this.productos = productos;
	}

	// public ComandaEntity getComandas() {
	// return comanda;
	// }

	// public void setComandas(ComandaEntity comandas) {
	// this.comanda = comandas;
	// }

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public CartaEntity getCarta() {
		return carta;
	}

	public void setCarta(CartaEntity carta) {
		this.carta = carta;
	}

	public Float getComisionExtra() {
		return comisionExtra;
	}

	public void setComisionExtra(Float comisionExtra) {
		this.comisionExtra = comisionExtra;
	}

	public String getNombrePlato() {
		return nombrePlato;
	}

	public void setNombrePlato(String nombrePlato) {
		this.nombrePlato = nombrePlato;
	}

	public Integer getIdPlato() {
		return idPlato;
	}


	public AreaProduccionEntity getArea() {
		return area;
	}


	public void setArea(AreaProduccionEntity area) {
		this.area = area;
	}
	

}
