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
public class D2 extends Movimiento{
    
    private double D;
    
    @Override
    public double CalcularDistancia() {
        D = (super.getVI() + super.getVF()) /2 * super.getT();
     return D;   
    }
    public D2(double VF, double VI, double A, double T) {
        super(VF, VI, A, T);
    }
}
