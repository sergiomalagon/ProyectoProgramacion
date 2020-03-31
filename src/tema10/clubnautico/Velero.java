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
public class Velero extends Barco {
    private int mastiles;

    public Velero(int mastiles, String matricula, int eslora, int añoFabricacion, Alquiler alquiler) {
        super(matricula, eslora, añoFabricacion, alquiler);
        this.mastiles = mastiles;
    }

    @Override
    public long calcularAlquiler() {
        return super.calcularAlquiler()+(this.mastiles*5); //To change body of generated methods, choose Tools | Templates.
    }
    
 
    
}
