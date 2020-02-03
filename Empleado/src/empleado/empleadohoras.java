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
public class empleadohoras extends Empleado {
    
    
    double sueldo;
    double horas;

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setHoras(double horas) {
        this.horas =(horas > 0 && horas <= 168)? horas : 0;
        
        
        
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

    public double getSueldo() {
        return sueldo;
    }

    public double getHoras() {
        return horas;
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

    public empleadohoras(double sueldo, double horas) {
        this.sueldo = sueldo;
        this.horas = horas;
    }

    public empleadohoras(double sueldo, double horas, String nombre, String apellido, int cedula) {
        super(nombre, apellido, cedula);
        this.sueldo = sueldo;
        this.horas = horas;
    }
    
    

    

    @Override
    public double Calcular_Ingresos() {
        
        if (sueldo < 0 ){this.sueldo=0;} 
        
        if (horas< 0 || horas > 168){this.horas=0;}
        return (this.horas * this.sueldo);
            
        
            
        
        
        
    }

    @Override
    public String toString() {
        return "empleadohoras{" + "sueldo=" + sueldo + ", horas=" + horas + '}';
    }
    
    
    
}
