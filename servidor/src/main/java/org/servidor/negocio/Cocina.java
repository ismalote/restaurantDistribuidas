package org.servidor.negocio;

import java.util.List;

public class Cocina extends AreaProduccion {

	public Cocina(Integer id, Operador encargado, List<ProductoComestible> productos, List<Comanda> comandas) {
		super(id, encargado, productos, comandas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean prepararComanda(Comanda comanda) {
		return false;
	}

}