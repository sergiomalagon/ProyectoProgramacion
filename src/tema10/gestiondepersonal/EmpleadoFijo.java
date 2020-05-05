/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.gestiondepersonal;

import java.util.GregorianCalendar;

/**
 *
 * @author Sergio
 */
public class EmpleadoFijo extends Empleado {

    private float complemento;
    private int añoAlta;

    public EmpleadoFijo(float complemento, int añoAlta, String nif, String nombre, int edad) {
        super(nif, nombre, edad);
        if (complemento == 0) {
            this.complemento = 50;
        } else {
            this.complemento = complemento;
        }
        this.añoAlta = añoAlta;
    }

    private int antiguedad() {
        GregorianCalendar gc = new GregorianCalendar();
        int aux = gc.get(GregorianCalendar.YEAR);
        return aux - this.añoAlta;
    }

    @Override
    public float calculaSueldo() {
        return SALARIO_MINIMO + (complemento * antiguedad());
    }

}
