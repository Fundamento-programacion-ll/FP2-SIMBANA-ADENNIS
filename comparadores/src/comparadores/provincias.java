/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadores;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Paul
 */
public class provincias {
    private String nombreProvincia;
    private int numeroHabitantes;

    public provincias(String nombreProvincia, int numeroHabitantes) {
        this.nombreProvincia = nombreProvincia;
        this.numeroHabitantes = numeroHabitantes;
    }
    

    public void provincias() {
        
        String provincias=JOptionPane.showInputDialog(null,"Ingrese el nombre de la provincia y el nuemero de habitantes:");
        
        StringTokenizer tokkens= new StringTokenizer(provincias,",");
        
        nombreProvincia= tokkens.nextToken();
        numeroHabitantes= Integer.parseInt(tokkens.nextToken());
        
    }

    provincias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }
    
    
    
    
    
    
}
