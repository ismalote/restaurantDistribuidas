package org.clienteWeb.servlets;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.repositorio.bussinessDelegate.BussinessDelegate;
import org.repositorio.dtos.AbrirMesaDTO;
import org.repositorio.dtos.AgregarItemComandaDTO;
import org.repositorio.dtos.ComandaDTO;
import org.repositorio.dtos.CrearComandaDTO;
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
			String numMesa = req.getParameter("num_mesa");
			String cantComensales = req.getParameter("cant_comensales");
			String[] m = numMesa.split(";");
			Set<Integer> nrosMesas = new HashSet<Integer>();
			for (String string : m) {
				if (string != null) {
					string = string.trim();
					if (!string.isEmpty()) {
						try {
							nrosMesas.add(Integer.parseInt(string));
						} catch (NumberFormatException e) {
						}
					}
				}
			}

			ArrayList<Integer> mesas = new ArrayList<Integer>();
			mesas.addAll(nrosMesas);
			AbrirMesaDTO mesa = new AbrirMesaDTO();
			mesa.setCantComensales(Integer.parseInt(cantComensales));
			mesa.setNumerodeMesa(mesas);

			String error = "";

			MesaDTO abrirMesa = null;
			try {
				abrirMesa = BussinessDelegate.getInstancia().AbrirMesa(mesa);

				if (abrirMesa != null) {
					CrearComandaDTO dto = new CrearComandaDTO(Integer.parseInt(idMozo), abrirMesa.getIdMesa(),
							Integer.parseInt(cantComensales), 0);
					try {
						BussinessDelegate.getInstancia().crearComanda(dto);
					} catch (BusinessException e) {
						error = e.getCause().getMessage();
						req.setAttribute("error", error.replaceAll("\n\t", ""));
					}
				} else {
					req.setAttribute("error", "Error al Abrir esa mesa");
				}

			} catch (BusinessException e1) {
				e1.printStackTrace();
				error = e1.getCause().getMessage();
				req.setAttribute("error", error.replaceAll("\n\t", ""));
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
		} catch (RemoteException e) {
			if (e.getCause().getClass().equals(MesaNotFoundException.class)) {
				req.setAttribute("mesas", new ArrayList<MesaDTO>());
			}
		}
	}

}
