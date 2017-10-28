package org.servidor.negocio;

import java.util.List;

public class Plato {

	private Integer idPlato;
	private List<ProductoComestible> plato;
	private Float precio;
	private Carta carta;
	private Comanda comanda;
	private Float comisionExtra;

	public Plato(Integer idPlato, List<ProductoComestible> plato, Float precio, Carta carta, Comanda comandas,
			Float comisionExtra) {
		super();
		this.idPlato = idPlato;
		this.plato = plato;
		this.precio = precio;
		this.carta = carta;
		this.comanda = comandas;
		this.comisionExtra = comisionExtra;
	}

	public Integer getIdPlato() {
		return idPlato;
	}

	public void setIdPlato(Integer idPlato) {
		this.idPlato = idPlato;
	}

	public List<ProductoComestible> getPlato() {
		return plato;
	}

	public void setPlato(List<ProductoComestible> plato) {
		this.plato = plato;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Carta getCarta() {
		return carta;
	}

	public void setCarta(Carta carta) {
		this.carta = carta;
	}

	public Comanda getComandas() {
		return comanda;
	}

	public void setComandas(Comanda comandas) {
		this.comanda = comandas;
	}

	public Float getComisionExtra() {
		return comisionExtra;
	}

	public void setComisionExtra(Float comisionExtra) {
		this.comisionExtra = comisionExtra;
	}

	public void calcularPrecio() {
		// TODO Auto-generated method stub

	}

}
