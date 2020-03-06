/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.meses;

import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public enum Meses {
    ENERO(31),
    FEBRERO(29),
    MARZO(31),
    ABRIL(30),
    MAYO(31),
    JUNIO(30),
    JULIO(31),
    AGOSTO(31),
    SEPTIEMBRE(30),
    OCTUBRE(31),
    NOVIEMBRE(30),
    DICIEMBRE(31);

    private int dias;
    Calendar fecha1, fecha2, fechaTotal;

    private Meses(int dias) {
        this.dias = dias;
        this.fecha1 = new GregorianCalendar();
        this.fecha2 = new GregorianCalendar();
        this.fechaTotal = new GregorianCalendar();
    }

    public int getDias() {
        return dias;
    }

    public int diasTrasncurridos() {
        fecha1.set(fechaTotal.get(Calendar.YEAR), fechaTotal.get(Calendar.MONTH), 1);
        //  GregorianCalendar gl2 = new GregorianCalendar(2020, aux, 1);

        fecha2.set(fechaTotal.get(Calendar.YEAR), 0, 1);
        //  GregorianCalendar gl = new GregorianCalendar(2020, 0, 1);

        long diff = fecha1.getTimeInMillis() - fecha2.getTimeInMillis();
        int diasDiferencia = (int) (diff / (1000 * 60 * 60 * 24));
        return diasDiferencia;
    }

    public int diasEstaciones(String estacion) {
        switch (estacion) {
            case "primavera":
                fecha1.set(fechaTotal.get(Calendar.YEAR), fechaTotal.get(Calendar.MONTH), fechaTotal.get(Calendar.DAY_OF_MONTH));
                fecha2.set(fechaTotal.get(Calendar.YEAR), 2, 21);
                long diffPrimavera = fecha2.getTimeInMillis() - fecha1.getTimeInMillis();
                int diasPrimavera = (int) (diffPrimavera / (1000 * 60 * 60 * 24));
                return diasPrimavera;
            case "verano":
                fecha1.set(fechaTotal.get(Calendar.YEAR), fechaTotal.get(Calendar.MONTH), fechaTotal.get(Calendar.DAY_OF_MONTH));
                fecha2.set(fechaTotal.get(Calendar.YEAR), 5, 21);
                long diffVerano = fecha2.getTimeInMillis() - fecha1.getTimeInMillis();
                int diasVerano = (int) (diffVerano / (1000 * 60 * 60 * 24));
                return diasVerano;
            case "oto�o":
                fecha1.set(fechaTotal.get(Calendar.YEAR), fechaTotal.get(Calendar.MONTH), fechaTotal.get(Calendar.DAY_OF_MONTH));
                fecha2.set(fechaTotal.get(Calendar.YEAR), 8, 21);
                long diffOto�o = fecha2.getTimeInMillis() - fecha1.getTimeInMillis();
                int diasOto�o = (int) (diffOto�o / (1000 * 60 * 60 * 24));
                return diasOto�o;
            case "invierno":
                fecha1.set(fechaTotal.get(Calendar.YEAR), fechaTotal.get(Calendar.MONTH), fechaTotal.get(Calendar.DAY_OF_MONTH));
                fecha2.set(fechaTotal.get(Calendar.YEAR), 11, 21);
                long diffInvierno = fecha2.getTimeInMillis() - fecha1.getTimeInMillis();
                int diasInvierno = (int) (diffInvierno / (1000 * 60 * 60 * 24));
                return diasInvierno;
        }
        return 0;
    }

    public int diasEsteMes(int a�o) {
        if (Year.isLeap(año) && ordinal() == 1) {
            return dias;
        }
        return dias - 1;
    }

    public int diasNocheVieja() {
        GregorianCalendar fechaActual = new GregorianCalendar(GregorianCalendar.YEAR, GregorianCalendar.MONTH, GregorianCalendar.DAY_OF_MONTH);
        GregorianCalendar fechaNocheVieja = new GregorianCalendar(GregorianCalendar.YEAR, 11, 31);
        fecha1.set(fechaTotal.get(Calendar.YEAR), fechaTotal.get(Calendar.MONTH), fechaTotal.get(Calendar.DAY_OF_MONTH));
        fecha2.set(fechaTotal.get(Calendar.YEAR), 11, 31);
        //long diffNocheVieja = fecha2.getTimeInMillis() - fecha1.getTimeInMillis();
        long diffNocheVieja = fechaNocheVieja.getTimeInMillis() - fechaActual.getTimeInMillis();
        int diasNocheVieja = (int) (diffNocheVieja / (1000 * 60 * 60 * 24));
        return diasNocheVieja;
    }
}

class RunMeses {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Meses febrero = Meses.FEBRERO;
        System.out.println("Dias transcurridos desde el inicio del a�o hasta el inicio de este mes: " + febrero.diasTrasncurridos());
        System.out.println("Introduce una estacion [primavera,verano,oto�o,invierno]");
        String estacion = sc.next();
        System.out.println("" + febrero.diasEstaciones(estacion.toLowerCase()));
        System.out.println("Introduce un a�o");
        int a�o = sc.nextInt();
        System.out.println("" + febrero.diasEsteMes(a�o));
        System.out.println("Dias hasta noche vieja: " + febrero.diasNocheVieja());

    }
}
