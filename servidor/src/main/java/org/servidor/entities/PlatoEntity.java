package org.servidor.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="plato")
public class PlatoEntity {

	@Id
	private Integer idPlato;

	@ManyToMany
	private List<ProductoComestibleEntity> productos;

//	@ManyToMany
//	private ComandaEntity comanda;

	private Float precio;

	@ManyToMany
	private List<CartaEntity> carta;

	private Float comisionExtra;

	public void setIdPlato(Integer idPlato) {
		this.idPlato = idPlato;
	}

	public List<ProductoComestibleEntity> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoComestibleEntity> productos) {
		this.productos = productos;
	}

//	public ComandaEntity getComandas() {
//		return comanda;
//	}

//	public void setComandas(ComandaEntity comandas) {
//		this.comanda = comandas;
//	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public List<CartaEntity> getCarta() {
		return carta;
	}

	public void setCarta(List<CartaEntity> carta) {
		this.carta = carta;
	}

	public Float getComisionExtra() {
		return comisionExtra;
	}

	public void setComisionExtra(Float comisionExtra) {
		this.comisionExtra = comisionExtra;
	}

}
