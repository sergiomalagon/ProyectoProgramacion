/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.cuentasbancarias;

/**
 *
 * @author Sergio
 */
public class Test {

    public static void main(String[] args) {
      NumeroDeCuenta nc = new NumeroDeCuenta("1234", "230", "12", "1234567890");
      
      Titular t = new Titular("sergio", "malagon", 20);
      
        
        
     CuentaAhorro ch = new CuentaAhorro(2, t, nc, 2000);
        System.out.println("" + ch.getSaldo());
        ch.calcularInteres();
        System.out.println("" + ch.getSaldo());
    }

}
