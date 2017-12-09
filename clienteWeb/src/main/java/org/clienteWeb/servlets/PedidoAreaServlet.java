package org.clienteWeb.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.repositorio.bussinessDelegate.BussinessDelegate;
import org.repositorio.dtos.ItemComandaDTO;

import com.google.gson.Gson;

public class PedidoAreaServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void init(ServletConfig config) throws ServletException {
	}

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String area= req.getParameter("area");
		if("cocina".equals(area)) {
			List<ItemComandaDTO> pedidos = BussinessDelegate.getInstancia().obtenerPlatosAProducir(0);
			resp.getWriter().println(new Gson().toJson(pedidos));
			
		}else if("barra".equals(area)) {
			List<ItemComandaDTO> pedidos = BussinessDelegate.getInstancia().obtenerPlatosAProducir(1);
			resp.getWriter().println(new Gson().toJson(pedidos));
			
		}else if ("cafeteria".equals(area)) {
			
				List<ItemComandaDTO> pedidos = BussinessDelegate.getInstancia().obtenerPlatosAProducir(2);
				resp.getWriter().println(new Gson().toJson(pedidos));
			
		}

	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) {
	}
}
