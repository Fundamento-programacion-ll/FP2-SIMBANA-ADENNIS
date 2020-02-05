/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Paul
 */
public class circulo extends punto {
    
  private int radio;


    public circulo(int radio) {
        this.radio = radio;
    }
     public circulo(int radio, int x, int y) {
         
         super(x,y);
         this.radio= radio;
    }
  

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public void dibujo(Graphics g) {
        
        g.setColor(Color.BLUE);
        g.drawOval(super.getX(),super.getY(), this.radio, this.radio);
    }

    
    
   
    
    
    
}
