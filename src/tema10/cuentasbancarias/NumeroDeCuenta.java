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
public class NumeroDeCuenta {

    private String banco;
    private String sucursal;
    private String digitoControl;
    private String numeroCuenta;

    public NumeroDeCuenta(String banco, String sucursal, String digitoControl, String numeroCuenta) {
        if (banco.length() == 4) {
            this.banco = banco;
        }
        if (sucursal.length() == 4) {
            this.sucursal = sucursal;
        } else {
            if(sucursal.length() < 4){
                String aux="000"+sucursal;
                this.sucursal=aux.substring(aux.length()-4, aux.length());
            }
        }
        if (digitoControl.length() == 2) {
            this.digitoControl = digitoControl;

        } else {
            System.out.println("Introduce 2 digitos de digitos de control");
        }
        if (numeroCuenta.length() == 10) {
            this.numeroCuenta = numeroCuenta;
        } else {
            System.out.println("Introduce 10 digitos de numero de cuenta");
        }
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getDigitoControl() {
        return digitoControl;
    }

    public void setDigitoControl(String digitoControl) {
        this.digitoControl = digitoControl;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.banco);
        hash = 41 * hash + Objects.hashCode(this.sucursal);
        hash = 41 * hash + Objects.hashCode(this.digitoControl);
        hash = 41 * hash + Objects.hashCode(this.numeroCuenta);
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
        final NumeroDeCuenta other = (NumeroDeCuenta) obj;
        if (!Objects.equals(this.banco, other.banco)) {
            return false;
        }
        if (!Objects.equals(this.sucursal, other.sucursal)) {
            return false;
        }
        if (!Objects.equals(this.digitoControl, other.digitoControl)) {
            return false;
        }
        if (!Objects.equals(this.numeroCuenta, other.numeroCuenta)) {
            return false;
        }
        return true;
    }

}
