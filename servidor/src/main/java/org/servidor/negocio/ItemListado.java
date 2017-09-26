package org.servidor.negocio;

public class ItemListado {
	
	private Insumo insumo;
	private Integer cantidad;
	
	public ItemListado(Insumo insumo, Integer cantidad) {
		super();
		this.insumo = insumo;
		this.cantidad = cantidad;
	}

	public Insumo getInsumo() {
		return insumo;
	}

	public void setInsumo(Insumo insumo) {
		this.insumo = insumo;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	//todo metodo?
	

}
