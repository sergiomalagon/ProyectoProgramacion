/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema11.listalumnos.modelo;

import java.util.Arrays;

/**
 *
 * @author David
 */
public class AlumnoDAO implements IDAO {

    private Alumno clase[];
    private int aux;
    private Alumno ulti;

    public AlumnoDAO() {
        clase = new Alumno[13];
        Alumno aitor = new Alumno(1, 19, "Aitor", "Leria");
        Alumno alvaro = new Alumno(2, 19, "Alvaro", "Carbajo");
        Alumno fran = new Alumno(3, 21, "Fran", "Acha");
        Alumno hugo = new Alumno(4, 19, "Hugo", "Rico");
        Alumno javier = new Alumno(5, 19, "Javier", "Marin");
        Alumno jose = new Alumno(6, 19, "Jose Javier", "Machin");
        Alumno sergioB = new Alumno(7, 19, "Sergio", "Barrio");
        Alumno sergioM = new Alumno(8, 20, "Sergio", "Malagon");
        Alumno unai = new Alumno(9, 19, "Unai", "Iraragorri");
        Alumno valentin = new Alumno(10, 19, "Valentin", "Castravete");
        Alumno aaron = new Alumno(11, 19, "Aaron", "Alvarez");
        Alumno iker = new Alumno(12, 19, "Iker", "Abadia");
        Alumno ruben = new Alumno(13, 22, "Ruben", "Martinez");
        clase[0] = aitor;
        clase[1] = alvaro;
        clase[2] = fran;
        clase[3] = hugo;
        clase[4] = javier;
        clase[5] = jose;
        clase[6] = sergioB;
        clase[7] = sergioM;
        clase[8] = unai;
        clase[9] = valentin;
        clase[10] = aaron;
        clase[11] = iker;
        clase[12] = ruben;
        ulti = clase[0];
    }

    @Override
    public Alumno primero() {
        ulti = clase[0];
        return clase[0];

    }

    @Override
    public Alumno ultimo() {
        ulti = clase[clase.length - 1];
        return clase[clase.length - 1];
    }

    @Override
    public Alumno siguiente() {
        if (Arrays.asList(clase).indexOf(ulti) == 12) {
            ulti = clase[clase.length - 1];
            return null;

        } else {
            ulti = clase[(Arrays.asList(clase).indexOf(ulti)) + 1];
            return ulti;
        }
    }

    @Override
    public Alumno anterior() {
        if (Arrays.asList(clase).indexOf(ulti) == 0) {
            ulti = clase[0];
            return null;
        } else {
            ulti = clase[(Arrays.asList(clase).indexOf(ulti)) - 1];
            return ulti;
        }

    }

    @Override
    public void añadir(Alumno al) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void quitar(Alumno al) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
