/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Paul
 */
public class Perro extends Animal {
    
    private float estatura;

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public Perro(float estatura) {
        this.estatura = estatura;
    }
    public void datosPerro(){
        System.out.println("nombre:"+getNombre()+"sexo:"+getGenero()+"especie :"+getEspecie());
            
            }       
            
    
    public Perro(float estatura, String especie, String genero, String nombre, int edad) {
        super(especie, genero, nombre, edad);
        this.estatura = estatura;
        
        
    }
    
    
}
