/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema11.listalumnos.main;

import tema11.listalumnos.controlador.CAlumno;
import tema11.listalumnos.modelo.AlumnoDAO;
import tema11.listalumnos.vista.VAlumno;

/**
 *
 * @author Sergio
 */
public class Run {

    public static void main(String[] args) {
        AlumnoDAO modelo = new AlumnoDAO();
        VAlumno vista = new VAlumno();
        CAlumno ca = new CAlumno(vista, modelo);
        vista.setControlador(ca);
        vista.mostrar();
    }
}
