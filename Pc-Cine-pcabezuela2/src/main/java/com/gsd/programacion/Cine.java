package com.gsd.programacion;

public class Cine {
    private Peliculas pelicula;
    private double precio;
    private Asiento[][] asientos;

    public Cine(Peliculas pelicula, float precio) {
        this.pelicula = pelicula;
        this.precio = precio;
        this.asientos = new Asiento[8][9];
        generarAsientos();
    }

    private void generarAsientos() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < 9; j++) {
                asientos[i][j] = new Asiento((char) ('A' + j), 8 - i);
            }
        }
    }

    public boolean edadPermitida(Espectador e) {
    	return e.getEdad() >= this.pelicula.getEdadMin();
    }
    
    public boolean dineroSuficiente(Espectador e) {
    	return e.getDinero() >= precio;
    }

    public boolean haySitio() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                if (!asientos[i][j].isOcupado()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void sentarEspectador(Espectador e) {
        if (!edadPermitida(e)) {
            System.err.println(e.getNombre() + " no tiene edad suficiente para ver " + pelicula.getTitulo());
            return;
        }
        if (!dineroSuficiente(e)) {
            System.err.println(e.getNombre() + " no tiene dinero suficiente para " + pelicula.getTitulo());
            return;
        }
        if (!haySitio()) {
            System.err.println("Cine lleno para la sesión de " + pelicula.getTitulo());
            return;
        }

        boolean sentado = false;
        while (!sentado) {
            int fila = (int) (Math.random() * 8);
            int columna = (int) (Math.random() * 9);

            if (!asientos[fila][columna].isOcupado()) {
                asientos[fila][columna].ocupar();
                sentado = true;
                System.out.println(e.getNombre() + " se ha sentado en la butaca " + asientos[fila][columna]);
            }
        }
    }
    
    public void imprimirButacas() {
        System.out.println("-----------CINE-----------");
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                if (asientos[i][j].isOcupado()) {
                    System.out.print("[X]\t"); 
                } else {
                    System.out.print(asientos[i][j] + "\t"); 
                }
            }
            System.out.println();
        }
    }

}
