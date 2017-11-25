package org.servidor.negocio;

import java.util.List;

public class SemiElaborado extends ProductoComestible {

	private List<ProductoComestible> materiales;

	public SemiElaborado(Integer idProducto, Integer cantidadPedido, Integer puntoPedido, String descripcion,
			Integer stock, Float precio) {
		super(idProducto, cantidadPedido, puntoPedido, descripcion, stock, precio);
	}

	public List<ProductoComestible> getMateriales() {
		return materiales;
	}

	public void setMateriales(List<ProductoComestible> materiales) {
		this.materiales = materiales;
	}

}
