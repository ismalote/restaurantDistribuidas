package org.servidor.negocio;

import java.util.List;

public class Barra extends AreaProduccion {

	public Barra(String tipoArea, EncargadoArea encargadoArea, Stock stock, List<Comanda> comandas) {
		super(tipoArea, encargadoArea, stock, comandas);
	}

	@Override
	public boolean prepararComanda(Comanda comanda) {
		return false;
	}
}
