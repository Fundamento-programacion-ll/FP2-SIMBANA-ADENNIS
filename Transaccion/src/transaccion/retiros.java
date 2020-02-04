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
public class retiros extends Transaccion1 {
    
       double retiro;
       
       public retiros(int cuenta){
           
           super(cuenta);
           
       }

    public retiros(double retiro, int cuenta) {
        super(cuenta);
        this.retiro = retiro;
    }

    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }

    @Override
    public String ejecutar() {
        return  "Retiro:"+ retiro;
    }
       
    
    
}
