package org.clienteWeb.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.repositorio.bussinessDelegate.BussinessDelegate;
import org.repositorio.dtos.MozoDTO;

public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("jsp/login principal.jsp").forward(req, resp);

	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		String user = req.getParameter("usuario");
		String pwd = req.getParameter("password");

		if ("administrador".equals(user) && "admin".equals(pwd)) {
			req.getRequestDispatcher("jsp/inicioAdministrador.jsp").forward(req, resp);	
		} else if ("mozo".equals(user) && "mozo".equals(pwd)) {
			setMozoData(req, BussinessDelegate.getInstancia().getDatosMozo(0));
			req.getRequestDispatcher("jsp/inicioMozo.jsp").forward(req, resp);
		} else if ("barra".equals(user) && "barra".equals(pwd)) {
			req.getRequestDispatcher("jsp/inicioBarra.jsp").forward(req, resp);
		} else if ("cocina".equals(user) && "cocina".equals(pwd)) {
			req.getRequestDispatcher("jsp/inicioCocina.jsp").forward(req, resp);
		} else if ("cafeteria".equals(user) && "cafeteria".equals(pwd)) {
			req.getRequestDispatcher("jsp/inicioCafeteria.jsp").forward(req, resp);
		} else {
			response(resp, "Login invalido");
		}
	}

	private void setMozoData(HttpServletRequest req, MozoDTO mozo) {
		req.setAttribute("mozo", mozo);
	}

	private void response(HttpServletResponse resp, String msg) throws IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<t1>" + msg + "</t1>");
		out.println("</body>");
		out.println("</html>");

	}

}
