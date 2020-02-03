/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dimensiones;

/**
 *
 * @author Paul
 */
public class Dimensiones {
    
    private  double cuadrado;
    private double triangulo;
    private double circulo;

    public void setCuadrado(double cuadrado) {
        this.cuadrado = cuadrado;
    }

    public void setTriangulo(double triangulo) {
        this.triangulo = triangulo;
    }

    public void setCirculo(double circulo) {
        this.circulo = circulo;
    }

    public double getCuadrado() {
        return cuadrado;
    }

    public double getTriangulo() {
        return triangulo;
    }

    public double getCirculo() {
        return circulo;
    }

    public Dimensiones() {
    }
    
    

    public Dimensiones(double cuadrado, double triangulo, double circulo) {
        this.cuadrado = cuadrado;
        this.triangulo = triangulo;
        this.circulo = circulo;
    }
   
    
    
    
    
    
    
}
