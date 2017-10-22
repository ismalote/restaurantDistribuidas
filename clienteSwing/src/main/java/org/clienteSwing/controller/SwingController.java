package org.clienteSwing.controller;

import java.util.ResourceBundle;

import org.repositorio.bussinessDelegate.BussinessDelegate;

public class SwingController {

    private static SwingController instancia;
    private BussinessDelegate servidor = null;
    private ResourceBundle bundle;

    private SwingController() {
        inicializacion();
        cargarProperties();
    }

    private void cargarProperties() {
        bundle = ResourceBundle.getBundle("mensajes");
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

    public ResourceBundle getBundle() {
        return bundle;
    }

    public static SwingController getInstancia() {
        if (instancia == null) {
            instancia = new SwingController();
        }
        return instancia;
    }
}
