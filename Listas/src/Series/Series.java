/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Series;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Paul
 */
public class Series {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int num=0;
       
       Scanner scan = new Scanner(System.in);
       calculos_serie total=new calculos_serie();
       
       
       
        System.out.println("Ingrese un numero");
        num=scan.nextInt();
        
        serie se=new serie(num);
       
        System.out.println("2^"+num+"es igual a: "+total.calculo(num));
        
       
    }
    
}
