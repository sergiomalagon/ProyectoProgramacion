/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.nif;

/**
 *
 * @author Vespertino
 */
public class NIF {

    private long numeroDNI;
    private char letra;

    public NIF() {
        this(0);
        this.letra = ' ';
    }

    public NIF(long numeroDNI) {
        this.numeroDNI = numeroDNI;
        calculaLetra();
    }

    public void setDni(long numeroDNI) {

        this.numeroDNI = numeroDNI;
        calculaLetra();
    }

    public long getDni() {
        return this.numeroDNI;
    }

    public void leer(long numeroDNI) {
        this.numeroDNI = numeroDNI;
    }

    private void calculaLetra() {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resultado;

        resultado = (int) getDni() % 23;
        letra = letras.charAt(resultado);
    }

    public boolean equals(NIF f) {
        NIF n = new NIF();
        boolean resultado;
        resultado = f.getDni() == n.getDni();
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getDni());
        sb.append(letra);
        return sb.toString();
    }
}
