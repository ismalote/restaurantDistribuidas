package org.repositorio.dtos;

import java.io.Serializable;
import java.util.List;

public class BarraDTO extends AreaProduccionDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6490845237778347409L;

	public BarraDTO(String tipoArea, EncargadoAreaDTO encargadoArea, StockDTO stock, List<ComandaDTO> comandas) {
		super(tipoArea, encargadoArea, stock, comandas);
	}

	@Override
	public boolean prepararComanda(ComandaDTO comanda) {
		return false;
	}
}
