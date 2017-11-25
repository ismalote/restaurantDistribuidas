package org.clienteSwing.controller;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

import org.repositorio.bussinessDelegate.BussinessDelegate;
import org.repositorio.dtos.CrearComandaDTO;
import org.repositorio.dtos.ItemComandaDTO;
import org.repositorio.dtos.MesaDTO;
import org.repositorio.dtos.PlatoAConfirmarDTO;

public enum ControladorCliente {

	INSTANCE;

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

	public void crearComanda(int idMozo, int numeroMesa, int cantidadComensales, int idLocal) {
		CrearComandaDTO comanda = new CrearComandaDTO(idMozo, numeroMesa, cantidadComensales, idLocal);
		BussinessDelegate.getInstancia().crearComanda(comanda);
	}

	public List<ItemComandaDTO> listaDeItemComanda(int idComanda) throws RemoteException, Exception {

		return BussinessDelegate.getInstancia().listarItemComanda(idComanda);
	}

	public List<PlatoAConfirmarDTO> MostrarPlatoaArea(int idArea, int idLocal) {
		return null;

	}

	public void reservarMesa(int cantidadComensales, String descripcion, Date fechaHora) {
		BussinessDelegate.getInstancia().reservarMesa(cantidadComensales, descripcion, fechaHora);
	}

}
