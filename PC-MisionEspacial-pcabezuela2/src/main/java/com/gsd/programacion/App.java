package com.gsd.programacion;

public class App {
    public static void main(String[] args) {
        try {
			Destino d1 = new Destino ("Messi", 10);
			Exploradora a2 = new Exploradora("Manolo", 50, 5, d1);
			Militar m1 = new Militar("Militar", 80, 5, null, 50);
			m1.viajar(d1);
			m1.mostrarReporte();
		} catch (EstadisticaInvalidaException | CombustibleInsuficienteException e) {
			System.err.println("Error: "+ e.getMessage()); 
		} 
    }
}
