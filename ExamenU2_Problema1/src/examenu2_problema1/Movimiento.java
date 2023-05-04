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
public abstract class Movimiento implements Captura  {
    
//ASIGNAR ATRIBUTOS PRIVADOS DE TIPO DOUBLE
    
    private double VF;
    private double VI;
    private double A;
    private double T;
    
    
//CONTRUCTOR DEFAULT
    
    public Movimiento() {
        
    }

//CONSTRUCTOR CON PARAMETROS
    
    public Movimiento(double VF, double VI, double A, double T) {
        this.VF = VF;
        this.VI = VI;
        this.A = A;
        this.T = T;
    }

//METODOS GET AND SET    
    
    @Override
    public double getVF() {
        return VF;
    }
    
    @Override
    public void setVF(double VF) {
        this.VF = VF;
    }

    @Override
    public double getVI() {
        return VI;
    }

    @Override
    public void setVI(double VI) {
        this.VI = VI;
    }

    @Override
    public double getA() {
        return A;
    }

    @Override
    public void setA(double A) {
        this.A = A;
    }

    @Override
    public double getT() {
        return T;
    }

    @Override
    public void setT(double T) {
        this.T = T;
    }
    
    //METODO ABSTRACTO CALCULAR DISTANCIA
    
    public abstract double CalcularDistancia();
        
}
