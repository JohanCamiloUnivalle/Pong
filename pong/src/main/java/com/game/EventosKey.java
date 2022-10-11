package com.game;

import java.awt.event.*;

public class EventosKey extends KeyAdapter{
    static int id; 
    @Override
    public void keyPressed(KeyEvent e) {
        id = e.getKeyCode();
        System.out.println(id);
    }
}
