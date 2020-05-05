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
public class EmpleadoTemporal extends Empleado {

    private GregorianCalendar fechaAlta, fechaBaja;

    public EmpleadoTemporal(GregorianCalendar fechaAlta, GregorianCalendar fechaBaja, String nif, String nombre, int edad) {
        super(nif, nombre, edad);
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
    }

    @Override
    public float calculaSueldo() {
        return SALARIO_MINIMO;
    }

}
