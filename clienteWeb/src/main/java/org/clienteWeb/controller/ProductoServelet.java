package org.clienteWeb.controller;

import java.util.List;

import org.repositorio.bussinessDelegate.BussinessDelegate;
import org.repositorio.dtos.ProductosAPedirDTO;
import org.repositorio.exceptions.BusinessException;

import com.google.gson.Gson;

public class ProductoServelet {
	private static ProductoServelet instancia;
	
	


	public static ProductoServelet getInstancia() {
		if(instancia==null) {
			instancia= new ProductoServelet();
		}
		return instancia;
	}

	private ProductoServelet(){};



	public String listarProductosParaPedir() throws BusinessException {

		List<ProductosAPedirDTO> listaP = BussinessDelegate.getInstancia().listarProductosParaPedir();
		String Json = new Gson().toJson(listaP);
		return Json;
		
		}
	
	
	
}
