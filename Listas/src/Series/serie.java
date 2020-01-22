/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Series;

/**
 *
 * @author Paul
 */
public class serie {
    
    int numero;

    public serie(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "serie{" + "numero=" + numero + '}';
    }
            

    
    
}
