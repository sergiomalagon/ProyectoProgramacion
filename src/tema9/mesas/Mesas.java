/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.mesas;

import java.util.*;

/**
 *
 * @author Vespertino
 */
public enum Mesas {
    ROJA(1.20, 2.30), VERDE(1.50, 3.10), AZUL(1.80, 3.50);
    
    private double largo, ancho;
    
    private Mesas(double largo, double ancho) {
        
        this.largo = largo;
        this.ancho = ancho;
    }
    
    public double getAncho() {
        return ancho;
    }
    
    public double getLargo() {
        return largo;
    }
    
    public double area() {
        return ancho * largo;
    }
    
}

class RunMesas {
    
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String name, aux;
        Mesas azul = Mesas.AZUL;
        System.out.println("toString: " + azul);
        System.out.println("largo: " + azul.getLargo());
        System.out.println("ancho: " + azul.getAncho());
        System.out.println("area: " + azul.area());
        System.out.println("ordinal: " + azul.ordinal());
        System.out.println("name: " + azul.name());
        
        Mesas verde = Mesas.valueOf("VERDE");
        System.out.println("toString: " + verde);
        System.out.println("largo: " + verde.getLargo());
        System.out.println("ancho: " + verde.getAncho());
        System.out.println("area: " + verde.area());
        System.out.println("ordinal: " + verde.ordinal());
        System.out.println("name: " + verde.name());
        
        Mesas roja = Mesas.valueOf("ROJA");
        System.out.println("toString: " + roja);
        System.out.println("largo: " + roja.getLargo());
        System.out.println("ancho: " + roja.getAncho());
        System.out.println("area: " + roja.area());
        System.out.println("ordinal: " + roja.ordinal());
        System.out.println("name: " + roja.name());
        
    }
    
}
