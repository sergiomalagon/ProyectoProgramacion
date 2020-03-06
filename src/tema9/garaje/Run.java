/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.garaje;

/**
 *
 * @author Vespertino
 */
public class Run {

    public static void main(String[] args) {
        Coche coche = new Coche("Audi", "A8");
        Coche coche2 = new Coche("Citroen", "Cactus");
        Taller taller = new Taller();
        taller.aceptarCoche(coche, "aire acondicionado");
        taller.devolverCoche(coche);
        taller.aceptarCoche(coche2, "aceite");
        taller.devolverCoche(coche2);

        System.out.println("" + coche.toString());
        System.out.println("" + coche2.toString());
    }
}
