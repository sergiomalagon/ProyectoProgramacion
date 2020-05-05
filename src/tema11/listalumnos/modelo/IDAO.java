/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema11.listalumnos.modelo;

/**
 *
 * @author David
 */
public interface IDAO {
    public Alumno primero();
    public Alumno ultimo();
    public Alumno siguiente();
    public Alumno anterior();
    public void añadir(Alumno al);
    public void quitar(Alumno al);
}
