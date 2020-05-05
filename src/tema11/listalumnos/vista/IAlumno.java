/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema11.listalumnos.vista;

import tema11.listalumnos.controlador.CAlumno;
import tema11.listalumnos.modelo.Alumno;

/**
 *
 * @author Sergio
 */
public interface IAlumno {
    public abstract void setAlumno(Alumno al);
    public abstract void setControlador(CAlumno ca);
    public abstract void mostrar();
}
