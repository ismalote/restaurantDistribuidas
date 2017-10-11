package org.clienteSwing;

import java.awt.EventQueue;
import java.io.Serializable;

import javax.swing.JFrame;

public class MainSwing implements Serializable {

    private static final long serialVersionUID = 1L;

    private JFrame frame;

    public static void main(String[] args) {
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
    }
    
}
