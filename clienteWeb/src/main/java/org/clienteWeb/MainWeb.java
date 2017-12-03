package org.clienteWeb;

import org.clienteWeb.controller.ProductoServelet;

public class MainWeb {

	public static void main(String[] args) throws Exception {

		System.out.println(ProductoServelet.getInstancia().listarProductosParaPedir());
	}

}