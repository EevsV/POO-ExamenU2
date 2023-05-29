/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Superclases;

/**
 *
 * @author Fabian
 */
public class Fisica {

    public static double velocidad(double velocidad, double tiempo, double aceleracion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private double v;//Velocidad
    private double t;//tiempo
    private double d;// distancia4
    private double vI;//velocidad inicial
    private double vF;//velocidad final 

    public Fisica(double v, double t, double d, double vI, double vF) {
        this.v = v;
        this.t = t;
        this.d = d;
        this.vI = vI;
        this.vF = vF;
    }
    
    
   // Método para calcular la velocidad
    public double velocidad(double distancia, double tiempo) {
        return distancia / tiempo;
    }
    
    // Método para calcular la aceleración
    public double aceleracion(double velocidadInicial, double velocidadFinal, double tiempo) {
        return (velocidadFinal - velocidadInicial) / tiempo;
    }
    
    // Método para convertir metros a kilómetros
    public double metrosAKilometros(double metros) {
        return metros / 1000.0;
    }
    
    // Método para convertir kilómetros a metros
    public double kilometrosAMetros(double kilometros) {
        return kilometros * 1000.0;
    }
    
    
}
