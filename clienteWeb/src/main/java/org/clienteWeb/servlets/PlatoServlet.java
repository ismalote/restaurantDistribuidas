package org.clienteWeb.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.repositorio.bussinessDelegate.BussinessDelegate;
import org.repositorio.dtos.AgregarItemComandaDTO;
import org.repositorio.dtos.ObtenerPlatoDto;
import org.repositorio.dtos.PlatoMenuDTO;
import org.repositorio.exceptions.BusinessException;

import com.google.gson.Gson;

public class PlatoServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");

		if ("listar".equals(action)) {
			try {
				String platos = new Gson().toJson(BussinessDelegate.getInstancia().platosDelMenu());
				resp.getWriter().println(platos);
			} catch (BusinessException e) {
				e.printStackTrace();
			}
		} else if ("abm".equals(action)) {
			req.getRequestDispatcher("jsp/crearPlato.jsp").forward(req, resp);
		} else {
			int idMozo = Integer.valueOf(req.getParameter("idMozo"));
			int idComanda = Integer.valueOf(req.getParameter("num_comanda"));
			req.setAttribute("idMozo", idMozo);
			req.setAttribute("idComanda", idComanda);
			req.getRequestDispatcher("jsp/agregarItemComandaMozo.jsp").forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Agregar Plato a Comanda
		String idMozo = req.getParameter("idMozo");
		String idComanda = req.getParameter("idComanda");
		String idPlato = req.getParameter("idPlato");
		String action = req.getParameter("action");

		if ("agregarPlato".equals(action)) {
			AgregarItemComandaDTO item = new AgregarItemComandaDTO(Integer.parseInt(idPlato),
					Integer.parseInt(idComanda));
			try {
				BussinessDelegate.getInstancia().agregarItemAComanda(item);
			} catch (BusinessException e) {
				resp.getWriter().println("<h1>ERROR</h1>");
			}
			req.setAttribute("idMozo", idMozo);
			req.getRequestDispatcher("jsp/Comanda(abrir,cerrar,add).jsp").forward(req, resp);
		} else if ("crear".equals(action)) {
			String nom = req.getParameter("NombrePlato");
			String precio = req.getParameter("Precio");
			String com = req.getParameter("comision");
			String area = req.getParameter("area");
			String receta = req.getParameter("receta");
			String[] productos = req.getParameterValues("p");
			List<Integer> ingredientes = new ArrayList<>();
			for (String string : productos) {
				if (string != null && !string.isEmpty()) {
					ingredientes.add(Integer.parseInt(string));
				}
			}

			try {
				BussinessDelegate.getInstancia().crearPlato(Integer.parseInt(area), receta, ingredientes, nom,
						Float.parseFloat(precio), Float.parseFloat(com));
			} catch (NumberFormatException | BusinessException e) {
				e.printStackTrace();
			}
			req.getRequestDispatcher("jsp/inicioAdministrador.jsp").forward(req, resp);
		}
	}

	public String obtenerPlatoporId(int idPlato) throws BusinessException {

		ObtenerPlatoDto plato = BussinessDelegate.getInstancia().obtenerPlatoporId(idPlato);
		String Json = new Gson().toJson(plato);
		return Json;

	}

	public String platosDelMenu() throws BusinessException {

		List<PlatoMenuDTO> plato = BussinessDelegate.getInstancia().platosDelMenu();
		String Json = new Gson().toJson(plato);
		return Json;

	}

}
