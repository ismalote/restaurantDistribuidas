package org.servidor.negocio;

import java.util.ArrayList;
import java.util.List;

import org.repositorio.dtos.PlatoDTO;
import org.repositorio.dtos.ProductoComestibleDTO;
import org.servidor.entities.PlatoEntity;
import org.servidor.entities.ProductoComestibleEntity;

public class Plato {

	private Integer idProductos;
	private List<ProductoComestible> productos;
	private Float precio;
	private Carta carta;
	private Comanda comanda;
	private Float comisionExtra;

	public Plato(Integer idPlato, List<ProductoComestible> productos, Float precio, Carta carta, Comanda comandas,
			Float comisionExtra) {
		super();
		this.idProductos = idPlato;
		this.productos = productos;
		this.precio = precio;
		this.carta = carta;
		this.comanda = comandas;
		this.comisionExtra = comisionExtra;
	}

	public Plato(PlatoEntity entity) {
		this.productos = new ArrayList<ProductoComestible>();
		for (ProductoComestibleEntity p : entity.getProductos()) {
			this.productos.add(ProductoComestible.getNew(p));

		}
		this.precio = entity.getPrecio();
		this.comisionExtra = entity.getComisionExtra();
	}

	public Plato(PlatoDTO dto) {
		this.productos = new ArrayList<ProductoComestible>();
		for (ProductoComestibleDTO p : dto.getProductos()) {
			this.productos.add(ProductoComestible.getNewDTO(p));

		}
		this.precio = dto.getPrecio();
		this.comisionExtra = dto.getComisionExtra();
	}

	public List<ProductoComestible> getProducto() {
		return productos;
	}

	public void setProducto(List<ProductoComestible> plato) {
		this.productos = plato;
	}

	public Integer getIdProducto() {
		return idProductos;
	}

	public void setIdProducto(Integer idProductos) {
		this.idProductos = idProductos;
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
