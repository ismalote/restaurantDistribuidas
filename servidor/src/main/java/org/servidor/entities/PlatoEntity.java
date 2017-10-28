package org.servidor.entities;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class PlatoEntity {

<<<<<<< HEAD
	@Id
	private Integer idPlato;

	@ManyToMany
	private List<ProductoComestibleEntity> productos;

	@ManyToOne
	private ComandaEntity comanda;

=======
	private List<ProductoComestibleEntity> productos;
>>>>>>> branch 'master' of https://github.com/ismalote/restaurantDistribuidas
	private Float precio;

	@ManyToOne
	@JoinColumn(name = "idCarta")
	private CartaEntity carta;

	private Float comisionExtra;

<<<<<<< HEAD
	public Integer getIdPlato() {
		return idPlato;
=======
	public List<ProductoComestibleEntity> getProductos() {
		return productos;
>>>>>>> branch 'master' of https://github.com/ismalote/restaurantDistribuidas
	}

<<<<<<< HEAD
	public void setIdPlato(Integer idPlato) {
		this.idPlato = idPlato;
	}

	public List<ProductoComestibleEntity> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoComestibleEntity> productos) {
		this.productos = productos;
	}

	public ComandaEntity getComandas() {
		return comanda;
	}

	public void setComandas(ComandaEntity comandas) {
		this.comanda = comandas;
=======
	public void setProductos(List<ProductoComestibleEntity> productos) {
		this.productos = productos;
>>>>>>> branch 'master' of https://github.com/ismalote/restaurantDistribuidas
	}

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
