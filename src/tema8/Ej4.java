/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

import java.util.*;
import utilidades.Teclado;

/**
 *
 * @author Vespertino
 */
/*
Implementa un metodo llamado limpiaRepetidos a la que se le pase una lista de nombres
y develva una copia sin elementos repetidos
Una version que devuelva otra coleccion
Una version que a la coleccion original le quite los repetidos
 */
public class Ej4 {

    public static ArrayList limpiaRepetidosMisma(ArrayList<String>nombres) {
        int longitud = nombres.size(), contador = 0;
        Object[] nombresArray = new Object[longitud];
        nombresArray = nombres.toArray();
        for (int i = 0; i <= nombres.size(); i++) {
            for (int j = 1; j <= nombres.size(); j++) {
                if (nombresArray[i].equals(nombresArray[j])) {
                    nombres.remove(i);
                    nombres.trimToSize();
                    j = 0;
                }
            }
        }
        return nombres;
    }

    public static ArrayList limpiaRepetidosNueva(Collection<String> nombres) {
        Set<String> set = new LinkedHashSet<>(nombres);
        nombres.clear();
        nombres.addAll(set);
        return (ArrayList) nombres;
    }

    public static void main(String[] args) {
        String nombre;
        ArrayList nombres = new ArrayList();
        ArrayList nombres1 = new ArrayList();
        System.out.println("Inserta un nombre");
        nombre = Teclado.tecladoString();
        while (!nombre.contains("fin")) {
            nombres.add(nombre);
            nombres1.add(nombre);
            System.out.println("Inserta un nombre");
            nombre = Teclado.tecladoString();
        }
        Iterator aux = nombres.iterator();
        System.out.println("Orden de introduccion");
        while (aux.hasNext()) {
            System.out.println("Misma coleccion");
            System.out.println(limpiaRepetidosMisma(nombres));
            System.out.println("Nueva coleccion");
            System.out.println(limpiaRepetidosNueva(nombres1));
        }

    }
}
