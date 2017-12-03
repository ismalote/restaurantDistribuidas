package org.servidor.negocio;

import java.util.ArrayList;
import java.util.List;

import org.repositorio.dtos.PlatoDTO;
import org.repositorio.dtos.PlatoMenuDTO;
import org.repositorio.dtos.ProductoComestibleDTO;
import org.servidor.dao.ProductoComestibleDAO;
import org.servidor.entities.PlatoEntity;
import org.servidor.entities.ProductoComestibleEntity;

public class Plato {

	private Integer idPlato;
	private String nombrePlato;
	private List<ProductoComestible> productos;
	private Float precio;
	private Float comisionExtra;
	private AreaProduccion area;

	public Plato(Integer idProductos, String nombrePlato, List<ProductoComestible> productos, Float precio,
			Float comisionExtra, AreaProduccion area) {
		super();
		this.idPlato = idProductos;
		this.nombrePlato = nombrePlato;
		this.productos = productos;
		this.precio = precio;
		this.comisionExtra = comisionExtra;
		this.area = area;
	}

	public Plato(PlatoEntity entity) {
		this.idPlato = entity.getIdPlato();
		this.precio = entity.getPrecio();
		this.comisionExtra = entity.getComisionExtra();
		this.nombrePlato = entity.getNombrePlato();

		this.area = null; // TODO DAO.toNegocio

		this.productos = new ArrayList<ProductoComestible>();
		for (ProductoComestibleEntity p : entity.getProductos()) {
			this.productos.add(ProductoComestibleDAO.getInstancia().toNegocio(p));
		}
	}

	public Plato(PlatoDTO dto) {
		this.productos = new ArrayList<ProductoComestible>();
		for (ProductoComestibleDTO p : dto.getProductos()) {
			this.productos.add(ProductoComestible.getNewDTO(p));

		}
		this.precio = dto.getPrecio();
		this.comisionExtra = dto.getComisionExtra();
	}

	// Metodo que sirve para poder listar los productos a la hora de crear una
	// comanda y ver el stock de cada plato
	public PlatoMenuDTO toDTOMenu() {

		Boolean estadoStock = true;

		for (ProductoComestible prod : this.productos) {
			if (prod.getStock() == 0) {
				estadoStock = false;
			}

		}

		return new PlatoMenuDTO(this.idPlato, this.nombrePlato, this.precio, estadoStock);
	}

	public List<ProductoComestible> getProducto() {
		return productos;
	}

	public void setProducto(List<ProductoComestible> plato) {
		this.productos = plato;
	}

	public Integer getIdPlato() {
		return idPlato;
	}

	public void setIdPlato(Integer idPlato) {
		this.idPlato = idPlato;
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

	public void calcularPrecio() {
		// TODO Auto-generated method stub
		
		
	}

	public Integer getIdProductos() {
		return idPlato;
	}

	public void setIdProductos(Integer idProductos) {
		this.idPlato = idProductos;
	}

	public String getNombrePlato() {
		return nombrePlato;
	}

	public void setNombrePlato(String nombrePlato) {
		this.nombrePlato = nombrePlato;
	}

	public List<ProductoComestible> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoComestible> productos) {
		this.productos = productos;
	}

	public AreaProduccion getArea() {
		return area;
	}

	public void setArea(AreaProduccion area) {
		this.area = area;
	}

}
