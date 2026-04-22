package com.gsd.programacion;
import java.util.*;
public class App {
    public static void main(String[] args) {
    	Empresa empresa = new Empresa();
    	
    	Empleado e1 = new Empleado(1,"Pablo" , 18, 10000.0, new ArrayList<Habilidad>());
    	Empleado e2 = new Empleado(2,"Andres" , 18, 4000.0, new ArrayList<Habilidad>());
    	Empleado e3 = new Empleado(3,"Darius" , 18, 2000.0, new ArrayList<Habilidad>());
    
    	Habilidad h1 = new Habilidad("Trabajo en Equipo", "Alto");
    	Habilidad h2 = new Habilidad("Rápidez", "Medio");
    	Habilidad h3 = new Habilidad("Resolucion de Problemas", "Alto");
    	Habilidad h4 = new Habilidad("Compresión con el Usuario", "Medio");
    	Habilidad h5 = new Habilidad("Analista de Datos", "Bajo");
    	
    	e1.aniadirHabilidad(h1);
    	e1.aniadirHabilidad(h3);
    	e2.aniadirHabilidad(h2);
    	e2.aniadirHabilidad(h4);
    	e3.aniadirHabilidad(h5);
    	
    	empresa.aniadirEmpleado(e1);
    	empresa.aniadirEmpleado(e2);
    	empresa.aniadirEmpleado(e3);
    	empresa.aniadirEmpleado(e1);
    	
    	empresa.mostrarEmpleados();
    	empresa.calcularSalarioPromedio();
    }
}
