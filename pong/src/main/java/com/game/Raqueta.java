package com.game;

import java.awt.geom.Rectangle2D;



public class Raqueta {
    private int x, y, ancho, altura;

    Raqueta(int x, int y, int ancho, int altura){
        this.x = x;
        this.y = y;
        this.altura = altura;
        this.ancho = ancho;
    }

    public Rectangle2D getRaqueta(){
        return new Rectangle2D.Double(x,y,ancho,altura);
    }

    public void mover(int arriba, int abajo){
        if(arriba==EventosKey.id){
            y--;
        }
        if(abajo==EventosKey.id){
            y++;
        }
    }


}
