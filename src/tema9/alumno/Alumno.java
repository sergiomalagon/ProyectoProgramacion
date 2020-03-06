/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.alumno;

import java.util.Objects;
import tema9.cuentacorriente.CuentaCorriente;
import tema9.nif.NIF;

/**
 *
 * @author Vespertino
 */
public class Alumno implements Comparable<Alumno>{

    private int numeroExpediente, edad;
    private String nombre, apellido, genero;
    private CuentaCorriente cuenta;
    private NIF nif;

    public Alumno() {
        this(0, 0, "Sin nombre", "Sin apellido", new CuentaCorriente(0), new NIF(0), "No tiene");
    }

    public Alumno(int numeroExpediente, NIF nif, CuentaCorriente cuenta) {
        this.numeroExpediente = numeroExpediente;
        this.nif = nif;
        this.cuenta = cuenta;
    }

    public Alumno(int numeroExpediente, int edad, String nombre, String apellido, CuentaCorriente cuenta, NIF nif, String genero) {
        this.numeroExpediente = numeroExpediente;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = cuenta;
        this.nif = nif;
        this.genero = genero;
    }

    public int getNumeroExpediente() {
        return numeroExpediente;
    }

    public void setNumeroExpediente(int numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public CuentaCorriente getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaCorriente cuenta) {
        this.cuenta = cuenta;
    }

    public NIF getNif() {
        return nif;
    }

    public void setNif(NIF nif) {
        this.nif = nif;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.numeroExpediente != other.numeroExpediente) {
            return false;
        }
        if (!Objects.equals(this.nif, other.nif)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Alumno[" + "numeroExpediente=" + numeroExpediente + ", nombre=" + nombre + ", apellido=" + apellido + ", cuenta=" + cuenta + ", nif=" + nif + ']';
    }

    @Override
    public int compareTo(Alumno o) {
        return this.getNombre().compareTo(o.getNombre());
    }
    

}
