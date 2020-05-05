/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.gestiondepersonal;

/**
 *
 * @author Sergio
 */
public class EmpleadoHoras extends Empleado {

    private final float PRECIO_HORA = 3;
    private int horasTrabajadas;

    public EmpleadoHoras(int horasTrabajadas, String nif, String nombre, int edad) {
        super(nif, nombre, edad);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public float calculaSueldo() {
        return ((PRECIO_HORA * horasTrabajadas) + SALARIO_MINIMO);
    }

}
