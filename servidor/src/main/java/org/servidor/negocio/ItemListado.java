package org.servidor.negocio;

import org.repositorio.dtos.InsumoDTO;

public class ItemListado {

	private InsumoDTO insumo;
	private Integer cantidad;

	public ItemListado(InsumoDTO insumo, Integer cantidad) {
		super();
		this.insumo = insumo;
		this.cantidad = cantidad;
	}

	public InsumoDTO getInsumo() {
		return insumo;
	}

	public void setInsumo(InsumoDTO insumo) {
		this.insumo = insumo;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	// todo metodo?

}
