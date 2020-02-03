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
public class empleadosalario extends Empleado {
    double salariosemanal;

    empleadosalario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setSalariosemanal(double salariosemanal) {
        this.salariosemanal = salariosemanal;
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

    public double getSalariosemanal() {
        return salariosemanal;
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

    public empleadosalario(double salariosemanal) {
        this.salariosemanal = salariosemanal;
    }

    public empleadosalario(double salariosemanal, String nombre, String apellido, int cedula) {
        super(nombre, apellido, cedula);
        this.salariosemanal = salariosemanal;
    }

   

    @Override
    public String toString() {
        return "empleadosalario{" + "salariosemanal=" + salariosemanal + '}';
    }

    @Override
    public double Calcular_Ingresos() {
        
        if (salariosemanal < 0 ) {this.salariosemanal = 0;}
        
        return (this.salariosemanal * 4);
            
        }
        
    }
    
    
    
    

