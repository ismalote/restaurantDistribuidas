package org.repositorio.dtos;

import java.io.Serializable;
import java.util.List;

public class SemiElaboradoDTO extends ProductoComestibleDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2340867769513938568L;
	private List<ProductoComestibleDTO> materiales;

	public SemiElaboradoDTO(Integer idProducto, AreaProduccionDTO area, Integer cantidadPedido, Integer puntoPedido,
			String descripcion, Integer stock, Float precio) {
		super(idProducto, area, cantidadPedido, puntoPedido, descripcion, stock, precio);
		// TODO Auto-generated constructor stub
	}

	public List<ProductoComestibleDTO> getMateriales() {
		return materiales;
	}

	public void setMateriales(List<ProductoComestibleDTO> materiales) {
		this.materiales = materiales;
	}

}
