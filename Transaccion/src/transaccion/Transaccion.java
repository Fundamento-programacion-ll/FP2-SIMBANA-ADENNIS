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
public class Transaccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        retiros r=new retiros(200, 2000);
        System.out.println("cuenta N'"+r.ObtenCuenta());
        
        System.out.println(r.ejecutar());
        depositos d=new depositos(255, r.ObtenCuenta());
        
        System.out.println(d.ejecutar());
        ssaldo ss=new ssaldo(1000, r.ObtenCuenta());
        System.out.println(ss.ejecutar());
       
       
    }
    
}
