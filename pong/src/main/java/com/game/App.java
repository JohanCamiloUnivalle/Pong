package com.game;

import javax.swing.JFrame;

public class App 
{
    public static void main( String[] args )
    {
        Ventana ventana = new Ventana();
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
