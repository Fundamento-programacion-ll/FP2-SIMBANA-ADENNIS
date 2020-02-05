/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

import java.awt.Color;
import java.awt.Graphics;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Paul
 */
public class punto extends figura {

    private int x;
    private int y;

    public punto() {

        super();
        String option = JOptionPane.showInputDialog(null, "Ingrese los datos separados por coma: ");

        StringTokenizer tokkens = new StringTokenizer(option, ",");
        this.x = Integer.parseInt(tokkens.nextToken());
        this.y = Integer.parseInt(tokkens.nextToken());

    }

    public punto(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;

    }

    @Override
    public String toString() {
      return "puntos:[ x="+this.x+",y="+this.y+"]";  
    }

    @Override
    public void dibujo(Graphics g) {
        
        
        g.setColor(Color.red);
        g.fillOval(this.x, this.y, 20, 20);
    }

}
