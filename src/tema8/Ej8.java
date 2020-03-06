/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

import java.util.*;

/**
 *
 * @author Vespertino
 */
/*
Haciendo uso de la clase Mapa crea un juego que permita al usuario dado una palabra en un
idioma indicar la misma palabra en idiomas diferentes (3 para el ejemplo):
- El programa debe tener al menos 24 palabras con su traducción pertinente.
- Al usuario se le mostrarán preguntas del tipo: ¿Cómo se dice en inglés volar?.(random el idioma)(random la palabra)
- Los idiomas a tratar serán: Castellano, Inglés, y otro dos más a elegir por el alumno. (la palabra en españo sera la key y el value es un array con las traducciones)
- El test constará de 8 preguntas y por cada contestación se le mostrará el marcado que
lleva. Por ejemplo: Acertadas 3/6
 */
public class Ej8 {

    public static int idiomaAleatorio() {
        int idioma;
        Random aleatorio = new Random();
        idioma = aleatorio.nextInt(3) + 1;
        return idioma;
    }

    public static int palabraAleatorio() {
        int palabra;
        Random aleatorio = new Random();
        palabra = aleatorio.nextInt(10) + 1;
        return palabra;
    }

    public static String idiomaSeleccionado() {
        int idioma;
        String idiomaAux = "";
        idioma = idiomaAleatorio();
        if (idioma == 1) {
            idiomaAux = "ingles";
        }
        if (idioma == 2) {
            idiomaAux = "italiano";
        }
        if (idioma == 3) {
            idiomaAux = "portugues";
        }
        return idiomaAux;
    }

    public static String[] traducciones() {
        int palabra;
        palabra = palabraAleatorio();
        HashMap<Integer, String[]> juego = new HashMap();
        String[] datos = null;
        if (palabra == 1) {
            String[] cocheArray = new String[4];
            cocheArray[0] = "coche";
            cocheArray[1] = "car";
            cocheArray[2] = "auto";
            cocheArray[3] = "carro";
            juego.put(1, cocheArray);
            datos = juego.get(1);
            return datos;

        } else if (palabra == 2) {
            String[] casaArray = new String[4];
            casaArray[0] = "casa";
            casaArray[1] = "house";
            casaArray[2] = "casa";
            casaArray[3] = "casa";
            juego.put(2, casaArray);
            datos = juego.get(2);
            return datos;
        } else if (palabra == 3) {
            String[] caballoArray = new String[4];
            caballoArray[0] = "caballo";
            caballoArray[1] = "horse";
            caballoArray[2] = "cavallo";
            caballoArray[3] = "cavalo";
            juego.put(3, caballoArray);
            datos = juego.get(3);
            return datos;
        } else if (palabra == 4) {
            String[] telefonoArray = new String[4];
            telefonoArray[0] = "telefono";
            telefonoArray[1] = "phone";
            telefonoArray[2] = "telefono";
            telefonoArray[3] = "telefone";
            juego.put(4, telefonoArray);
            datos = juego.get(4);
            return datos;
        } else if (palabra == 5) {
            String[] humanoArray = new String[4];
            humanoArray[0] = "humano";
            humanoArray[1] = "human";
            humanoArray[2] = "umano";
            humanoArray[3] = "humano";
            juego.put(5, humanoArray);
            datos = juego.get(5);
        } else if (palabra == 6) {
            String[] dragonArray = new String[4];
            dragonArray[0] = "dragon";
            dragonArray[1] = "dragon";
            dragonArray[2] = "drago";
            dragonArray[3] = "dragão";
            juego.put(6, dragonArray);
            datos = juego.get(6);
        } else if (palabra == 7) {
            String[] esternocleidomastoideoArray = new String[4];
            esternocleidomastoideoArray[0] = "esternocleidomastoideo";
            esternocleidomastoideoArray[1] = "sternocleidomastoid";
            esternocleidomastoideoArray[2] = "esternocleidomastoideo";
            esternocleidomastoideoArray[3] = "esternocleidomastóideo";
            juego.put(7, esternocleidomastoideoArray);
            datos = juego.get(7);
        } else if (palabra == 8) {
            String[] paraguasArray = new String[4];
            paraguasArray[0] = "paraguas";
            paraguasArray[1] = "umbrella";
            paraguasArray[2] = "ombrello";
            paraguasArray[3] = "guarda-chuva";
            juego.put(8, paraguasArray);
            datos = juego.get(8);
        } else if (palabra == 9) {
            String[] zapatoArray = new String[4];
            zapatoArray[0] = "zapato";
            zapatoArray[1] = "shoe";
            zapatoArray[2] = "scarpa";
            zapatoArray[3] = "sapato";
            juego.put(9, zapatoArray);
            datos = juego.get(9);
        } else if (palabra == 10) {
            String[] gafasArray = new String[4];
            gafasArray[0] = "gafas";
            gafasArray[1] = "glasses";
            gafasArray[2] = "occhiali";
            gafasArray[3] = "óculos";
            juego.put(10, gafasArray);
            datos = juego.get(10);
        }
        return datos;

    }

    public static int comprobarTraduccion(String idioma) {
        int aux;
        if (idioma.equals("ingles")) {
            aux = 1;
        } else if (idioma.contains("italiano")) {
            aux = 2;
        } else {
            aux = 3;
        }
        return aux;
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int comprobar, aciertos = 0, fallos = 8, preguntas = 0;
        String idioma, respuesta;
        String[] palabra;

        do {
            idioma = idiomaSeleccionado();
            palabra = traducciones();
            System.out.println("Como se dice en " + idioma + " " + palabra[0]);

            System.out.print("Respuesta: ");
            respuesta = t.nextLine();

            comprobar = comprobarTraduccion(idioma);

            if (respuesta.equals(palabra[comprobar])) {
                System.out.println("correcto");
                aciertos++;
            } else {
                System.out.println("error");
                fallos--;
            }

            System.out.println("Acertadas " + aciertos + "/" + fallos);

            preguntas++;
        } while (preguntas != 8);
    }
}
