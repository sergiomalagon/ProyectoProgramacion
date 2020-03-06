/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.cliente;

import java.util.Objects;

/**
 *
 * @author Vespertino
 */
public class Cliente implements Comparable<Cliente>{

    private String dni;
    private String nombre;
    private int edad;
    private float saldo;

    public Cliente(String dni, String nombre, int edad, float saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.saldo = saldo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", saldo=" + saldo + '}';
    }
    
    
    /*

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
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
        final Cliente other = (Cliente) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Cliente o) {
        int aux;
        return aux = this.getDni().compareTo(o.getDni());

    }
     */

    @Override
    public int compareTo(Cliente o) {
        int aux;
        return aux = this.getDni().compareTo(o.getDni());
    }
    


}
