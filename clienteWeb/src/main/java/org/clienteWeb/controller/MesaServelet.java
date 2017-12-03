package org.clienteWeb.controller;

import java.util.List;

import org.repositorio.bussinessDelegate.BussinessDelegate;
import org.repositorio.dtos.AbrirMesaDTO;
import org.repositorio.dtos.MesaDTO;

import com.google.gson.Gson;

public class MesaServelet {
	
	
	public String  listarMesasLibres(Integer sector) {
		
		List<MesaDTO> mesa=BussinessDelegate.getInstancia().listarMesasLibres(sector);
		String Json = new Gson().toJson(mesa);
		return Json;
	}
	
	
	public String mesasLibres(Integer numeroSector) {
		
		List<MesaDTO> mesas = BussinessDelegate.getInstancia().mesasLibres(numeroSector);
		String Json = new Gson().toJson(mesas);
		return Json;
	
	}

}
