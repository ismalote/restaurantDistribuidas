package org.servidor.entities;

import java.util.List;

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

	@ManyToMany
	private List<ProductoComestibleEntity> productos;

	@ManyToOne
	private RestaurantEntity restaurantePlatos;

	private Float precio;

	@ManyToOne
	private CartaEntity carta;

	private Float comisionExtra;

	public PlatoEntity() {
		// TODO Auto-generated constructor stub
	}

	public PlatoEntity(Integer idPlato, List<ProductoComestibleEntity> productos, RestaurantEntity restaurantePlatos,
			Float precio, CartaEntity carta, Float comisionExtra) {
		super();
		this.idPlato = idPlato;
		this.productos = productos;
		this.restaurantePlatos = restaurantePlatos;
		this.precio = precio;
		this.carta = carta;
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

}
