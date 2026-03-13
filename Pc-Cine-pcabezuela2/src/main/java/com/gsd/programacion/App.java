package com.gsd.programacion;

public class App {
    public static void main(String[] args) {
    	
        Peliculas peli = new Peliculas("Forrest Gump", 180, 12, "Tom Hanks");
        
        Cine cine = new Cine(peli, (float) 9.50);

 
        String[] nombres = {"Pablo", "Yassin", "Javi", "Luis"};
        
        System.out.println("--- Pelicula ---");
        for (int i = 0; i < 5; i++) {
        	String nombre = nombres[(int)(Math.random() * nombres.length)]; 
            int edad = (int) (Math.random() * 30); 
            double dinero = Math.random() * 20;   
            Espectador e = new Espectador(nombre, edad, dinero);
            cine.sentarEspectador(e);
        }
        cine.imprimirButacas();
    }
}
