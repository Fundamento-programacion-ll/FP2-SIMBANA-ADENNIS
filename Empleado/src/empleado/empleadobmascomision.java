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
public class empleadobmascomision extends empleado_comision {
    
    double salariobase;

    public double getSalariobase() {
        return salariobase;
    }

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

    public void setSalariobase(double salariobase) {
        this.salariobase = salariobase;
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
    
    public double ingresos (){
        
        return salariobase * super.Calcular_Ingresos();
        
    }
    
   

    
    public empleadobmascomision(double salariobase, double vetasBrutas, double comision) {
        super(vetasBrutas, comision);
        this.salariobase = salariobase;
    }

    public empleadobmascomision(double salariobase, double vetasBrutas, double comision, String nombre, String apellido, int cedula) {
        super(vetasBrutas, comision, nombre, apellido, cedula);
        this.salariobase = salariobase;
    }

   

    
    
    
    
    
    
    
}
