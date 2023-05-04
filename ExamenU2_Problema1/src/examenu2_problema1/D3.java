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
public class D3 extends Movimiento {
    
    private double D;
    
    
    
    @Override
    public double CalcularDistancia() {
       D = (super.getVF() - super.getVI()) / (2 * super.getA());
     return D;   
    }
    
    
    public D3(double VF, double VI, double A, double T) {
        super(VF, VI, A, T);
    }
    
}
