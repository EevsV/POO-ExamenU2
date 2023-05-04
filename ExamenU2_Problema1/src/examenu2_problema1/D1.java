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
public class D1 extends Movimiento {

    private double D;
    
    
    @Override
    public double CalcularDistancia() {
        D = (super.getVI() * super.getT()) + (super.getA() * Math.pow(super.getT(), 2)) / 2;
        return D;
    }

    
    public D1(double VF, double VI, double A, double T) {
        super(VF, VI, A, T);
    }
    
   
}
