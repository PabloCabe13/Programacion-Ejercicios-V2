package com.gsd.programacion;

import java.util.*;

public class App {
    public static void main(String[] args) {
    	if(args.length != 1) {
    		System.err.println("Argumentos Vacíos");
    	}
        //try {
        	
			for(int i = 0 ; i < args.length; i++) {
				 String datosLimpios = args[i].replace("naves:", "").replace("destinos:", "");
				 String [] partes = datosLimpios.split(";");	
				 String [] naves = partes[0].split(",");
				 String [] destinos = partes[1].split(",");
				 
				 System.out.println(Arrays.toString(naves));
				 System.out.println(Arrays.toString(destinos));
				 
				 for (int j = 0; j < naves.length; j++) {
					String [] nave = naves[i].split("-");
					switch(nave[0]) {
						case "exploradora":
							//Exploradora exploradora = new Exploradora();
					}
				}
			}
			
			
			
			
		/*} catch (EstadisticaInvalidaException | CombustibleInsuficienteException e) {
			System.err.println("Error: "+ e.getMessage()); 
		} */
    }
}
