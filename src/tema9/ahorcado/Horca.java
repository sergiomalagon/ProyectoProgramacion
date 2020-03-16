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
public class Horca {

    private int vida;

    public Horca() {
        this.vida = 0;
    }

    public void quitarVida() {
        this.vida++;
    }

    public void mostrar() {
        switch (this.vida) {
            case 0:
                System.out.println(" ");
                System.out.println("----------");
                System.out.println("|        |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("--------------");
                System.out.println(" ");
                break;
            case 1:
                System.out.println(" ");
                System.out.println("----------");
                System.out.println("|        |");
                System.out.println("|        o");
                System.out.println("|");
                System.out.println("|");
                System.out.println("--------------");
                System.out.println(" ");
                break;
            case 2:
                System.out.println(" ");
                System.out.println("----------");
                System.out.println("|        |");
                System.out.println("|        o");
                System.out.println("|        |");
                System.out.println("|");
                System.out.println("--------------");
                System.out.println(" ");
                break;
            case 3:
                System.out.println(" ");
                System.out.println("----------");
                System.out.println("|        |");
                System.out.println("|        o");
                System.out.println("|      --|");
                System.out.println("|");
                System.out.println("--------------");
                System.out.println(" ");
                break;
            case 4:
                System.out.println(" ");
                System.out.println("----------");
                System.out.println("|        |");
                System.out.println("|        o");
                System.out.println("|      --|--");
                System.out.println("|");
                System.out.println("--------------");
                System.out.println(" ");
                break;
            case 5:
                System.out.println(" ");
                System.out.println("----------");
                System.out.println("|        |");
                System.out.println("|        o");
                System.out.println("|      --|--");
                System.out.println("|       /");
                System.out.println("--------------");
                System.out.println(" ");
                break;
            case 6:
                System.out.println(" ");
                System.out.println("----------");
                System.out.println("|        |");
                System.out.println("|        o");
                System.out.println("|      --|--");
                System.out.println("|       / \\");
                System.out.println("--------------");
                System.out.println(" ");
                break;
        }
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

}
