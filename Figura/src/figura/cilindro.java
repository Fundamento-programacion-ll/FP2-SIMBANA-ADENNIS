/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author Paul
 */
public class cilindro extends circulo {
    
    int altura;
    
    
    public cilindro(int radio) {
        super(radio);
        
     
        
        
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public cilindro(int altura, int radio) {
        super(radio);
        this.altura = altura;
    }

    public cilindro(int altura, int radio, int x, int y) {
        super(radio, x, y);
        this.altura = altura;
    }
    
}
