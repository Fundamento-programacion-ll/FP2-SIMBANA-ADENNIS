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
public class calculos_serie {
    
    public int calculo(int numero){
        
      int total=1;  
      
      serie se= new serie(numero);
      
        for (int i = 0; i < se.getNumero(); i++) {
            total=total*2;
            
        }
        return total;
        
    }
    
    
}
