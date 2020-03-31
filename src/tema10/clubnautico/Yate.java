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
public class Yate extends DeportivaAMotor {

    private int numeroCamarotes;

    public Yate(int numeroCamarotes, int CV, String matricula, int eslora, int añoFabricacion, Alquiler alquiler) {
        super(CV, matricula, eslora, añoFabricacion, alquiler);
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public long calcularAlquiler() {
        return super.calcularAlquiler() + (this.numeroCamarotes * 20); //To change body of generated methods, choose Tools | Templates.
    }

}
