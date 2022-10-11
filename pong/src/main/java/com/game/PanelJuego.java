package com.game;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;



public class PanelJuego extends JPanel{
    private int AnchoPelota =20 , AlturaPelota = 20;
    private int alturaRaqueta = 80, anchoRaqueta = 20;
    private Color ColorFondo = new Color(0,0,0);
    private Color ColorBall = new Color(250,250,250);
    public int SpeedGame = 10;
    



    Raqueta r1 = new Raqueta(2,200-alturaRaqueta, anchoRaqueta, alturaRaqueta);
    Raqueta r2 = new Raqueta(780-anchoRaqueta, 200-alturaRaqueta, anchoRaqueta, alturaRaqueta);
    Ball pelota = new Ball(0,0,AnchoPelota,AlturaPelota);

    public PanelJuego(){
        setBackground(ColorFondo);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(ColorBall);
        draw(g2);
        refresh();
    }

    public void draw(Graphics2D g){
        g.fill(pelota.getBall());
        g.fill(r1.getRaqueta());
        g.fill(r2.getRaqueta());
    }

    public void refresh(){
        pelota.mover(getBounds());
        r1.mover(KeyEvent.VK_W,KeyEvent.VK_S);
        r2.mover(KeyEvent.VK_UP, KeyEvent.VK_DOWN);
    }

    
}
