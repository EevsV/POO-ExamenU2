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
public class Administrador extends EmpleadoTiempoCompleto 
implements ElegibleParaBono{
    private double porcentajeBono;

    // Constructores
    public Administrador() {
        super();
        this.porcentajeBono = 0.0;
    }

    public Administrador(double porcentajeBono, String id, String nombre, double salario) {
        super(id, nombre, salario);
        this.porcentajeBono = porcentajeBono;
    }
    
    // Get y Set
    public double getPorcentajeBono() {
        return porcentajeBono;
    }

    public void setPorcentajeBono(double porcentajeBono) {
        this.porcentajeBono = porcentajeBono;
    }

    @Override
    public void calcularSalario() {
        double salario = super.getSalario() + calcularBono();
        super.setSalario(salario);
            } 
   
    @Override
    public double calcularBono() {
        double bono = super.getSalario() * this.porcentajeBono;
        return bono;
    }
    
    
    
    
    
}
