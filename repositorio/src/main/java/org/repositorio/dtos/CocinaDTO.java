package org.repositorio.dtos;

import java.util.List;

public class CocinaDTO extends AreaProduccionDTO {

	public CocinaDTO(String tipoArea, EncargadoAreaDTO encargadoArea, StockDTO stock, List<ComandaDTO> comandas) {
		super(tipoArea, encargadoArea, stock, comandas);
	}

	@Override
	public boolean prepararComanda(ComandaDTO comanda) {
		return false;
	}

}