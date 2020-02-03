/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

import com.sun.imageio.plugins.jpeg.JPEG;

/**
 *
 * @author Paul
 */
public class empleado_comision extends Empleado {
    
    
    double vetasBrutas;
    double comision;

    public double getVetasBrutas() {
        return vetasBrutas;
    }

    public double getComision() {
        return comision;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setVetasBrutas(double vetasBrutas) {
        this.vetasBrutas = vetasBrutas;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public empleado_comision(double vetasBrutas, double comision) {
        this.vetasBrutas = vetasBrutas;
        this.comision = comision;
    }

    public empleado_comision(double vetasBrutas, double comision, String nombre, String apellido, int cedula) {
        super(nombre, apellido, cedula);
        this.vetasBrutas = vetasBrutas;
        this.comision = comision;
    }

   
    
    @Override
    public double Calcular_Ingresos() {
        
        if(comision <=0){this.comision =0;}
        
        if (vetasBrutas <=0){this.vetasBrutas =0; }
        
        
            
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "empleado_comision{" + "vetasBrutas=" + vetasBrutas + ", comision=" + comision + '}';
    }
    
    
    
    
}
