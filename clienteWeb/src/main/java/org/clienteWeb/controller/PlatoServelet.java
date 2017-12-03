package org.clienteWeb.controller;

import java.util.List;

import org.repositorio.bussinessDelegate.BussinessDelegate;
import org.repositorio.dtos.ObtenerPlatoDto;
import org.repositorio.dtos.PlatoMenuDTO;

import com.google.gson.Gson;

public class PlatoServelet {
	
	
	
	public String obtenerPlatoporId(int idPlato) {
	
		ObtenerPlatoDto plato = BussinessDelegate.getInstancia().obtenerPlatoporId(idPlato);
		String Json = new Gson().toJson(plato);
		return Json;
		
		}
	
	public String platosDelMenu() {
		
		List<PlatoMenuDTO> plato =BussinessDelegate.getInstancia().platosDelMenu();
		String Json= new Gson().toJson(plato);
		return Json;
		
	}

}
