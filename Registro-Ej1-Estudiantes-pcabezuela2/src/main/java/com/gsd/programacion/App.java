package com.gsd.programacion;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
    	Persona p1 = new Persona("Pepe", 1234, 15, "1DAW", new ArrayList<Double>());
    	Persona p2 = new Persona("Ana", 2547, 10, "1DAW", new ArrayList<Double>());
    	
    	Escuela es1 = new Escuela();
    	
    	es1.aniadirEstudiante(p1);
    	es1.aniadirEstudiante(p2);
    	
    	es1.mostrarEstudiantes();
    	
    	System.out.println();
    	es1.aniadirNota(1234, 10);
    	es1.aniadirNota(1234, 7);
    	es1.aniadirNota(2547, 8);
    	es1.aniadirNota(234, 5.5);
    	
    	es1.mostrarEstudiantes();
    	
    	System.out.println();
    	es1.actualizarInfoEstu(1234, 18, "2DAW");
    	es1.buscarEstudiante("pepe");
    	
    	System.out.println();
    	es1.calcularMediaNotas();
    }
}
