/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

/**
 *
 * @author Paul
 */
public class Empleado1 {
    
    
    public static void main(String[] args) {
        
        empleadosalario es=new empleadosalario(15.50, "Paul", "Simbana", 1718082488);
        
        System.out.println(es);
        
        empleado_comision ec= new empleado_comision(17, 0, "Paul", "Siimbana", 45);
        
        System.out.println(ec);
        
        empleadobmascomision emb =new empleadobmascomision(133, 0, 24, "paul", "Simbana", 0);
        
        empleadohoras eh=new empleadohoras(133, 0, "Paul", "Simbana", 3);
        
        System.out.println(eh);
        
        
    }
    
}
