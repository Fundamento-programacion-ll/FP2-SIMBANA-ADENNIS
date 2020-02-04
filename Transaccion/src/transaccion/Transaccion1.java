/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaccion;

/**
 *
 * @author Paul
 */
public abstract class Transaccion1 {
    
private int cuenta;

    public Transaccion1(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
    
    public int ObtenCuenta(){
    return cuenta;
    }
    
    public abstract String ejecutar();
    
}
    

