package org.repositorio.dtos;

import java.io.Serializable;
import java.util.List;

public class CafeteriaDTO extends AreaProduccionDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4180838690631557099L;

	public CafeteriaDTO(Integer id, String tipoArea, EncargadoDTO encargado, List<ProductoComestibleDTO> productos,
			List<ComandaDTO> comandas) {
		super(id, tipoArea, encargado, productos, comandas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean prepararComanda(ComandaDTO comanda) {
		return false;
	}
}
