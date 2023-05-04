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
public class EmpleadoTiempoCompleto extends Empleados {

    
    // Constructores
    public EmpleadoTiempoCompleto() {
        super();
    }

    public EmpleadoTiempoCompleto(String id, String nombre, double salario) {
        super(id, nombre, salario);
    }
    

    // Implementacion del metodo de Empleados
    @Override
    public void calcularSalario() {
     super.setSalario(super.getSalario());
    }
    
}
