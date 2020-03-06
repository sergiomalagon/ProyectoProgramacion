/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7;

import java.io.*;
import java.util.StringTokenizer;
import utilidades.Teclado;

/**
 *
 * @author Vespertino
 */
/*
Haciendo uso de la clase StringTokenizer y Buffereader lea el fichero que contiene el quijote e indique cuantas veces 
aparece una palabra determinada
public static int cuentaPalabras(String fichero, String palabra);
 */
public class Ej10_StringToken_BufferedReader {

    /**
     * @param fichero fichero que queremos leer
     * @param palabra palabra que queremos buscar en el fichero
     * @return devuelve el numero de veces que se ha encontrado esa palabra
     */
    public static int cuentaPalabras(String fichero, String palabra) {
        int contador = 0;
        StringBuilder aux = new StringBuilder();
        StringTokenizer tokens = new StringTokenizer(fichero, "\\.\\,\\-\\ \\!\\¡\\;\\?\\¿\\:\\*\"\\'\\)\\(\\$\\@\\|\\º\\ª\\´\\¨\\");
//mientras haya tokens el bucle continua
        while (tokens.hasMoreTokens()) {
//borro el stringbuilder para dejar espacio para el nuevo token
            aux.delete(0, aux.length());
//introduzco el token en el stringbuilder
            aux.append(tokens.nextToken());
//compruebo que el stringbuilder contenga la palabra que estoy buscando
            if (aux.toString().equals(palabra)) {
                contador++;
            }
        }
        return contador;
    }

    /**
     *
     * @param args
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int i = 0;
        String fichero, palabra;
        System.out.println("Introduce la palabra a buscar");
        palabra = Teclado.tecladoStringNextLine();
//declaro la variable de BufferedReader
        BufferedReader ficheros;
//indico la ubicacion del fichero que quiero leer
        ficheros = new BufferedReader(new FileReader("H:\\Programacion\\QuijoteDeLaMancha.txt"));
//bucle para que lea todas las lineas del fichero
        while ((fichero = ficheros.readLine()) != null) {
//comvierto la palabra del jugador y todo el fichero a minuscula
            fichero = fichero.toLowerCase();
            palabra = palabra.toLowerCase();
            i = i + cuentaPalabras(fichero, palabra);
        }
        System.out.println(i);
    }
}
