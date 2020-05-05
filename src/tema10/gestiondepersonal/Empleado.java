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
public abstract class Empleado {

    static final float SALARIO_MINIMO = 900;
    private String nif, nombre;
    private int edad;

    public Empleado(String nif, String nombre, int edad) {
        this.nif = nif;
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract float calculaSueldo();

    @Override
    public String toString() {
        return "Empleado{" + "nif=" + nif + ", nombre=" + nombre + ", edad=" + edad + '}';
    }

}
