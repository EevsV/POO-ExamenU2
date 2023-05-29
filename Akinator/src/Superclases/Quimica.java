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
public class Quimica {
    // Definir los atributos de la clase
  private double frecuencia; // La frecuencia de la luz en Hz
  private double longitudDeOnda; // La longitud de onda de la luz en m
  private double energia; // La energía del fotón en J
  private double funcionDeTrabajo; // La energía mínima para liberar un electrón del metal en J
  private double energiaCinetica; // La energía cinética del electrón liberado en J

  // Definir el constructor de la clase
  public Quimica(double frecuencia, double funcionDeTrabajo) {
    this.frecuencia = frecuencia;
    this.funcionDeTrabajo = funcionDeTrabajo;
    // Calcular la longitud de onda usando la relación c = lambda * nu
    this.longitudDeOnda = 3e8 / frecuencia; // c es la velocidad de la luz en m/s
    // Calcular la energía del fotón usando la relación E = h * nu
    this.energia = 6.626e-34 * frecuencia; // h es la constante de Planck en J*s
    // Calcular la energía cinética del electrón usando la relación E = KE + phi
    this.energiaCinetica = energia - funcionDeTrabajo;
  }

  // Definir los métodos de la clase

  // Un método para obtener la frecuencia
  public double getFrecuencia() {
    return frecuencia;
  }

  // Un método para obtener la longitud de onda
  public double getLongitudDeOnda() {
    return longitudDeOnda;
  }

  // Un método para obtener la energía del fotón
  public double getEnergia() {
    return energia;
  }

  // Un método para obtener la función de trabajo
  public double getFuncionDeTrabajo() {
    return funcionDeTrabajo;
  }

  // Un método para obtener la energía cinética del electrón
  public double getEnergiaCinetica() {
    return energiaCinetica;
  }

  // Un método para mostrar los resultados por pantalla
  public void mostrarResultados() {
    System.out.println("La frecuencia de la luz es " + frecuencia + " Hz");
    System.out.println("La longitud de onda de la luz es " + longitudDeOnda + " m");
    System.out.println("La energía del fotón es " + energia + " J");
    System.out.println("La función de trabajo del metal es " + funcionDeTrabajo + " J");
    System.out.println("La energía cinética del electrón liberado es " + energiaCinetica + " J");
  }
    
    
    
    
    
    
    
    
}
