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
Introducir por consola una frase que conste exclusivamente de palabras separadas por espacios.
Almacenar en una lista las palabras de la frase, una en cada nodo y mostrar por pantalla las
palabras que esten repetidas.A continuacion mostrar las que no esten
 */
public class Ej5_Separar_Repetidos_Separar_NoRepetidos {

    public static Set getRepetidos(List palabra) {
        //ArrayList repetidos = new ArrayList();
        Set<Object> repetidos;
        repetidos = new HashSet<>();
        for (Object o : palabra) {
            if (palabra.indexOf(o) != palabra.lastIndexOf(o)) {
                repetidos.add(o);
            }
        }
        return (HashSet) repetidos;
    }

    public static Set getNoRepetidos(List palabra) {
        Set<Object> noRepetidos;
        noRepetidos = new HashSet<>();
        for (Object o : palabra) {
            if (palabra.indexOf(o) == palabra.lastIndexOf(o)) {
                noRepetidos.add(o);
            }
        }
        return (HashSet) noRepetidos;
    }

    public static String[] separarPalabras(String frase) {
        String[] palabras;
        palabras = frase.split(" ");
        return palabras;
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String frase;
        String[] palabras;
        
        System.out.print("Frase: ");
        frase = t.nextLine();
        
        palabras = separarPalabras(frase);
        ArrayList<String> palabra;
        palabra = new ArrayList<>(Arrays.asList(palabras));
        Set hs = getRepetidos(palabra);

        System.out.println("Las palabras repetidas son: ");
        System.out.println(hs);
        System.out.println("Las palabras no repetidas son: ");
        System.out.println(getNoRepetidos(palabra));
        
    }

}
