package org.clienteWeb.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.repositorio.bussinessDelegate.BussinessDelegate;
import org.repositorio.dtos.CrearComandaDTO;
import org.repositorio.dtos.ItemComandaDTO;
import org.repositorio.exceptions.BusinessException;

import com.google.gson.Gson;

public class AreaProduccionServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// req.getRequestDispatcher("jsp/VerPedidosParaRealizar.jsp").forward(req,
		// resp);
		// Integer idArea = Integer.valueOf(req.getParameter("idArea"));
		String action = req.getParameter("action");

		if ("pedidosCocina".equals(action)) {
			req.setAttribute("titulo", "COCINA");
			req.setAttribute("area", "cocina");

			// List<ItemComandaDTO> pedidos =
			// BussinessDelegate.getInstancia().obtenerPlatosAProducir(0);
			// for (ItemComandaDTO itemComandaDTO : pedidos) {
			// System.out.println(itemComandaDTO.getNombrePlato());
			// }
			// descomentar esto
			// resp.getWriter().println(new Gson().toJson(pedidos));
		} else if ("pedidosBarra".equals(action)) {
			req.setAttribute("titulo", "BARRA");
			req.setAttribute("area", "barra");
			// List<ItemComandaDTO> pedidos =
			// BussinessDelegate.getInstancia().obtenerPlatosAProducir(1); //ver si es 1
			// for (ItemComandaDTO itemComandaDTO : pedidos) {
			// System.out.println(itemComandaDTO.getNombrePlato());
			// }
			// descomentar esto
			// resp.getWriter().println(new Gson().toJson(pedidos));
		} else if ("pedidosCafeteria".equals(action)) {
			req.setAttribute("titulo", "CAFETERIA");
			req.setAttribute("area", "cafeteria");
			// List<ItemComandaDTO> pedidos =
			// BussinessDelegate.getInstancia().obtenerPlatosAProducir(2); //ver si es 2
			// for (ItemComandaDTO itemComandaDTO : pedidos) {
			// System.out.println(itemComandaDTO.getNombrePlato());
			// }
			// descomentar esto
			// resp.getWriter().println(new Gson().toJson(pedidos));
		} else {
		}
		req.getRequestDispatcher("jsp/verPedidosParaRealizar.jsp").forward(req, resp);
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
