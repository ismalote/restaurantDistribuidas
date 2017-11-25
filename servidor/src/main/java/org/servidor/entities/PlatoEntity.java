package org.servidor.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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

	private Float comisionExtra;

	public PlatoEntity() {
	}

	public PlatoEntity(Integer idPlato, String nombrePlato, List<ProductoComestibleEntity> productos, Float precio,
			Float comisionExtra) {
		super();
		this.idPlato = idPlato;
		this.nombrePlato = nombrePlato;
		this.productos = productos;
		this.precio = precio;
		this.comisionExtra = comisionExtra;
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

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
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

}
