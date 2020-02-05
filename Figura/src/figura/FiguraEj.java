/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

import java.awt.Graphics;
import java.util.StringTokenizer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Paul
 */
public class FiguraEj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
       
        punto pto =new punto(25,20);
        
        
        JFrame ventana = new JFrame();
        
        ventana.add(pto);
        
        ventana.setSize(700,400);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        
        
    }
    
    public static void Menu(){
        
        punto pto =new punto(25,20);
        circulo cir = new circulo(20, 20, 20);
        
        
        
        
    }
    
}
