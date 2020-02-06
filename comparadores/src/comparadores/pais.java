/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadores;

import java.util.ArrayList;

/**
 *
 * @author Paul
 */
public class pais {
    
    private ArrayList<provincias> ListaProvincias;

    public pais() {
    }
    
    

    public pais(ArrayList<provincias> ListaProvincias) {
        this.ListaProvincias = ListaProvincias;
    }

    public ArrayList<provincias> getListaProvincias() {
        return ListaProvincias;
    }

    public void setListaProvincias(ArrayList<provincias> ListaProvincias) {
        this.ListaProvincias = ListaProvincias;
    }
    
    public void agregar(provincias provincias){
        this.ListaProvincias.add(provincias);
        
        
        
    }
    
    
}
