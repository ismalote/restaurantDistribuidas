package org.servidor.negocio;

import java.util.List;

import org.repositorio.dtos.AreaProduccionDTO;
import org.repositorio.dtos.ComandaDTO;
import org.repositorio.dtos.EncargadoAreaDTO;
import org.repositorio.dtos.StockDTO;

public class Barra extends AreaProduccionDTO {

	public Barra(String tipoArea, EncargadoAreaDTO encargadoArea, StockDTO stock, List<ComandaDTO> comandas) {
		super(tipoArea, encargadoArea, stock, comandas);
	}

	@Override
	public boolean prepararComanda(ComandaDTO comanda) {
		return false;
	}
}
