package org.clienteWeb.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.repositorio.bussinessDelegate.BussinessDelegate;
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
		try {
			resp.getWriter().append(obtenerPlatoporId(0));
			resp.getWriter().flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
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
