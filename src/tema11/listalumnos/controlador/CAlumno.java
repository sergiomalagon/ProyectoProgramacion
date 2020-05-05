/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema11.listalumnos.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tema11.listalumnos.modelo.Alumno;
import tema11.listalumnos.modelo.AlumnoDAO;
import tema11.listalumnos.vista.IAlumno;

/**
 *
 * @author Sergio
 */
public class CAlumno implements ActionListener {

    private IAlumno vista;
    private AlumnoDAO modelo;
    private Alumno alumAux;

    public CAlumno(IAlumno vista, AlumnoDAO modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "primero":
                vista.setAlumno(modelo.primero());
                break;
            case "anterior":
                alumAux = modelo.anterior();
                if (alumAux == null) {
                    System.out.println("Este es el principio de la lista");
                } else {
                    vista.setAlumno(alumAux);
                }
                break;
            case "siguiente":
                alumAux = modelo.siguiente();
                if (alumAux == null) {
                    System.out.println("Este es el final de la lista");
                } else {
                    vista.setAlumno(alumAux);
                }
                break;
            case "ultimo":
                vista.setAlumno(modelo.ultimo());
                break;
            default:
                break;
        }

    }
}
