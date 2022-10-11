package com.game;

import javax.swing.JFrame;

public class Ventana extends JFrame {
    private final int Ancho = 800, Alto = 400;

    private PanelJuego panel = new PanelJuego();
    private Hilo hilo;

    public Ventana(){
       
        setSize(Ancho,Alto);
        setLocationRelativeTo(null);
        setResizable(false);
        add(panel);
        addKeyListener(new EventosKey());
        hilo = new Hilo(panel);
        hilo.start();
    }
}
