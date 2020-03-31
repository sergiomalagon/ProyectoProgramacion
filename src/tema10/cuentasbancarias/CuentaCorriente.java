/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.cuentasbancarias;

import java.util.Objects;

/**
 *
 * @author Sergio
 */
public class CuentaCorriente {

    private Titular titular;
    private NumeroDeCuenta numeroDeCuenta;
    private double saldo;

    public CuentaCorriente(Titular titular, NumeroDeCuenta numeroDeCuenta, double saldo) {
        if (titular != null) {
            this.titular = titular;
        }else{
            this.titular=new Titular("desconocido", "desconocido", 0);
        }

        this.numeroDeCuenta = numeroDeCuenta;
        if (saldo > 0) {
            this.saldo = saldo;
        }

    }

    public CuentaCorriente(Titular titular, NumeroDeCuenta numeroDeCuenta) {
        this.titular = titular;
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = 15.3;
    }

    public Titular getTitular() {
        return titular;
    }

    public NumeroDeCuenta getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean ingresar(double cantidad) {
        if(cantidad>0){
           this.saldo = this.saldo + cantidad; 
           return true;
        }
        return false;
        
    }

    public boolean reintegro(double cantidad) {
        if(this.saldo>=cantidad){
            this.saldo = this.saldo - cantidad;
            return true;
        }
        return false;
        
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "numeroDeCuenta=" + numeroDeCuenta + ", saldo=" + saldo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.numeroDeCuenta);
        return hash;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CuentaCorriente other = (CuentaCorriente) obj;
        if (!Objects.equals(this.numeroDeCuenta, other.numeroDeCuenta)) {
            return false;
        }
        return true;
    }
    
    

}
