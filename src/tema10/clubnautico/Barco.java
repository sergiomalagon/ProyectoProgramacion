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
public class Barco {

    static final int VALORFIJO = 2;

    private String matricula;
    private int eslora;
    private int añoFabricacion;
    private Alquiler alquiler;

    public Barco(String matricula, int eslora, int añoFabricacion, Alquiler alquiler) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFabricacion = añoFabricacion;
        this.alquiler = alquiler;
    }

    public long calcularAlquiler() {
        long aux = this.alquiler.getFechaFinal().getTimeInMillis() - this.alquiler.getFechaInicial().getTimeInMillis();
        long diasOcupacion = aux / (1000 * 60 * 60 * 24);
        int moduloFuncion = 10 * this.eslora;
        return diasOcupacion * moduloFuncion * VALORFIJO;
    }

}
