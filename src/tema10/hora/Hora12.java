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
/*
Codifica ahora la clase Hora12 que funciona de forma similar a la clase Hora, 
con la diferencia de que las horas solo pueden tomar un valor entre 1 y las 12 y se distingue la mañana de la
tarde mediante “am” o “pm” (crea para esto un enumerado). Modifica la funcionalidad de aquellos métodos que consideres oportuno.
 */
public class Hora12 extends Hora {

    private FranjaHoraria franja;

    public Hora12(FranjaHoraria franja, int hora, int minutos) {
        super(hora, minutos);
        this.franja = franja;
    }

    @Override
    public void setHora(int horas) {
        if (horas > 0 && horas < 13) {
            super.setHora(horas);
        }
    }

    @Override
    public void inc() {
        super.setMinutos(this.getHora());
        comprueba();

    }

    private void comprueba() {
        if (this.getMinutos() > 59) {
            super.setHora((super.getHora() + 1));
            super.setMinutos(0);

            if (super.getHora() == 12 && super.getMinutos() == 0) {
                if (this.franja == FranjaHoraria.AM) {
                    this.franja = FranjaHoraria.PM;
                } else {
                    this.franja = FranjaHoraria.AM;
                }
            }
        }
        if (super.getHora() > 12) {
            this.franja = FranjaHoraria.PM;
        }
    }

}
