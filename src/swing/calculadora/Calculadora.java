/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.calculadora;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 *
 * @author Vespertino
 */
public class Calculadora extends JFrame {

    private JTextField txtResultado;

    private JPanel zonaResultado;
    private final JPanel zonaBotones;

    private final GridLayout gl;
    private final BorderLayout bl;

    private final JButton btn7;
    private final JButton btn4;
    private final JButton btn1;
    private final JButton btnC;

    private final JButton btn8;
    private final JButton btn5;
    private final JButton btn2;
    private final JButton btn0;

    private final JButton btn9;
    private final JButton btn6;
    private final JButton btn3;
    private final JButton btnIgual;

    private final JButton btnSumar;
    private final JButton btnRestar;
    private final JButton btnMultiplicar;
    private final JButton btnDividir;

    String numeros, numeros2, resultadoString;
    String[] operaciones;
    float resultado, parte1, parte2;
    int contadorAux;
    String sumar, restar, multiplicar, dividir;

    public Calculadora() {
        bl = new BorderLayout();
        gl = new GridLayout(4, 4);
        numeros = " ";
        txtResultado = new JTextField();
        btn0 = new JButton("0");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btnC = new JButton("C");
        btnIgual = new JButton("=");
        btnSumar = new JButton("+");
        btnRestar = new JButton("-");
        btnMultiplicar = new JButton("*");
        btnDividir = new JButton("/");

        zonaBotones = new JPanel(gl);
        getContentPane().add(txtResultado, BorderLayout.NORTH);
        getContentPane().add(zonaBotones, BorderLayout.CENTER);

        zonaBotones.add(btn1);
        zonaBotones.add(btn2);
        zonaBotones.add(btn3);
        zonaBotones.add(btnDividir);

        zonaBotones.add(btn4);
        zonaBotones.add(btn5);
        zonaBotones.add(btn6);
        zonaBotones.add(btnMultiplicar);

        zonaBotones.add(btn7);
        zonaBotones.add(btn8);
        zonaBotones.add(btn9);
        zonaBotones.add(btnRestar);

        zonaBotones.add(btnC);

        zonaBotones.add(btn0);

        zonaBotones.add(btnIgual);

        zonaBotones.add(btnSumar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        btn0.addActionListener((ActionEvent e) -> {
            botonCero();
        });
        btn1.addActionListener((ActionEvent e) -> {
            botonUno();
        });
        btn2.addActionListener((ActionEvent e) -> {
            botonDos();
        });
        btn3.addActionListener((ActionEvent e) -> {
            botonTres();
        });
        btn4.addActionListener((ActionEvent e) -> {
            botonCuatro();
        });
        btn5.addActionListener((ActionEvent e) -> {
            botonCinco();
        });
        btn6.addActionListener((ActionEvent e) -> {
            botonSeis();
        });
        btn7.addActionListener((ActionEvent e) -> {
            botonSiete();
        });
        btn8.addActionListener((ActionEvent e) -> {
            botonOcho();
        });
        btn9.addActionListener((ActionEvent e) -> {
            botonNueve();
        });
        btnC.addActionListener((ActionEvent e) -> {
            botonC();
        });
        btnSumar.addActionListener((ActionEvent e) -> {
            botonSumar();
        });
        btnRestar.addActionListener((ActionEvent e) -> {
            botonRestar();
        });
        btnMultiplicar.addActionListener((ActionEvent e) -> {
            botonMultiplicar();
        });
        btnDividir.addActionListener((ActionEvent e) -> {
            botonDividir();
        });
        btnIgual.addActionListener((ActionEvent e) -> {
            botonIgual();
        });

    }

    private void botonCero() {
        numeros += ("0");
        numeros2 += ("0");

        txtResultado.setText(numeros);
    }

    private void botonUno() {
        numeros += ("1");
        numeros2 += ("1");

        txtResultado.setText(numeros);
    }

    private void botonDos() {
        numeros += ("2");
        numeros2 += ("2");

        txtResultado.setText(numeros);
    }

    private void botonTres() {
        numeros += ("3");
        numeros2 += ("3");

        txtResultado.setText(numeros);
    }

    private void botonCuatro() {
        numeros += ("4");
        numeros2 += ("4");

        txtResultado.setText(numeros);
    }

    private void botonCinco() {
        numeros += ("5");
        numeros2 += ("5");

        txtResultado.setText(numeros);
    }

    private void botonSeis() {
        numeros += ("6");
        numeros2 += ("6");

        txtResultado.setText(numeros);
    }

    private void botonSiete() {
        numeros += ("7");
        numeros2 += ("7");

        txtResultado.setText(numeros);
    }

    private void botonOcho() {
        numeros += ("8");
        numeros2 += ("8");

        txtResultado.setText(numeros);
    }

    private void botonNueve() {
        numeros += ("9");
        numeros2 += ("9");

        txtResultado.setText(numeros);
    }

    private void botonC() {
        txtResultado.setText("");
        numeros = "";
        numeros2 = "";
        contadorAux = 0;
    }

    private void botonSumar() {
        if (contadorAux <= 0) {
            numeros += ("+");
            numeros2 += ("s");
            txtResultado.setText(numeros);
            contadorAux = 1;
        }

    }

    private void botonRestar() {
        if (contadorAux <= 0) {
            numeros += ("-");
            numeros2 += ("r");
            txtResultado.setText(numeros);
            contadorAux = 2;
        }
    }

    private void botonMultiplicar() {
        if (contadorAux <= 0) {
            numeros += ("*");
            numeros2 += ("m");
            txtResultado.setText(numeros);
            contadorAux = 3;
        }
    }

    private void botonDividir() {
        if (contadorAux <= 0) {
            numeros += ("/");
            numeros2 += ("d");
            txtResultado.setText(numeros);
            contadorAux = 4;
        }
    }

    private void botonIgual() {

        switch (contadorAux) {
            case 1:
                numeros2 = numeros.replace('+', 's');
                operaciones = numeros2.split("s");
                parte1 = Float.parseFloat(operaciones[0].trim());
                parte2 = Float.parseFloat(operaciones[1].trim());
                resultado = parte1 + parte2;
                resultadoString = Float.toString(resultado);
                txtResultado.setText(resultadoString);
                break;
            case 2:
                numeros2 = numeros.replace('-', 'r');
                operaciones = numeros2.split("r");
                parte1 = Float.parseFloat(operaciones[0].trim());
                parte2 = Float.parseFloat(operaciones[1].trim());
                resultado = parte1 - parte2;
                resultadoString = Float.toString(resultado);
                txtResultado.setText(resultadoString);
                break;
            case 3:
                numeros2 = numeros.replace('*', 'm');
                operaciones = numeros2.split("m");
                parte1 = Float.parseFloat(operaciones[0].trim());
                parte2 = Float.parseFloat(operaciones[1].trim());
                resultado = parte1 * parte2;
                resultadoString = Float.toString(resultado);
                txtResultado.setText(resultadoString);
                break;
            case 4:
                numeros2 = numeros.replace('/', 'd');
                operaciones = numeros2.split("d");
                parte1 = Float.parseFloat(operaciones[0].trim());
                parte2 = Float.parseFloat(operaciones[1].trim());
                resultado = parte1 / parte2;
                resultadoString = Float.toString(resultado);
                txtResultado.setText(resultadoString);
                break;
            default:
                break;
        }
    }

}
