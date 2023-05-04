/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_examen;

import Empleado.Administrador;
import Empleado.EmpleadoTiempoCompleto;
import Empleado.EmpleadoTiempoParcial;

/**
 *
 * @author invitado
 */
public class EVA2_EXAMEN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmpleadoTiempoCompleto emp1 = new EmpleadoTiempoCompleto("542152","Mr. Beast" , 1000.00);
        EmpleadoTiempoParcial emp2 = new EmpleadoTiempoParcial(5, 33.50, "5042134", "Mr. Bean", 0);
        Administrador admin = new Administrador(10, "508382", "John NetBeans", 100.00);
        
        emp1.calcularSalario();
        System.out.println("Empleado 1, Tiempo completo. "
                + "Nombre: " + emp1.getNombre() + ", ID: " +
                emp1.getId() + ", salario: " + emp1.getSalario());
        
        System.out.println("---");
        
        emp2.calcularSalario();
        
        System.out.println("Empleado 2, Tiempo Parcial"
                + "Nombre: " + emp2.getNombre() + ", ID: "
                        + emp2.getId() + ", Paga por Hora: " + emp2.getPagoHora() +
                ", Horas Trabajadas: " + emp2.getHorasTrabajadas() + ", Paga Total: " + emp2.getSalario());
        
        System.out.println("---");
        
        System.out.println("Administrador. "
                + "Nombre: " + admin.getNombre() +
                ", ID: " + admin.getId() + ", Salario: " + admin.getSalario()
        + ", Bono: " + admin.getPorcentajeBono());
        
        admin.calcularSalario();
        
        System.out.println("Salario con Bono: " + admin.getSalario());
 
        
        
        
        
    }
    
}
