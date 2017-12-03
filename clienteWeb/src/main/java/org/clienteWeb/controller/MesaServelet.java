package org.clienteWeb.controller;

import java.util.List;

import org.repositorio.bussinessDelegate.BussinessDelegate;
import org.repositorio.dtos.AbrirMesaDTO;
import org.repositorio.dtos.MesaDTO;
import org.repositorio.exceptions.BusinessException;

import com.google.gson.Gson;

public class MesaServelet {
	
	
	public String  listarMesasLibres(Integer sector) throws BusinessException {
		
		List<MesaDTO> mesa=BussinessDelegate.getInstancia().listarMesasLibres(sector);
		String Json = new Gson().toJson(mesa);
		return Json;
	}
	
	
	public String mesasLibres(Integer numeroSector) throws BusinessException {
		
		List<MesaDTO> mesas = BussinessDelegate.getInstancia().mesasLibres(numeroSector);
		String Json = new Gson().toJson(mesas);
		return Json;
	
	}

}
