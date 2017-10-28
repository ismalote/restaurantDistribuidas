package org.servidor.negocio;

import java.util.ArrayList;
import java.util.List;
import org.repositorio.dtos.PlatoDTO;
import org.repositorio.dtos.ProductoComestibleDTO;

import org.servidor.entities.PlatoEntity;
import org.servidor.entities.ProductoComestibleEntity;

public class Plato {

	private List<ProductoComestible> plato;
	private Float precio;
	private Area area;
	private Float comisionExtra;

	public Plato(List<ProductoComestible> plato, Float precio, Area area, Float comisionExtra) {
		super();
		this.plato = plato;
		this.precio = precio;
		this.area = area;
		this.comisionExtra = comisionExtra;
	}

	public Plato(PlatoEntity entity) {
		this.plato= new ArrayList<ProductoComestible>();
		for (ProductoComestibleEntity p : entity.getProductos()) {
			this.plato.add(ProductoComestible.getNew(p));
			
		}
		this.precio= entity.getPrecio();
		this.area= new Area(entity.getArea());
		this.comisionExtra= entity.getComisionExtra();
	}

	public Plato(PlatoDTO dto) {
		this.plato= new ArrayList<ProductoComestible>();
		for (ProductoComestibleDTO p : dto.getProductos()) {
			this.plato.add(ProductoComestible.getNewDTO(p));
			
		}
		this.precio= dto.getPrecio();
		this.area= new Area(dto.getArea());
		this.comisionExtra= dto.getComisionExtra();
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

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Float getComisionExtra() {
		return comisionExtra;
	}

	public void setComisionExtra(Float comisionExtra) {
		this.comisionExtra = comisionExtra;
	}

}
