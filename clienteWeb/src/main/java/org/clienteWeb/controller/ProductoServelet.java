package org.clienteWeb.controller;

import java.util.List;

import org.repositorio.bussinessDelegate.BussinessDelegate;
import org.repositorio.dtos.ProductosAPedirDTO;
import org.repositorio.exceptions.BusinessException;

import com.google.gson.Gson;

public class ProductoServelet {
	


	public String listarProductosParaPedir() throws BusinessException {

		List<ProductosAPedirDTO> listaP = BussinessDelegate.getInstancia().listarProductosParaPedir();
		String Json = new Gson().toJson(listaP);
		return Json;
		
		}
	
	
	
}
