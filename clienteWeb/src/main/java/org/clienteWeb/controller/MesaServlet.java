package org.clienteWeb.controller;

import java.util.List;

import org.repositorio.bussinessDelegate.BussinessDelegate;
import org.repositorio.dtos.MesaDTO;
import org.repositorio.exceptions.BusinessException;

import com.google.gson.Gson;

public class MesaServlet {

	public String mesasLibres(Integer numeroSector) throws BusinessException {

		List<MesaDTO> mesas = BussinessDelegate.getInstancia().mesasLibres();
		String Json = new Gson().toJson(mesas);
		return Json;

	}

}
