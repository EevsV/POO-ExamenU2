/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Empleado;

/**
 *
 * @author invitado
 */
public class EmpleadoTiempoParcial extends Empleados {
    
    // Atributos
    private double pagoHora;
    private int horasTrabajadas;

    // Constructores
    public EmpleadoTiempoParcial() {
        super();
        this.pagoHora = 0.0;
        this.horasTrabajadas = 0;
    }

    public EmpleadoTiempoParcial(int horasTrabajadas, double pagoHora, String id, String nombre, double salario) {
        super(id, nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoHora = pagoHora;
        
        
    }
    
    // Get y Set 

    public double getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    

    // Implementacion del Metodo
    @Override
    public void calcularSalario() {
        double total = this.pagoHora * this.horasTrabajadas;
        super.setSalario(total);
    }
    
    
    
    
}
