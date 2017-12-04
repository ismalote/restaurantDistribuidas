package org.clienteWeb.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("jsp/login principal.jsp").forward(req, resp);
		
		}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		String user = req.getParameter("usuario");
		String pwd = req.getParameter("password");
	
		if ("administrador".equals(user) && "admin".equals(pwd)) {
		
		}
		else if ("mozo".equals(user) && "mozo".equals(pwd)) {
			
		}else if("barra".equals(user) && "barra".equals(pwd)) {
			
		}else if ("cocina".equals(user) && "cocina".equals(pwd)) {
			
		}else if ("cafeteria".equals(user) && "cafeteria".equals(pwd)) {
			
		}else {
			response(resp, "Login invalido");
		}
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
