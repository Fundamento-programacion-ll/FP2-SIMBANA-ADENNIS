/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Paul
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Perro perrito = new Perro(0, "perro", "masculino", "tobi", 5);
       
       perrito.datosPerro();
       
       gato g=new gato("hola", 3);
       
       g.datosGato();
       
        
        
    }
    
}
