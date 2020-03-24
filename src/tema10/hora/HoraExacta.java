/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.hora;

/**
 *
 * @author Sergio
 */
public class HoraExacta extends Hora implements Comparable<HoraExacta> {

    private int segundos;

    public HoraExacta() {
        this(0, 0, 0);
    }

    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos);
        setSegundos(segundos);
    }

    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos <= 59) {
            this.segundos = segundos;
        } else {
            System.out.println("Introduce un valor entre 0 y 59");
        }
    }

    public void inc() {
        this.segundos = this.segundos + 1;
        if (this.segundos == 60) {
            this.segundos = 0;
            super.inc();
        }
    }

    @Override
    public String toString() {
        return super.toString() + ":" + segundos;
    }

    public int getSegundos() {
        return segundos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + super.getHora();
        hash = 59 * hash + super.getMinutos();
        hash = 59 * hash + this.segundos;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass() == getClass()) {
            final HoraExacta aux = (HoraExacta) obj;
            if (aux.getHora() == getHora() && aux.getMinutos() == getMinutos() && aux.getSegundos() == getSegundos()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int compareTo(HoraExacta o) {
        if (super.getHora() < o.getHora()) {
            return -1;
        } else if (super.getHora() > o.getHora()) {
            return 1;
        } else {
            if (super.getMinutos() < o.getMinutos()) {
                return -1;
            } else if (super.getMinutos() > o.getMinutos()) {
                return 1;
            } else {
                if (this.getSegundos() < o.getSegundos()) {
                    return -1;
                } else if (this.getSegundos() > o.getSegundos()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }
}
