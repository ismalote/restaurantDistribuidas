package org.repositorio.dtos;

import java.io.Serializable;

public class ItemListadoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4033814257643199404L;
	private InsumoDTO insumo;
	private Integer cantidad;

	public ItemListadoDTO(InsumoDTO insumo, Integer cantidad) {
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
