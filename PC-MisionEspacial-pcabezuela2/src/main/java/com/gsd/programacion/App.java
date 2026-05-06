package com.gsd.programacion;

public class App {
    public static void main(String[] args) {
        try {
			Carga a1 = new Carga("Pepe", 100, 5, null, 600);
			Destino d1 = new Destino ("Messi", 500);
			Exploradora a2 = new Exploradora("Manolo", 50, 5, d1);
			a1.mostrarReporte();
		} catch (NaveInvalidaException e) {
			System.err.println("Error: "+ e.getMessage()); 
		}
    }
}
