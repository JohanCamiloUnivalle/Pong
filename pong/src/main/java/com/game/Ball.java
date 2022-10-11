package com.game;

import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;

public class Ball {
    private int x;
    private int y;
    private int Ancho;
    private int Altura;
    private int dx=1 ,dy = 1;

    public Ball(int x,int y,int AnchoPelota, int AlturaPelota){
        this.x = x;
        this.y = y;
        this.Ancho = AnchoPelota;
        this.Altura = AlturaPelota;

    };

    public Rectangle2D getBall(){
        return new Rectangle2D.Double(x,y,Ancho,Altura);
    }

    public void mover(Rectangle limites,Rectangle2D r1, Rectangle2D r2){
        x+=dx;
        y+=dy;
        if(x>limites.getMaxX() || Colision(r1)){
            dx= -dx;
        }
        if(y>limites.getMaxY()){
            dy = -dy;
        }
        if(x < 0 || Colision(r2)){
            dx = -dx;
        }
        if(y < 0){
            dy = -dy;
        }
    } 

    public boolean Colision(Rectangle2D objeto){
       return getBall().intersects(objeto);
    }
}
