package org.clienteWeb;

import org.clienteWeb.servlets.ProductoServlet;

public class MainWeb {

	public static void main(String[] args) throws Exception {

		System.out.println(ProductoServlet.getInstancia().listarProductosParaPedir());
	}

}