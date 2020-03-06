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
Escribir un programa que cree un diccionario simulando una cesta de la compra.
El programa debe preguntar el articulo y su precio y añadir el para al diccionario,
hasta que el usuario decida terminar.Despues se debe mostrar por pantalla la lista 
de la compra y el coste total, con el siguente formato:

Articulo    Precio
...         ...


Total       Coste
 */
public class Ej7 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        HashMap cesta = new HashMap();
        Set productos;
        String producto;
        double precio, precioTotal = 0;
        do {
            System.out.println("Introduce el producto (FIN acabar)");
            producto = t.nextLine();
            if (producto.equals("FIN")) {
                break;
            }
            System.out.println("Introduce el precio");
            precio = t.nextDouble();
            t.nextLine();
            precioTotal += precio;
            cesta.put(producto, precio);
        } while (true);
        
        productos = cesta.keySet();
        Iterator product = productos.iterator();
        System.out.println("Lista de la compra");
        while (product.hasNext()) {
            String auxProducto = (String) product.next();
            System.out.println(auxProducto + " " + cesta.get(auxProducto));
        }
        System.out.println("Total" + precioTotal);

    }
}
