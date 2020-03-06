/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.text.DecimalFormat;

/**
 *
 * @author Sergio
 */
public class Matematicas {

    public static int sumarInt(int numero1, int numero2) {
        int numerototal;
        DecimalFormat formato = new DecimalFormat("#.##");
        numerototal = numero1 + numero2;

        return numerototal;
    }

    public static double sumarDouble(double numero1, double numero2) {
        double numerototal;
        DecimalFormat formato = new DecimalFormat("#.##");
        numerototal = numero1 + numero2;
        formato.format(numerototal);

        return numerototal;
    }

    public static int restarInt(int numero1, int numero2) {
        int numerototal;
        DecimalFormat formato = new DecimalFormat("#.##");
        numerototal = numero1 - numero2;

        return numerototal;
    }

    public static double restarDouble(double numero1, double numero2) {
        double numerototal;
        DecimalFormat formato = new DecimalFormat("#.##");
        numerototal = numero1 - numero2;
        formato.format(numerototal);

        return numerototal;
    }

    public static int multiplicarInt(int numero1, int numero2) {
        int numerototal;
        DecimalFormat formato = new DecimalFormat("#.##");
        numerototal = numero1 * numero2;

        return numerototal;
    }

    public static double multiplicarDouble(double numero1, double numero2) {
        double numerototal;
        DecimalFormat formato = new DecimalFormat("#.##");
        numerototal = numero1 * numero2;
        formato.format(numerototal);

        return numerototal;
    }

    public static int dividirInt(int numero1, int numero2) {
        int numerototal;
        DecimalFormat formato = new DecimalFormat("#.##");
        numerototal = numero1 / numero2;

        return numerototal;
    }

    public static double dividirDouble(double numero1, double numero2) {
        double numerototal;
        DecimalFormat formato = new DecimalFormat("#.##");
        numerototal = numero1 / numero2;
        formato.format(numerototal);

        return numerototal;
    }

    public static StringBuilder ecuacionSegundoGradoInt(int a, int b, int c) {
        StringBuilder ecuacion = new StringBuilder();
        int ecuacionX, ecuacionX2;
        int raizcuadrada;
        // Calculos
        raizcuadrada = (b * b) - 4 * a * c;

        ecuacionX = (int) ((-b + Math.sqrt(raizcuadrada)) / (2 * a));
        ecuacionX2 = (int) ((-b - Math.sqrt(raizcuadrada)) / (2 * a));

        //Condicion
        if (raizcuadrada < 0) {
            System.out.println("NO EXISTEN SOLUCIONES REALES");
        } else if (a == 0) {
            System.out.println("NO SE PUEDE DIVIDIR ENTRE CERO");
        } else {
            DecimalFormat formato = new DecimalFormat("#.##");
            System.out.println("El valor de la ecuacion es " + formato.format(ecuacionX) + "\n");
            System.out.print(" Y " + formato.format(ecuacionX2) + "\n");
        }
        return ecuacion;
    }

    public static StringBuilder ecuacionSegundoGradoFloat(float a, float b, float c) {
        StringBuilder ecuacion = new StringBuilder();
        float ecuacionX, ecuacionX2;
        float raizcuadrada;
        // Calculos
        raizcuadrada = (b * b) - 4 * a * c;

        ecuacionX = (float) ((-b + Math.sqrt(raizcuadrada)) / (2 * a));
        ecuacionX2 = (float) ((-b - Math.sqrt(raizcuadrada)) / (2 * a));

        //Condicion
        if (raizcuadrada < 0) {
            System.out.println("NO EXISTEN SOLUCIONES REALES");
        } else if (a == 0) {
            System.out.println("NO SE PUEDE DIVIDIR ENTRE CERO");
        } else {
            DecimalFormat formato = new DecimalFormat("#.##");
            System.out.println("El valor de la ecuacion es " + formato.format(ecuacionX) + "\n");
            System.out.print(" Y " + formato.format(ecuacionX2) + "\n");
        }
        return ecuacion;
    }

    public static double areavolumen(int modo, double radio, double altura) {
        double area;
        double volumen;
        area = (2 * 3.14 * radio * (altura + radio));
        volumen = 3.14 * (radio * radio) * altura;

        if (modo == 1) {
            return volumen;

        } else {
            return area;
        }
    }

    public static int potenciaRecursividad(int base, int exponente) {
        int resultado;
        if (exponente == 0) {
            resultado = 1;

        } else {
            resultado = base * potenciaRecursividad(base, exponente - 1);
        }
        return resultado;
    }

    public static int factorialRecursividad(int numero) {
        int resultado;
        if (numero == 0) {
            resultado = 1;
        } else {
            resultado = numero * factorialRecursividad(numero - 1);
        }
        return resultado;
    }

    public static void tablaMultiplicar(int tabla, int numero) {
        if (numero > 1) {
            tablaMultiplicar(tabla, numero - 1);
        }
        System.out.println(tabla + " x " + numero + " = " + tabla * numero);
    }
}
