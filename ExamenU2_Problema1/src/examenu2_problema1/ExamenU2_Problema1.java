/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenu2_problema1;

/**
 *
 * @author mario
 */
public class ExamenU2_Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //INTEGRANTES DEL EQUIPO
        System.out.println("Fabian Armando Bustillos Vitela 22550344");
        System.out.println("Sebastian Gardea Saucedo 22550363");
        System.out.println("Isaac Manuel Guzman Gonzales 22550331");
        System.out.println("Omar Alfonso Palomino Romero 22550333");
        System.out.println("Mario Sylva Iracheta 22550369");
        System.out.println("");
                             //VALOREZ DADOS EN ORDEN DEL CONSTRUCTOR CON ARGUMENTOS
                           //VF  VI  A   T                           
        D1 Formula1 = new D1(80, 20, 10, 30);
        System.out.println("La distancia fue de " + Formula1.CalcularDistancia());
        
        System.out.println("");
        
        D2 Formula2 = new D2(80, 20, 10, 30);
        System.out.println("La distancia fue de " + Formula2.CalcularDistancia());
        
        System.out.println("");
        
        D3 Formula3 = new D3(80, 20, 10, 30);
        System.out.println("La distancia fue de " + Formula3.CalcularDistancia());
        
    }
    
}
