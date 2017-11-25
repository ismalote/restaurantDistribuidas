package org.clienteSwing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import org.clienteSwing.controller.ControladorCliente;

public class MainSwing implements Serializable {

    private static final long serialVersionUID = 1L;

    private JFrame frame;

	public static void main(String[] args) {
//		ControladorCliente.INSTANCE.reservarMesa(4, "Para cacho", new Date());
		List<Integer> mesas = new ArrayList<Integer>();
		mesas.add(0);
		ControladorCliente.INSTANCE.abrirMesaNueva(mesas);
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
