package org.repositorio.dtos;

import java.io.Serializable;
import java.util.List;

public class ElaboradoDTO extends ProductoComestibleDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 324201138116302605L;
	private List<ProductoComestibleDTO> productos;

	public ElaboradoDTO(Integer idProducto, AreaProduccionDTO area, Integer cantidadPedido, Integer puntoPedido,
			String descripcion, Integer stock, Float precio) {
		super(idProducto, area, cantidadPedido, puntoPedido, descripcion, stock, precio);
		// TODO Auto-generated constructor stub
	}

	public List<ProductoComestibleDTO> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoComestibleDTO> productos) {
		this.productos = productos;
	}

}
