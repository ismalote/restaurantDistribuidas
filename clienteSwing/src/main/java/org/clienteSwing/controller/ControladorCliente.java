package org.clienteSwing.controller;

import java.rmi.RemoteException;
import java.util.List;

import org.repositorio.bussinessDelegate.BussinessDelegate;
import org.repositorio.dtos.CrearComandaDTO;
import org.repositorio.exceptions.BusinessException;

public class ControladorCliente {
	
	
	
	public void crearComanda(CrearComandaDTO comanda) throws BusinessException, Exception {
		
		BussinessDelegate.getInstancia().crearComanda(comanda);
		
	}

	public void AbrirMesaNueva(List<Integer> numeros) {
		try {
			BussinessDelegate.getInstancia().AbrirMesaNueva(numeros);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
	
	public List<Integer> listarMesasLibresPorSector(Integer sector, Integer cantidadComensales) throws RemoteException, Exception{
		
	return BussinessDelegate.getInstancia().listarMesasLibres(sector,cantidadComensales);
	}	
}
