package com.gsd.programacion;

public class Fecha {
    private int anio;
    private int mes;
    private int dia;

    public Fecha(int anio, int mes, int dia) {
        if (esFechaValida(dia, mes, anio)) {
            this.anio = anio;
            this.mes = mes;
            this.dia = dia;
        } else {
            this.anio = 2000; this.mes = 1; this.dia = 1;
        }
    }

    private boolean esFechaValida(int dia, int mes, int anio) {
        if (mes < 1 || mes > 12) return false;
        return dia >= 1 && dia <= diasEnMes(mes, anio);
    }

    private int diasEnMes(int mes, int anio) {
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) return 30;
        if (mes == 2) return (esBisiesto(anio)) ? 29 : 28;
        return 31;
    }

    private boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%d", dia, mes, anio);
    }
}
