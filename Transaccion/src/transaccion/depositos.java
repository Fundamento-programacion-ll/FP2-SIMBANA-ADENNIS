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
public class depositos extends Transaccion1{
    
    
    double depositos;
    
    public depositos(int cuenta){
    super (cuenta);}
    
    

    public depositos(double depositos, int cuenta) {
        super(cuenta);
        this.depositos = depositos;
    }

    public double getDepositos() {
        return depositos;
    }

    public void setDepositos(double depositos) {
        this.depositos = depositos;
    }

    @Override
    public String ejecutar() {
        return "depositos: "+depositos;
        
    }
    
    
}
    
