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
public class gato {
    
   private String colorOjos;
   private float estatura;

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public float getEstatura() {
        return estatura;
    }

    public gato() {
        
        System.out.println("color ojos: "+ getColorOjos()+"Estatura: "+getEstatura()+"Genero: "+getClass());
    }

    public gato(String colorOjos, float estatura) {
        this.colorOjos = colorOjos;
        this.estatura = estatura;
    }
   
   public void datosGato(){
       
       System.out.println("Nombre: "+getColorOjos()+" Estatura: "+getEstatura());
   }
    
}
