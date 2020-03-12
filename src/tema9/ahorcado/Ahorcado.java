/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.ahorcado;

/**
 *
 * @author Vespertino
 */
public class Ahorcado {

    private Horca horca;
    private Fallos fallos;
    private Intento intento;
    private Guiones guiones;

    public Ahorcado() {
        this.horca = new Horca();
        this.fallos = new Fallos();
        this.intento = new Intento();
        this.guiones = new Guiones();
        jugar();

    }

    public void mostrarInstrucciones() {
        System.out.println("Introduce una letra");
        System.out.println("Si la letra se encuntra dentro de la palabra, se mostrara en su posicion");
        System.out.println("Si la letra no se encontrase en la palabra, la letra se añade a una lista de letras falladas");
        System.out.println("El juego acaba cuando has descubierto la palabra o has matado al personaje");
    }

    public void jugar() {
        mostrarInstrucciones();
        while (true) {
            this.horca.mostrarHorca();
            System.out.println("" + this.guiones.getGuiones().toString());
            System.out.println("" + this.fallos.mostrarFallos());
            this.intento.pedirLetra();
            int aux = this.guiones.getPalabraSecreta().indexOf(this.intento.getLetra());
            if (aux != -1) {
                this.guiones.getGuiones().setCharAt(aux, this.intento.getLetra());
            } else {
                this.fallos.añadirLetra(this.intento.getLetra());
                this.horca.quitarVida();
            }
            {
                if (this.guiones.getGuiones().toString().equals(this.guiones.getPalabraSecreta())) {
                    System.out.println("¡HAS GANADO!");
                    return;
                }
            }
            if (this.horca.getVida() == 6 || this.fallos.getListaFallos().size() == this.guiones.getGuiones().length()) {
                System.out.println("¡HAS PERDIDO!");
                return;
            }
        }
    }
}
