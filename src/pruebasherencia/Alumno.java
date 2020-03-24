/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasherencia;

import java.util.Objects;

/**
 *
 * @author Sergio
 */
public class Alumno {

    private int codigo;
    private String nombre;
    private byte edad;

    public Alumno() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.codigo;
        hash = 53 * hash + Objects.hashCode(this.nombre);
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
        final Alumno other = (Alumno) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

   
}
