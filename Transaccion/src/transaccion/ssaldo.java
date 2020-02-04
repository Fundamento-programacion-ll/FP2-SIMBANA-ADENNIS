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
public class ssaldo extends Transaccion1{
    
    double saldo;
    
    public ssaldo(int cuenta){
        super(cuenta);
    }

    public ssaldo(double saldo, int cuenta) {
        super(cuenta);
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String ejecutar() {
        return "Saldo: "+saldo;
    }


}
