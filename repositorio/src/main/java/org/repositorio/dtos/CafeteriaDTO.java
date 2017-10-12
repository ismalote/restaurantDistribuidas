package org.repositorio.dtos;

import java.util.List;

public class CafeteriaDTO extends AreaProduccionDTO {

	public CafeteriaDTO(String tipoArea, EncargadoAreaDTO encargadoArea, StockDTO stock, List<ComandaDTO> comandas) {
		super(tipoArea, encargadoArea, stock, comandas);
	}

	@Override
	public boolean prepararComanda(ComandaDTO comanda) {
		return false;
	}
}
