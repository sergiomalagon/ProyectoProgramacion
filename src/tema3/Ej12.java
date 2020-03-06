/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */

/*
Realizar un programa que simule el juego de la “ruleta rusa”. Para ello generaremos un
número aleatorio entre [1,6] y pediremos al usuario dos datos: la apuesta y un número (entre
[1,6]). En el caso de acertar el número el usuario muere mostrando el mensaje “Has perdido”.
Si gana mostraremos “Sales vivo tu saldo ahora es: (apuesta*2)”;
 */
public class Ej12 {

    public static void main(String[] args) {

        int bala;
        int apuesta;
        int numeroapuesta;
        int apuestafinal;
        String pregunta = "¿QUIERES JUGAR OTRA RONDA? [Si o No]";
        String respuesta;
        String aceptar = "Si";
        String negar = "No";
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce cuanto quieres apostar: ");
        apuesta = teclado.nextInt();
        System.out.println("Introduce un numero entre [1 y 6]");
        numeroapuesta = teclado.nextInt();

        Random r = new Random();
        bala = r.nextInt(7) + 1;

        if (numeroapuesta < 1 || numeroapuesta > 6) {
            System.out.println("INTRODUCE UN NUMERO VALIDO");
        } else {
            if (numeroapuesta == bala) {
                System.out.println("HAS MUERTO");
            } else if (numeroapuesta != bala) {
                apuestafinal = apuesta * 2;
                apuesta = apuesta * 2;
                System.out.println("SALES VIVO, TIENES: " + apuesta + "$");
                System.out.println("\n");
                System.out.println(pregunta);
                respuesta = teclado.next();

                if (respuesta.equals(aceptar)) {
                    System.out.println("Introduce un numero entre [1 y 6]");
                    numeroapuesta = teclado.nextInt();

                    if (numeroapuesta < 1 || numeroapuesta > 6) {
                        System.out.println("INTRODUCE UN NUMERO VALIDO");
                    } else {
                        if (numeroapuesta == bala) {
                            System.out.println("HAS MUERTO");
                        } else if (numeroapuesta != bala) {
                            apuestafinal = apuesta * 2;
                            apuesta = apuesta * 2;
                            System.out.println("SALES VIVO, TIENES: " + apuesta + "$");
                            System.out.println("\n");
                            System.out.println(pregunta);
                            respuesta = teclado.next();

                            if (respuesta.equals(aceptar)) {
                                System.out.println("Introduce un numero entre [1 y 6]");
                                numeroapuesta = teclado.nextInt();
                                if (numeroapuesta < 1 || numeroapuesta > 6) {
                                    System.out.println("INTRODUCE UN NUMERO VALIDO");
                                } else {
                                    if (numeroapuesta == bala) {
                                        System.out.println("HAS MUERTO");
                                    } else if (numeroapuesta != bala) {
                                        apuestafinal = apuesta * 2;
                                        apuesta = apuesta * 2;
                                        System.out.println("SALES VIVO, TIENES: " + apuesta + "$");
                                        System.out.println("\n");
                                        System.out.println(pregunta);
                                        respuesta = teclado.next();

                                        if (respuesta.equals(aceptar)) {
                                            System.out.println("Introduce un numero entre [1 y 6]");
                                            numeroapuesta = teclado.nextInt();
                                            if (numeroapuesta < 1 || numeroapuesta > 6) {
                                                System.out.println("INTRODUCE UN NUMERO VALIDO");
                                            } else {
                                                if (numeroapuesta == bala) {
                                                    System.out.println("HAS MUERTO");
                                                } else if (numeroapuesta != bala) {
                                                    apuestafinal = apuesta * 2;
                                                    apuesta = apuesta * 2;
                                                    System.out.println("SALES VIVO, TIENES: " + apuesta + "$");
                                                    System.out.println("\n");
                                                    System.out.println(pregunta);
                                                    respuesta = teclado.next();

                                                    if (respuesta.equals(aceptar)) {
                                                        System.out.println("Introduce un numero entre [1 y 6]");
                                                        numeroapuesta = teclado.nextInt();
                                                        if (numeroapuesta < 1 || numeroapuesta > 6) {
                                                            System.out.println("INTRODUCE UN NUMERO VALIDO");
                                                        } else {
                                                            if (numeroapuesta == bala) {
                                                                System.out.println("HAS MUERTO");
                                                            } else if (numeroapuesta != bala) {
                                                                apuestafinal = apuesta * 2;
                                                                apuesta = apuesta * 2;
                                                                System.out.println("SALES VIVO, TIENES: " + apuesta + "$");
                                                                System.out.println("\n");
                                                                System.out.println(pregunta);
                                                                respuesta = teclado.next();

                                                                if (respuesta.equals(aceptar)) {
                                                                    System.out.println("Introduce un numero entre [1 y 6]");
                                                                    numeroapuesta = teclado.nextInt();
                                                                    if (numeroapuesta < 1 || numeroapuesta > 6) {
                                                                        System.out.println("INTRODUCE UN NUMERO VALIDO");
                                                                    } else {
                                                                        if (numeroapuesta == bala) {
                                                                            System.out.println("HAS MUERTO");
                                                                        } else if (numeroapuesta != bala) {
                                                                            apuestafinal = apuesta * 2;
                                                                            apuesta = apuesta * 2;
                                                                            System.out.println("SALES VIVO, TIENES: " + apuesta + "$");
                                                                            System.out.println("\n");
                                                                            System.out.println(pregunta);
                                                                            respuesta = teclado.next();

                                                                            if (respuesta.equals(aceptar)) {
                                                                                System.out.println("Introduce un numero entre [1 y 6]");
                                                                                numeroapuesta = teclado.nextInt();

                                                                            }

                                                                        }

                                                                    }

                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }
                }

                if (respuesta.equals(negar)) {
                    System.out.println("SE ACABO, HAS GANADO: " + (apuestafinal) + "$");
                }

            }

        }

    }
}
