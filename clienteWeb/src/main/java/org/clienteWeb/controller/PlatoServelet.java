package org.clienteWeb.controller;

import java.util.List;

import org.repositorio.bussinessDelegate.BussinessDelegate;
import org.repositorio.dtos.ObtenerPlatoDto;
import org.repositorio.dtos.PlatoMenuDTO;
import org.repositorio.exceptions.BusinessException;

import com.google.gson.Gson;

public class PlatoServelet {
	
	
	
	public String obtenerPlatoporId(int idPlato) throws BusinessException {
	
		ObtenerPlatoDto plato = BussinessDelegate.getInstancia().obtenerPlatoporId(idPlato);
		String Json = new Gson().toJson(plato);
		return Json;
		
		}
	
	public String platosDelMenu() throws BusinessException {
		
		List<PlatoMenuDTO> plato =BussinessDelegate.getInstancia().platosDelMenu();
		String Json= new Gson().toJson(plato);
		return Json;
		
	}

}
