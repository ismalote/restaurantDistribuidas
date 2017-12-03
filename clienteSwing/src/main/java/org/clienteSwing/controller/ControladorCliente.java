package org.clienteSwing.controller;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.repositorio.bussinessDelegate.BussinessDelegate;
import org.repositorio.dtos.AgregarItemComandaDTO;
import org.repositorio.dtos.AgregarItemsComandaDTO;
import org.repositorio.dtos.ComandaDTO;
import org.repositorio.dtos.CrearComandaDTO;
import org.repositorio.dtos.ItemComandaDTO;
import org.repositorio.dtos.MesaDTO;
import org.repositorio.dtos.PlatoAConfirmarDTO;
import org.repositorio.exceptions.BusinessException;

public enum ControladorCliente {

	INSTANCE;

	private Map<Integer, ComandaDTO> comandasCache = new HashMap<Integer, ComandaDTO>();

	public void abrirMesaNueva(List<Integer> numeros) {
		try {
			BussinessDelegate.getInstancia().abrirMesaNueva(numeros);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<MesaDTO> listarMesasLibresPorSector(Integer sector) throws RemoteException, Exception {

		return BussinessDelegate.getInstancia().listarMesasLibres(sector);
	}

	public void crearComanda(int idMozo, int numeroMesa, int cantidadComensales, int idLocal) throws BusinessException {
		CrearComandaDTO comanda = new CrearComandaDTO(idMozo, numeroMesa, cantidadComensales, idLocal);
		BussinessDelegate.getInstancia().crearComanda(comanda);
	}

	public List<ItemComandaDTO> listaDeItemComanda(int idComanda) throws RemoteException, Exception {

		return BussinessDelegate.getInstancia().listarItemComanda(idComanda);
	}

	public List<PlatoAConfirmarDTO> MostrarPlatoaArea(int idArea, int idLocal) {
		return null;

	}

	public void reservarMesa(int cantidadComensales, String descripcion, Date fechaHora) throws BusinessException {
		BussinessDelegate.getInstancia().reservarMesa(cantidadComensales, descripcion, fechaHora);
	}

	public void agregarItemAComanda(int idComanda, int idPlato, int cantidad) {
		this.comandasCache.put(1, new ComandaDTO(1, null, false, null, 4));
		ComandaDTO c = this.comandasCache.get(idComanda);
		if (c != null) {
			c.add(new AgregarItemComandaDTO(idPlato, idComanda));
		}
	}

	public void confirmarPedido(int idComanda) throws BusinessException {
		ComandaDTO c = this.comandasCache.get(idComanda);
		if (c != null) {
			AgregarItemsComandaDTO dto = new AgregarItemsComandaDTO(idComanda);
			dto.setItems(c.getPlatos());
			BussinessDelegate.getInstancia().agregarItemsAComanda(dto);
		}
	}

}
