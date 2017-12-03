package org.clienteWeb.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.repositorio.bussinessDelegate.BussinessDelegate;
import org.repositorio.dtos.ProductosAPedirDTO;
import org.repositorio.exceptions.BusinessException;

import com.google.gson.Gson;

public class ProductoServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
	}

	public void doGet(HttpServletRequest req, HttpServletResponse resp) {
		try {
			resp.getWriter().println(listarProductosParaPedir());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) {
	}

	public String listarProductosParaPedir() throws BusinessException {

		List<ProductosAPedirDTO> listaP = BussinessDelegate.getInstancia().listarProductosParaPedir();
		String Json = new Gson().toJson(listaP);
		return Json;
	}
	
}
