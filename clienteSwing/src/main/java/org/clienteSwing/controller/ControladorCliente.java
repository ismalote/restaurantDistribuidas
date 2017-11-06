package org.clienteSwing.controller;

import org.repositorio.bussinessDelegate.BussinessDelegate;
import org.repositorio.dtos.CrearComandaDTO;
import org.repositorio.exceptions.BusinessException;

public class ControladorCliente {
	
	
	
	public void crearComanda(CrearComandaDTO comanda) throws BusinessException, Exception {
		
		BussinessDelegate.getInstancia().crearComanda(comanda);
		
	}

	
}
