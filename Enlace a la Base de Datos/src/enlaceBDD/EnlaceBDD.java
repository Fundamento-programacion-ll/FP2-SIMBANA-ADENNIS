/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enlaceBDD;

import conexion.conector;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paul
 */
public class EnlaceBDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PreparedStatement ps = null;
        
        conector conn=new conector();
        
        conn.getConexion();
        
        //insert
        
        String insert= 
                "insert into Persons (nombre, descripcion, precio) values (?,?,?) ";
        try {
ps = conn.getConexion()
                    .prepareStatement (insert);
            ps . setString ( 1 , " cuadro X " );
            ps . setString ( 2 , " Consola juegos " );
            ps . setDouble( 3 , 500.1 );
            ps . executeUpdate ();
        } catch (SQLException ex){
            
            
          //  Logger.getLogger(EnlaceBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
