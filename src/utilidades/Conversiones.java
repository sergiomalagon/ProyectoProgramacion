/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/**
 *
 * @author Sergio
 */
public class Conversiones {

    public static double centimetrosCubicosALitros(String centimetroscubicos) {
        double resultado, aux;
        aux = Double.parseDouble(centimetroscubicos);
        resultado = aux / 1000;
        return resultado;
    }

    public static double celsiusFahrenheit(String gradoscelsius) {
        double resultado, aux;
        aux = Double.parseDouble(gradoscelsius);
        resultado = (aux * 9 / 5) + 32;
        return resultado;
    }

    public static double kilometrosMillasCuadradas(String kilometros) {
        double resultado, aux;
        aux = Double.parseDouble(kilometros);
        resultado = aux * 2.59;
        return resultado;
    }

    public static double librasKilogramos(String libras) {
        double resultado, aux;
        aux = Double.parseDouble(libras);
        resultado = aux * 2.205;
        return resultado;
    }

    public static double milibaresPieCuadrado(String milibares) {
        double resultado, aux;
        aux = Double.parseDouble(milibares);
        resultado = aux * 2.0885;
        return resultado;
    }
    public static StringBuilder positivoABinario(int n){
        StringBuilder resultado = new StringBuilder();
        if(n>1){
            resultado.append(n%2);
            return resultado.append(positivoABinario(n/2));
           
        }else{
            return resultado.append(n%2);
        }
    }
}
