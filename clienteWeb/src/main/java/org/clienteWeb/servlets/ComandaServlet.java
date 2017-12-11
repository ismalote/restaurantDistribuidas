package org.clienteWeb.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.repositorio.bussinessDelegate.BussinessDelegate;
import org.repositorio.dtos.AgregarItemComandaDTO;
import org.repositorio.dtos.ComandaDTO;
import org.repositorio.dtos.CrearComandaDTO;
import org.repositorio.dtos.ItemComandaDTO;
import org.repositorio.dtos.MesaDTO;
import org.repositorio.exceptions.BusinessException;
import org.repositorio.exceptions.ComandaNotFoundException;
import org.repositorio.exceptions.MesaNotFoundException;

import com.google.gson.Gson;

public class ComandaServlet extends HttpServlet {
	public static final String JSP = "jsp/Comanda(abrir,cerrar,add).jsp";
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
		} else if ("cerrar".equals(action)) {
			String idComanda = req.getParameter("idComanda");
			

			try {
				BussinessDelegate.getInstancia().cerrarcomanda(Integer.valueOf(idComanda));
				req.setAttribute("comanda", idComanda);
				req.setAttribute("idMozo", idMozo);
				List<ItemComandaDTO> platos = BussinessDelegate.getInstancia().listarItemComanda(Integer.valueOf(idComanda));
				req.setAttribute("platos", platos);
				req.getRequestDispatcher("jsp/factura.jsp").forward(req, resp);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (BusinessException e) {
				e.printStackTrace();
			}

			obtenerMesasLibres(req, resp);
			req.setAttribute("idMozo", idMozo);
			req.getRequestDispatcher(JSP).forward(req, resp);
		} else {
			obtenerMesasLibres(req, resp);
			req.setAttribute("idMozo", idMozo);
			req.getRequestDispatcher(JSP).forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String idMozo = req.getParameter("idMozo");
		String numMesa = req.getParameter("num_mesa");
		String cantComensales = req.getParameter("cant_comensales");

		String action = req.getParameter("action");

		if ("agregarPlato".equals(action)) {
			String idComanda = req.getParameter("idComanda");
			String idPlato = req.getParameter("idPlato");

			AgregarItemComandaDTO item = new AgregarItemComandaDTO(Integer.parseInt(idPlato),
					Integer.parseInt(idComanda));
			try {
				BussinessDelegate.getInstancia().agregarItemAComanda(item);
			} catch (ComandaNotFoundException e) {
				resp.getWriter().println("<h1>" + e.getMessage() + "</h1>");
			}
			
			obtenerMesasLibres(req, resp);
			req.setAttribute("idMozo", idMozo);
			req.getRequestDispatcher(ComandaServlet.JSP).forward(req, resp);
		} else {
			CrearComandaDTO dto = new CrearComandaDTO(Integer.parseInt(idMozo), Integer.parseInt(numMesa),
					Integer.parseInt(cantComensales), 0);
			try {
				BussinessDelegate.getInstancia().crearComanda(dto);
			} catch (BusinessException e) {
				e.printStackTrace();
			}
			
			obtenerMesasLibres(req, resp);
			req.setAttribute("idMozo", idMozo);
			req.getRequestDispatcher(JSP).forward(req, resp);
		}

	}

	public static void obtenerMesasLibres(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		try {
			List<MesaDTO> mesasLibres = BussinessDelegate.getInstancia().listarMesasLibres();
			req.setAttribute("mesas", mesasLibres);
		} catch (MesaNotFoundException e) {
			resp.getWriter().println("<h1>" + e.getMessage() + "</h1>");
		}
	}

}
