package org.clienteWeb.controller;

import java.util.List;

import org.repositorio.bussinessDelegate.BussinessDelegate;
import org.repositorio.dtos.AgregarItemsComandaDTO;
import org.repositorio.dtos.ItemComandaDTO;
import org.repositorio.exceptions.BusinessException;

import com.google.gson.Gson;

public class ItemComandaServelet {

	
	//Ojo con este metodo, esta el agregarItemComanda que devuelve boolean
	public String agregarItemsAComanda(AgregarItemsComandaDTO item) throws BusinessException {
		
		AgregarItemsComandaDTO items = BussinessDelegate.getInstancia().agregarItemsAComanda(item);
		String Json = new Gson().toJson(items);
		return Json;
		
	}
	
	public String listarItemComanda(int idComanda) throws BusinessException{
		
		List<ItemComandaDTO> items = BussinessDelegate.getInstancia().listarItemComanda(idComanda);
		String Json = new Gson().toJson(items);
		return Json;
	}
	
	public String PedidoXSector(Integer idArea, Integer idLocal) throws BusinessException{
		
		List<ItemComandaDTO> items = BussinessDelegate.getInstancia().PedidoXSector(idArea, idLocal);
		String Json = new Gson().toJson(items);
		return Json;
		
	}
	
	
}
