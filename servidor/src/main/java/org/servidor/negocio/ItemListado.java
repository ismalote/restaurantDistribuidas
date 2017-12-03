package org.servidor.negocio;

import org.repositorio.dtos.ItemListadoDTO;

public class ItemListado {

	private ProductoComestible insumo;
	private Integer cantidad;
	private Integer id;

	public ItemListado(ProductoComestible insumo, Integer cantidad) {
		super();
		this.insumo = insumo;
		this.cantidad = cantidad;
	}
	
	public ItemListado(Integer id, ProductoComestible insumo, Integer cantidad) {
		super();
		this.id = id;
		this.insumo = insumo;
		this.cantidad = cantidad;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ProductoComestible getInsumo() {
		return insumo;
	}

	public void setInsumo(ProductoComestible insumo) {
		this.insumo = insumo;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public ItemListadoDTO toDTO(){
		return new ItemListadoDTO(this.getInsumo().toProdAPedirDTO(), this.getCantidad());
	}

}
