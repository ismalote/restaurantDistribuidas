package org.servidor.negocio;

import java.util.List;

public class Cafeteria extends AreaProduccion {

	public Cafeteria(String tipoArea, EncargadoArea encargadoArea, Stock stock, List<Comanda> comandas) {
		super(tipoArea, encargadoArea, stock, comandas);
	}

	@Override
	public boolean prepararComanda(Comanda comanda) {
		return false;
	}
}