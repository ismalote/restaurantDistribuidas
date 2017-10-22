package org.clienteWeb.controller;

import org.repositorio.bussinessDelegate.BussinessDelegate;

public class WebController {

	private static WebController instancia;
	private BussinessDelegate servidor = null;

	private WebController() {
		inicializacion();
	}

	private void inicializacion() {
		try {
			servidor = BussinessDelegate.getInstancia();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public BussinessDelegate getServidor() {
		return servidor;
	}

	public static WebController getInstancia() {
		if (instancia == null) {
			instancia = new WebController();
		}
		return instancia;
	}
}
