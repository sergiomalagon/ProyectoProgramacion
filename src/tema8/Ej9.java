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
Escribir un programa que permita gestionar la base de datos de clientes de una empresa. Los
clientes se guardarán en un diccionario en el que la clave de cada cliente será su NIF, y el valor
será un array de String con los datos del cliente (nombre, dirección, teléfono, correo,
preferente), donde preferente tendrá el valor true si se trata de un cliente preferente.
El programa debe preguntar al usuario por una opción del siguiente menú: (1) Añadir cliente,
(2) Eliminar cliente, (3) Modificar cliente, (4) Mostrar cliente, (5) Listar todos los clientes, (6)
Listar clientes preferentes, (7) Terminar. En función de la opción elegida el programa tendrá
que hacer lo siguiente:

1. Se preguntará los datos del cliente y lo añadiremos al diccionario. Si el cliente ya existiese se informará previamente al usuario.
2. Preguntar por el NIF del cliente y eliminar sus datos de la base de datos, en caso de no existir se informará al usuario.
3. Se pide el NIF, se busca el cliente y se muestran los datos (o no existe en caso de no existir). 
4. Se vuelven a introducir todos los datos menos el NIF y se modifica el nodo en el diccionario.
5. Preguntar por el NIF del cliente y mostrar sus datos o “NO Existe”.
6. Mostrar lista de todos los clientes de la base datos con su NIF y nombre.
7. Mostrar la lista de clientes preferentes de la base de datos con su NIF y nombre.
8. Terminar el programa.
 */
public class Ej9 {

    public static void leyenda() {
        System.out.println("Bienvenido");
        System.out.println("-------------------");
        System.out.println("(1) Añadir cliente");
        System.out.println("(2) Eliminar cliente");
        System.out.println("(3) Modificar cliente");
        System.out.println("(4) Mostrar cliente");
        System.out.println("(5) Listar todos los clientes");
        System.out.println("(6) Listar los clientes preferentes");
        System.out.println("(7) Terminar");
    }

    public static void menu(int menu, HashSet repetidos, HashMap<String, String[]> cliente) {
        Scanner t = new Scanner(System.in);
        String datos, nif = " ";
        String[] mostrarC;
        switch (menu) {
            case 1:
                System.out.println("-------------------");
                System.out.print("NIF: ");
                nif = t.next();
                if (cliente.containsKey(nif)) {
                    System.out.println("Este cliente ya ha sido introducido");
                    break;
                } else {
                    System.out.print("Nombre, Dirección, Teléfono, Correo, Preferente: ");
                    t.nextLine();
                    datos = t.nextLine();
                    addClientes(nif, datos, cliente);
                    System.out.println("Cliente creado con exito");
                    break;
                }
            case 2:
                System.out.println("-------------------");
                System.out.print("NIF: ");
                nif = t.next();
                if (!cliente.containsKey(nif)) {
                    System.out.println("El cliente no existe");
                } else {
                    cliente.remove(nif);
                    System.out.println("Cliente eliminado con exito");
                }
                break;
            case 3:
                System.out.println("-------------------");
                System.out.print("NIF: ");
                nif = t.next();
                if (!cliente.containsKey(nif)) {
                    System.out.println("El cliente no existe");
                } else {
                    mostrarC = mostrarCliente(nif, cliente);
                    System.out.println(Arrays.toString(mostrarC));
                    System.out.println("Introduce los nuevos datos");
                    t.nextLine();
                    datos = t.nextLine();
                    modificarClientes(nif, datos, cliente);
                }
                break;
            case 4:
                System.out.println("-------------------");
                System.out.print("NIF: ");
                nif = t.next();
                if (!cliente.containsKey(nif)) {
                    System.out.println("El cliente no existe");
                } else {
                    mostrarC = mostrarCliente(nif, cliente);
                    System.out.println(Arrays.toString(mostrarC));
                }
                break;
            case 5:
                System.out.println("-------------------");
                listarClientes(cliente);

                break;
            case 6:
                System.out.println("-------------------");
                listarClientesPreferentes(nif, cliente);
                break;
        }

    }

    public static void addClientes(String nif, String datos, HashMap<String, String[]> cliente) {
        String[] datosArray;
        datosArray = datos.split(" ");
        cliente.put(nif, datosArray);
    }

    public static void modificarClientes(String nif, String datos, HashMap<String, String[]> cliente) {
        String[] datosArray;
        datosArray = datos.split(" ");
        cliente.replace(nif, datosArray);
    }

    public static String[] mostrarCliente(String nif, HashMap<String, String[]> cliente) {
        String[] salida;
        salida = cliente.get(nif);
        return salida;
    }

    public static void listarClientes(HashMap<String, String[]> cliente) {
        Set clientAux = cliente.keySet();
        Iterator it = clientAux.iterator();
        while (it.hasNext()) {
            String auxProducto = (String) it.next();
            System.out.println(auxProducto + " " + Arrays.toString(cliente.get(auxProducto)));
        }
    }

    public static void listarClientesPreferentes(String nif, HashMap<String, String[]> cliente) {
        Set clientAux = cliente.keySet();
        Iterator it = clientAux.iterator();
        while (it.hasNext()) {
            String auxProducto = (String) it.next();
            if (cliente.get(auxProducto)[4].equals("true")) {
                System.out.println(auxProducto + " " + Arrays.toString(cliente.get(auxProducto)));
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner t = new Scanner(System.in);
        int menu;
        HashSet clientesRepetidos = new HashSet();
        HashMap<String, String[]> cliente = new HashMap<>();
        do {
            leyenda();
            System.out.print("(*): ");
            menu = t.nextInt();
            menu(menu, clientesRepetidos, cliente);
        } while (menu != 7);
        System.out.print("Saliendo del programa");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".\n");
        Thread.sleep(2000);
    }
}
