package org.clienteWeb.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.repositorio.bussinessDelegate.BussinessDelegate;
import org.repositorio.dtos.ComandaDTO;
import org.repositorio.dtos.CrearComandaDTO;
import org.repositorio.exceptions.BusinessException;

import com.google.gson.Gson;

public class ComandaServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int idMozo = Integer.valueOf(req.getParameter("idMozo"));
		String action = req.getParameter("action");
		if ("listar".equals(action)) {
			List<ComandaDTO> comandasMozo = BussinessDelegate.getInstancia().listarComandasMozo(idMozo);
			resp.getWriter().println(new Gson().toJson(comandasMozo));
		} else {
			req.setAttribute("idMozo", idMozo);
			req.getRequestDispatcher("jsp/Comanda(abrir,cerrar,add).jsp").forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String idMozo = req.getParameter("idMozo");
		String numMesa = req.getParameter("num_mesa");
		String cantComensales = req.getParameter("cant_comensales");

		CrearComandaDTO dto = new CrearComandaDTO(Integer.parseInt(idMozo), Integer.parseInt(numMesa),
				Integer.parseInt(cantComensales), 0);
		try {
			BussinessDelegate.getInstancia().crearComanda(dto);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		req.setAttribute("idMozo", idMozo);
		req.getRequestDispatcher("jsp/Comanda(abrir,cerrar,add).jsp").forward(req, resp);
	}

}
