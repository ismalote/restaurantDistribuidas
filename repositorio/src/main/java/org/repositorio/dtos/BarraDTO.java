package org.repositorio.dtos;

import java.io.Serializable;
import java.util.List;

public class BarraDTO extends AreaProduccionDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6490845237778347409L;

	public BarraDTO(Integer id, String tipoArea, OperadorDTO encargado, List<ProductoComestibleDTO> productos,
			List<ComandaDTO> comandas) {
		super(id, tipoArea, encargado, productos, comandas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean prepararComanda(ComandaDTO comanda) {
		return false;
	}
}
