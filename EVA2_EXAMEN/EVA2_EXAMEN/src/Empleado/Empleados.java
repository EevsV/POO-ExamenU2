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
public abstract class Empleados {
    
    // Atributos de la clase empleado
    private String id;
    private String nombre;
    private double salario;

    
    // Constructores
    public Empleados() {
        this.id = "--";
        this.nombre = "--";
        this.salario = 0.0;
    }

    public Empleados(String id, String nombre, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    // Get y Set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    // Metodo abstracto
    public abstract void calcularSalario();
    
    
    
    
}
