package com.gsd.programacion;

public class Asiento {
    private char columna;
    private int fila;
    private boolean ocupado = false;

    public Asiento(char columna, int fila) {
        this.columna = columna;
        this.fila = fila;
    }

    public boolean isOcupado() { return ocupado; }
    public void ocupar() { this.ocupado = true; }

    @Override
    public String toString() {
    	  return fila + "" + columna;
    }
}

