package org.servidor.negocio;

import java.util.List;

import org.servidor.entities.SemiElaboradoEntity;

public class SemiElaborado extends ProductoComestible {

	private List<ProductoComestible> materiales;




	public SemiElaborado(Integer idProducto, AreaProduccion area, Integer cantidadPedido, Integer puntoPedido,
			String descripcion, Integer stock, Float precio) {
		super(idProducto, area, cantidadPedido, puntoPedido, descripcion, stock, precio);
		// TODO Auto-generated constructor stub
	}

	public List<ProductoComestible> getMateriales() {
		return materiales;
	}

	public void setMateriales(List<ProductoComestible> materiales) {
		this.materiales = materiales;
	}





}
