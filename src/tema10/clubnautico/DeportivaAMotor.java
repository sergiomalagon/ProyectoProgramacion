/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.clubnautico;

/**
 *
 * @author Sergio
 */
public class DeportivaAMotor extends Barco{
    private int CV;

    public DeportivaAMotor(int CV, String matricula, int eslora, int añoFabricacion, Alquiler alquiler) {
        super(matricula, eslora, añoFabricacion, alquiler);
        this.CV = CV;
    }

    @Override
    public long calcularAlquiler() {
        return super.calcularAlquiler()+(this.CV*1); //To change body of generated methods, choose Tools | Templates.
    }
    
}
