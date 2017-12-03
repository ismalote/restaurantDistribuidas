package org.clienteWeb.servlets;

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
	private static ProductoServlet instancia;

	public void init(ServletConfig config) throws ServletException {
	}

	public void doGet(HttpServletRequest req, HttpServletResponse resp) {
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) {
	}

	public static ProductoServlet getInstancia() {
		if (instancia == null) {
			instancia = new ProductoServlet();
		}
		return instancia;
	}

	private ProductoServlet() {
	};

	public String listarProductosParaPedir() throws BusinessException {

		List<ProductosAPedirDTO> listaP = BussinessDelegate.getInstancia().listarProductosParaPedir();
		String Json = new Gson().toJson(listaP);
		return Json;

	}

}
