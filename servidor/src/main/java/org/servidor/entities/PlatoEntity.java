package org.servidor.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "plato")
public class PlatoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idPlato;

	@Column(name = "nombrePlato")
	private String nombrePlato;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(joinColumns = { @JoinColumn(name = "idPlato") }, inverseJoinColumns = { @JoinColumn(name = "idInsumo") })
	private List<ProductoComestibleEntity> productos;

	private Float precio;

	private Float comisionExtra;
	@ManyToOne
	private AreaProduccionEntity area;

	private String receta;

	public PlatoEntity() {
	}

	public PlatoEntity(Integer idPlato, String nombrePlato, List<ProductoComestibleEntity> productos, Float precio,
			Float comisionExtra, AreaProduccionEntity area) {
		super();
		this.idPlato = idPlato;
		this.nombrePlato = nombrePlato;
		this.productos = productos;
		this.precio = precio;
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

	public AreaProduccionEntity getArea() {
		return area;
	}

	public void setArea(AreaProduccionEntity area) {
		this.area = area;
	}

	public String getReceta() {
		return receta;
	}

	public void setReceta(String receta) {
		this.receta = receta;
	}

}
