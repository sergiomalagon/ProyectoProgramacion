/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.garaje;

/**
 *
 * @author Vespertino
 */
public class Coche {

    private Motor motor;
    private String marca, modelo;
    private double precioAcumulado;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor= new Motor(100);
    }

    public Motor getMotor() {
        return motor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecioAcumulado() {
        return precioAcumulado;
    }

    public void acumularAveria(double precioAcumulado) {
        this.precioAcumulado += precioAcumulado;
    }

    @Override
    public String toString() {
        return "Coche\n" + "motor \t" + motor + "\nmarca\t" + marca + "\nmodelo\t" + modelo + "\nprecioAcumulado\t" + precioAcumulado;
    }

}
