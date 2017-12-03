package org.clienteSwing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import org.clienteSwing.controller.ControladorCliente;
import org.repositorio.exceptions.BusinessException;

public class MainSwing implements Serializable {

    private static final long serialVersionUID = 1L;

    private JFrame frame;

	public static void main(String[] args) throws BusinessException {
//		ControladorCliente.INSTANCE.reservarMesa(4, "Para cacho", new Date());
//		List<Integer> mesas = new ArrayList<Integer>();
//		mesas.add(0);
//		ControladorCliente.INSTANCE.abrirMesaNueva(mesas);
//		ControladorCliente.INSTANCE.crearComanda(0, 0, 4, 0);
		ControladorCliente.INSTANCE.agregarItemAComanda(1, 0, 2);
		ControladorCliente.INSTANCE.confirmarPedido(1);
    	/*
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    //test();

                    MainSwing window = new MainSwing();
                    window.frame.setVisible(true);
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        */
    }
    
}
