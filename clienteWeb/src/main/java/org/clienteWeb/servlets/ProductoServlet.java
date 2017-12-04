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

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int idMozo = Integer.valueOf(req.getParameter("idMozo"));
		String action = req.getParameter("action");
		if ("listar".equals(action)) {
			try {
				resp.getWriter().println(listarProductosParaPedir());
			} catch (BusinessException e) {
				e.printStackTrace();
			}
		} else {
			req.setAttribute("idMozo", idMozo);
			req.getRequestDispatcher("jsp/agregarItemComandaMozo.jsp").forward(req, resp);
		}
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int idMozo = Integer.valueOf(req.getParameter("idMozo"));
		int idComanda = Integer.valueOf(req.getParameter("idComanda"));
		int idPlato = Integer.valueOf(req.getParameter("idPlato"));

		// AgregarItemComandaDTO item = new AgregarItemComandaDTO(idPlato, idComanda);
		// BussinessDelegate.getInstancia().agregarItemAComanda(item );

		req.setAttribute("idMozo", idMozo);
		req.getRequestDispatcher("jsp/agregarItemComandaMozo.jsp").forward(req, resp);
	}

	public String listarProductosParaPedir() throws BusinessException {

		List<ProductosAPedirDTO> listaP = BussinessDelegate.getInstancia().listarProductosParaPedir();
		String Json = new Gson().toJson(listaP);
		return Json;
	}

}
