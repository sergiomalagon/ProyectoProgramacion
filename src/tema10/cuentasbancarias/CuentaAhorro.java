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
public class CuentaAhorro extends CuentaCorriente {

    private double interes;

    public CuentaAhorro(double interes, Titular titular, NumeroDeCuenta numeroDeCuenta, double saldo) {
        super(titular, numeroDeCuenta, saldo);
        this.interes = interes;
    }

    public CuentaAhorro(double interes, Titular titular, NumeroDeCuenta numeroDeCuenta) {
        super(titular, numeroDeCuenta, 15.3);
        this.interes = interes;
    }

    public CuentaAhorro(Titular titular, NumeroDeCuenta numeroDeCuenta) {
        super(titular, numeroDeCuenta, 15.3);
        this.interes = 2.5;
    }

    public double getInteres() {
        return interes;
    }
    public void calcularInteres(){
        double aux= getSaldo() + (getSaldo() * (this.interes/100));
      setSaldo(aux);
    }
}
