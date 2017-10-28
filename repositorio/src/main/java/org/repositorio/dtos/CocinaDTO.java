package org.repositorio.dtos;

import java.io.Serializable;
import java.util.List;

public class CocinaDTO extends AreaProduccionDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -139458814355639399L;

	public CocinaDTO(String tipoArea, EncargadoAreaDTO encargadoArea, StockDTO stock, List<ComandaDTO> comandas) {
		super(tipoArea, encargadoArea, stock, comandas);
	}

	@Override
	public boolean prepararComanda(ComandaDTO comanda) {
		return false;
	}

}