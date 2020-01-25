/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Token;

import javax.swing.JOptionPane;

/**
 *
 * @author Paul
 */
public class Tokens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int dimension = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la distancia del arreglo"));
        
        Vector v = new Vector(dimension);
        
        v.esPrimo(dimension);
        
        System.out.println(v.listarPrimos());
        
        
    }
    
}
