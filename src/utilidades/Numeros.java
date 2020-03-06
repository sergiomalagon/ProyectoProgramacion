/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Numeros {

    public static boolean parOImpar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean sonIguales(float numero1, float numero2) {
        if (numero1 == numero2) {
            return true;
        } else {
            return false;
        }
    }

    public static StringBuilder cualEsMasGrande3NumerosInt(int numero1, int numero2, int numero3) {
        StringBuilder numeros = new StringBuilder();
        if (numero1 > numero2) {
            if (numero1 > numero3) {
                if (numero2 > numero3) {

                    System.out.println("De mayor a menor es: " + numero1 + " " + numero2 + " " + numero3);
                } else {

                    System.out.println("De mayor a menor es: " + numero1 + " " + numero3 + " " + numero2);
                }
            } else {

                System.out.println("De mayor a menos es: " + numero3 + " " + numero1 + " " + numero2);
            }
        } else {
            if (numero2 > numero3) {
                if (numero1 > numero3) {

                    System.out.println("De mayor a menor es: " + numero2 + " " + numero1 + " " + numero3);
                } else {

                    System.out.println("De mayor a menor es: " + numero2 + " " + numero3 + " " + numero1);
                }
            } else {

                System.out.println("De mayor a menor es: " + numero3 + " " + numero2 + " " + numero1);
            }
        }

        return numeros;
    }

    public static StringBuilder cualEsMasGrande3NumerosFloat(float numero1, float numero2, float numero3) {
        StringBuilder numeros = new StringBuilder();
        if (numero1 > numero2) {
            if (numero1 > numero3) {
                if (numero2 > numero3) {

                    System.out.println("De mayor a menor es: " + numero1 + " " + numero2 + " " + numero3);
                } else {

                    System.out.println("De mayor a menor es: " + numero1 + " " + numero3 + " " + numero2);
                }
            } else {

                System.out.println("De mayor a menos es: " + numero3 + " " + numero1 + " " + numero2);
            }
        } else {
            if (numero2 > numero3) {
                if (numero1 > numero3) {

                    System.out.println("De mayor a menor es: " + numero2 + " " + numero1 + " " + numero3);
                } else {

                    System.out.println("De mayor a menor es: " + numero2 + " " + numero3 + " " + numero1);
                }
            } else {

                System.out.println("De mayor a menor es: " + numero3 + " " + numero2 + " " + numero1);
            }
        }

        return numeros;
    }

    public static void capicua(int numero, int rango) {
        int aux, inverso = 0, cifra;

        if (numero < rango) {

            //le damos la vuelta al número
            aux = numero;
            while (aux != 0) {
                cifra = aux % 10;
                inverso = inverso * 10 + cifra;
                aux = aux / 10;
            }

            if (numero == inverso) {
                System.out.println("Es capicua");
            } else {
                System.out.println("No es capicua");
            }
        } else {
            System.out.println("Error, el rango tiene que ser mayor que el numero que estas introduciendo");
        }
    }

    public static boolean añoBisiesto(int año) {
        if (((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0)))) {
            return true;
        } else {
            return false;
        }

    }

    public static int numeroAñosBisiestosEntreDosAños(int año1, int año2) {
        int contador = 0;
        while (año1 <= año2) {
            if ((año1 % 4 == 0) && ((año1 % 100 != 0) || (año1 % 400 == 0))) {
                contador++;
            }
            año1++;
        }
        return contador;
    }

    public static void rangoNumerosExceptoMultiplosNumeroIndicado(int rangoinicio, int rangofinal, int multiplo) {
        while (rangoinicio < rangofinal) {
            rangoinicio++;
            if (rangoinicio % multiplo == 0) {
                continue;
            }
            System.out.println(rangoinicio);
        }
    }

    public static boolean esPrimo(int numero) {
        int contador = 2;
        boolean primo = true;
        if (numero < 2) {
            primo = false;
        }
        while (contador < numero && primo == true) {
            if (numero % contador == 0) {
                primo = false;
                break;
            }
            contador++;

        }
        return primo;
    }

    public static boolean esDivisor(int a, int b) {

        if (a % b == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int tieneComoDivisor(int numero) {
        int divi = 0;

        while (divi < numero) {
            divi++;
            if (numero % divi == 0) {
                System.out.print("El numero " + numero + " tiene como divisor el numero: ");
                System.out.println(divi);
            }

        }

        return divi;

    }

    public static StringBuilder divisoresPrimos(int numero) {
        StringBuilder primos = new StringBuilder();
        int i = 0;
        for (; i <= numero; i++) {
            if (esPrimo(i) && numero % i == 0) {
                System.out.print(" El numero " + numero + " tiene como divisores primos: ");
                System.out.println(i);

            }
        }
        return primos;

    }

    public static int sumarDivisores(int numero) {
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma;
    }

    public static boolean numerosAmigos(int numero1, int numero2) {
        boolean amigos;

        if (numero2 == sumarDivisores(numero1) && numero1 == sumarDivisores(numero2)) {
            amigos = true;
        } else {
            amigos = false;
        }
        return amigos;
    }

    public static int fibonacci(int numero) {
        int resultado = 0;
        if (numero == 0) {
            resultado = 0;
        } else if (numero == 1) {
            resultado = 1;
        } else {
            resultado = fibonacci(numero - 1) + fibonacci(numero - 2);
        }
        return resultado;
    }

    public static int darFormato(int numeros) {
        DecimalFormat formato = new DecimalFormat("#.##");
        formato.format(numeros);
        return numeros;
    }

}
