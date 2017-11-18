package org.clienteSwing.controller;

import java.rmi.RemoteException;
import java.util.List;

import org.repositorio.bussinessDelegate.BussinessDelegate;
import org.repositorio.dtos.CrearComandaDTO;
import org.repositorio.dtos.ItemComandaDTO;
import org.repositorio.dtos.MesaDTO;
import org.repositorio.exceptions.BusinessException;

public class ControladorCliente {

	public void crearComanda(CrearComandaDTO comanda) throws BusinessException, Exception {

		BussinessDelegate.getInstancia().crearComanda(comanda);

	}

	public void abrirMesaNueva(List<Integer> numeros) {
		try {
			BussinessDelegate.getInstancia().abrirMesaNueva(numeros);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<MesaDTO> listarMesasLibresPorSector(Integer sector) throws RemoteException, Exception {

		return BussinessDelegate.getInstancia().listarMesasLibres(sector);
	}
	
	public List<ItemComandaDTO> listaDeItemComanda (int idComanda) throws RemoteException, Exception{
		
		return BussinessDelegate.getInstancia().listarItemComanda(idComanda);
	}
	
}
